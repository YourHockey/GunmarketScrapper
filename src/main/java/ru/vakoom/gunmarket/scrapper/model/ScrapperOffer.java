package ru.vakoom.gunmarket.scrapper.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Entity
@Accessors(chain = true)
public class ScrapperOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private Double price;
    private Boolean inStore;
    private String type;
    private String shopName;
    @Column(length = 1023)
    private String link;
}
