package ru.vakoom.gunmarket.scrapper.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ProductDto {

    private Long productId;
    private String name;
    private String extendedName;
    private String imageUrl;
    private String brand;
    private String type;

}
