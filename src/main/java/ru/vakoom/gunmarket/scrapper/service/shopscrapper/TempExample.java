package ru.vakoom.gunmarket.scrapper.service.shopscrapper;

@Deprecated
public class TempExample {

    /*
    @Slf4j
@Service
public class HockeyBezGranizScrapper extends Scrapper {

    public void afterPropertiesSet() {
        scrapperMeta = ScrapperMeta.fromJson("web-shop-config/hockeybezgranic.json");
    }

    @Override
    public Integer defineCountOfPages(Document fullCategoryDoc) {
        int lastPageNumber = 1;
        Elements pageNav = fullCategoryDoc.getElementsByClass("page-nav");
        if (pageNav.isEmpty()) return lastPageNumber;
        for (Element hrefE : pageNav.get(0).getElementsByAttribute("href")) {
            int currentPageNumber = Integer.parseInt(hrefE.text());
            if (lastPageNumber < currentPageNumber) {
                lastPageNumber = currentPageNumber;
            }
        }
        return lastPageNumber;
    }
}


@Slf4j
@Service
public class SportDepoScrapper extends Scrapper {
    @PostConstruct
    public void afterPropertiesSet() {
        scrapperMeta = ScrapperMeta.fromJson("web-shop-config/sprotdepo.json");
    }

    @Override
    public Offer postHandle() {
        Offer baseOffer = offer;
        if (!offer.getInStore()) {
            getDocByUrl(offer.getLink())
                .ifPresent(doc -> {
                    Elements elements = doc.getElementsByClass("inet_big");
                    if (!elements.isEmpty()) {
                        if (elements.get(0).text().toLowerCase().contains("добавить в корзину")) {
                            baseOffer.setInStore(true);
                        }
                    }
                });
        }
        return baseOffer;
    }

    @Override
    public Integer defineCountOfPages(Document fullCategoryDoc) {
        Elements paginationElements = fullCategoryDoc.getElementsByClass("page_list");
        if (paginationElements.isEmpty()) {
            return 1;
        }
        return paginationElements.get(0).getElementsByTag("a").stream()
                .map(Element::text)
                .filter(StringUtil::isNumeric)
                .mapToInt(Integer::parseInt)
                .max().getAsInt();
    }
}
     */

}
