package ru.vakoom.gunmarket.scrapper.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.vakoom.gunmarket.commondatalayer.dto.OfferDto;
import ru.vakoom.gunmarket.scrapper.model.ScrapperOffer;
import ru.vakoom.gunmarket.scrapper.service.client.AdminClient;
import ru.vakoom.gunmarket.scrapper.service.scrappersystem.Scrapper;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class RefreshingService {

    private final Scrapper scrapper;
    private final MatchingService matchingService;
    private final AdminClient adminClient;

    public List<OfferDto> refreshOffers() {
        List<ScrapperOffer> scrapperOffers = scrapper.fullCatalog();
        List<OfferDto> offers = matchingService.filterByMatched(scrapperOffers);
        return adminClient.sendOffers(offers).getBody();
    }

}
