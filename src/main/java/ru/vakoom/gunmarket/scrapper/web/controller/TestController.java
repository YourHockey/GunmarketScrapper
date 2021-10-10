package ru.vakoom.gunmarket.scrapper.web.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vakoom.gunmarket.scrapper.model.DraftOffer;
import ru.vakoom.gunmarket.scrapper.service.RefreshingService;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TestController {

    private final RefreshingService refreshingService;

    @CrossOrigin
    @GetMapping(value = "/refreshOffers", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DraftOffer> testRefresh() {
        return refreshingService.refreshOffers();
    }

}
