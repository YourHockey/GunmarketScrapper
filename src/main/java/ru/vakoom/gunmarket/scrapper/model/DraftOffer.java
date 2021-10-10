package ru.vakoom.gunmarket.scrapper.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class DraftOffer {

    private String productId;
    private String shopName;
    private Double price;
    private Boolean inStock;
    private String link;

}
