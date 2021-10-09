package ru.vakoom.gunmarket.scrapper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vakoom.gunmarket.commondatalayer.model.Shop;

import java.util.Optional;

public interface ShopRepo extends JpaRepository<Shop, Long> {
    Optional<Shop> findByName(String name);
}
