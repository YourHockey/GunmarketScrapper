package ru.vakoom.gunmarket.scrapper.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vakoom.gunmarket.commondatalayer.model.Product;
import ru.vakoom.gunmarket.scrapper.model.MatcherOffer;

import java.util.Optional;

@Repository
public interface MatcherOfferRepository extends CrudRepository<MatcherOffer, Long> {

    MatcherOffer findByLink(String link);

    Optional<MatcherOffer> findByProductInShopId(String productInShopId);

    default void saveOrUpdate(MatcherOffer matcherOffer) {
        this.findByProductInShopId(matcherOffer.getProductInShopId()).ifPresentOrElse((m) -> {
            this.save(matcherOffer.setId(m.getId()));
        }, () -> {
            this.save(matcherOffer);
        });
    }
}
