package ru.vakoom.gunmarket.scrapper.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
import ru.vakoom.gunmarket.commondatalayer.model.Shop;
import ru.vakoom.gunmarket.scrapper.exception.ShopNotFoundException;
import ru.vakoom.gunmarket.scrapper.repository.ShopRepo;

@Service
@RequiredArgsConstructor
public class ShopService {

    private final ShopRepo shopRepo;

    public Shop getByName(String name) {
        return shopRepo.findByName(name).orElseThrow(ShopNotFoundException::new);
    }

}
