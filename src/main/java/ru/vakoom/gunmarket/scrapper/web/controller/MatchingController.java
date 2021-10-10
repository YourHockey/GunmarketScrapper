package ru.vakoom.gunmarket.scrapper.web.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.vakoom.gunmarket.scrapper.model.MatcherOffer;
import ru.vakoom.gunmarket.scrapper.model.ProductDto;
import ru.vakoom.gunmarket.scrapper.model.ScrapperOffer;
import ru.vakoom.gunmarket.scrapper.service.MatchingService;

import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MatchingController {

    private final MatchingService matchingService;

    @CrossOrigin
    @PostMapping(value = "match", produces = MediaType.APPLICATION_JSON_VALUE)
    public String match(@RequestBody Map.Entry<ScrapperOffer, ProductDto> matchPair) {
        MatcherOffer matcherOffer = matchingService.createFromMatch(matchPair.getKey(), matchPair.getValue());
        matchingService.add(matcherOffer);
        //ToDo подумать над тем чтоюы возвращать матчер
        return matcherOffer.getProductInShopId();
    }


}
