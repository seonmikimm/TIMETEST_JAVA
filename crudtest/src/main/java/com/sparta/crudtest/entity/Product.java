package com.sparta.crudtest.entity;

import com.sparta.crudtest.dto.RequestUpdatePriceDto;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Product extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private int qty;

    @Column
    private int price;

    @Builder
    public Product (String name, int qty, int price){
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public void updatePrice(RequestUpdatePriceDto requestUpdatePriceDto){
        this.price = requestUpdatePriceDto.getPrice();
    }

}
