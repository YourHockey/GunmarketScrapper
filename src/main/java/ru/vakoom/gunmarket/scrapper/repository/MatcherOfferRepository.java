package ru.vakoom.gunmarket.scrapper.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vakoom.gunmarket.scrapper.model.MatcherOffer;

@Repository
public interface MatcherOfferRepository extends CrudRepository<MatcherOffer, Long> {

    MatcherOffer findByLink(String link);

}
