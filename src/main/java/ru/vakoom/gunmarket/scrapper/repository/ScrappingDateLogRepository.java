package ru.vakoom.gunmarket.scrapper.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vakoom.gunmarket.scrapper.model.ScrappingDateLog;

@Repository
public interface ScrappingDateLogRepository extends CrudRepository<ScrappingDateLog, Long> {
}
