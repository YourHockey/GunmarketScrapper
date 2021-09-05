package ru.vakoom.gunmarket.scrapper.scheduler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.vakoom.gunmarket.scrapper.model.ScrapperOffer;
import ru.vakoom.gunmarket.scrapper.repository.ScrapperOfferRepository;
import ru.vakoom.gunmarket.scrapper.repository.SequenceOfferRefresher;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class ScheduleScrapperRunner {

    //    private final List<Scrapper> scrappers;
    private final ScrapperOfferRepository offerRepository;
    private final SequenceOfferRefresher sequenceOfferRefresher;
//    private final MatcherClient matcherClient;

    @Scheduled(cron = "0 0 */3 * * *") // every 3 hours
    public ResponseEntity<List<ScrapperOffer>> refreshOffers() {
        return null;
//        offerRepository.deleteAll();
//        sequenceOfferRefresher.setHibernateSequenceCurrentValueToZero();
//        List<Offer> offersForMatcherService = scrappers.parallelStream()
//                .map(Scrapper::fullCatalog)
//                .flatMap(List::stream)
//                .collect(Collectors.toList());
//        return matcherClient.sendOffers(offersForMatcherService);
    }

}
