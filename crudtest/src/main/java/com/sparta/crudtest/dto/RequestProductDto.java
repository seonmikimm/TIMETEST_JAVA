package com.sparta.crudtest.dto;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class RequestProductDto {
    private String name;
    private int qty;
    private int price;

    @Builder
    public RequestProductDto(String name, int qty, int price){
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
}
