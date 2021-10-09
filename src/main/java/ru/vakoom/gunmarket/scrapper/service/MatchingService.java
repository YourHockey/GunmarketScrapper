package ru.vakoom.gunmarket.scrapper.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.vakoom.gunmarket.commondatalayer.dto.OfferDto;
import ru.vakoom.gunmarket.commondatalayer.model.Product;
import ru.vakoom.gunmarket.scrapper.model.MatcherOffer;
import ru.vakoom.gunmarket.scrapper.model.ScrapperOffer;
import ru.vakoom.gunmarket.scrapper.repository.MatcherOfferRepository;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class MatchingService {

    private final MatcherOfferRepository matcherOfferRepository;
    private final ShopService shopService;

    @Deprecated(since = "Переделать нормально через стримы")
    public List<OfferDto> filterByMatched(List<ScrapperOffer> scrapperOffers) {
        return scrapperOffers.stream()
                .map(scrapper -> {
                    var matcherOffer = matcherOfferRepository.findByLink(scrapper.getLink());
                    if (matcherOffer == null) {
                        return null;
                    }
                    return new OfferDto()
                            .setProductId(matcherOffer.getProductId())
                            .setShopName(scrapper.getShopName())
                            .setInStock(scrapper.getInStore())
                            .setLink(scrapper.getLink())
                            .setPrice(scrapper.getPrice());
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    public MatcherOffer createFromMatch(ScrapperOffer scrapper, Product product) {
        Long shopId = shopService.getByName(scrapper.getShopName()).getShopId();

        return new MatcherOffer()
                .setProductInShopId(product.getProductId() + "&" + shopId)
                .setProductId(product.getProductId().toString())
                .setShopId(shopId.toString())
                .setLink(scrapper.getLink());
    }

    public void add(MatcherOffer matcherOffer) {
        matcherOfferRepository.saveOrUpdate(matcherOffer);
    }
}
