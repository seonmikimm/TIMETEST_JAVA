package com.sparta.crudtest.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RequestUpdatePriceDto {
    private int price;

    @Builder
    public RequestUpdatePriceDto(int price) {
        this.price = price;
    }
}
