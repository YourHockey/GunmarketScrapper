package ru.vakoom.gunmarket.scrapper.service.client;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.vakoom.gunmarket.commondatalayer.dto.OfferDto;

import java.util.Collections;
import java.util.List;

@Component
@RequiredArgsConstructor
public class AdminClient {

    @Value("${admin-service-path}")
    public String ADMIN_SERVICE_BASE_PATH;
    public static final String ADMIN_SERVICE_REFRESH_OFFERS_PATH = "/refresh";

    private final RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity<List<OfferDto>> sendOffers(List<OfferDto> offers) {
        String url = ADMIN_SERVICE_BASE_PATH + ADMIN_SERVICE_REFRESH_OFFERS_PATH;

        return restTemplate.exchange(
                url,
                HttpMethod.POST,
                new HttpEntity<>(offers),
                new ParameterizedTypeReference<>() {
                },
                Collections.emptyMap());
    }

}
