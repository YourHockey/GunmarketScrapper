package ru.vakoom.gunmarket.scrapper.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vakoom.gunmarket.scrapper.model.ShopDto;

@Service
@RequiredArgsConstructor
public class ShopService {

    @Deprecated(since = "Переделать на нормальный вызов")
    public ShopDto getByName(String name) {
        return new ShopDto();
    }

}
