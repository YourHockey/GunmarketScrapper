package ru.vakoom.gunmarket.scrapper.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vakoom.gunmarket.scrapper.model.ShopDto;
import ru.vakoom.gunmarket.scrapper.service.client.AdminClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShopService {

    private final AdminClient adminClient;

    @Deprecated(since = "Переделать на нормальный вызов")
    public ShopDto getByName(String name) {
        List<ShopDto> shops = adminClient.getShops().getBody();
        return new ShopDto();
    }

}
