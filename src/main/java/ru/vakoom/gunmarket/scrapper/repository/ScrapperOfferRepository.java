package ru.vakoom.gunmarket.scrapper.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vakoom.gunmarket.scrapper.model.ScrapperOffer;

@Repository
public interface ScrapperOfferRepository extends CrudRepository<ScrapperOffer, Long> {
}
