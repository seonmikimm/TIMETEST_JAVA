package com.sparta.crudtest.service;

import com.sparta.crudtest.dto.RequestCreateProductDto;
import com.sparta.crudtest.dto.RequestProductDto;
import com.sparta.crudtest.dto.RequestUpdatePriceDto;
import com.sparta.crudtest.entity.Product;
import com.sparta.crudtest.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public Long saveProduct(RequestCreateProductDto requestCreateProductDto){
        Product product = Product.builder()
                .name(requestCreateProductDto.getName())
                .qty(requestCreateProductDto.getQty())
                .price(requestCreateProductDto.getPrice())
                .build();
        return productRepository.save(product).getId();
    }

    public RequestProductDto findProduct(Long id){
        Product product = productRepository.findById(id).orElseThrow(
                ()-> new NullPointerException("아이디가 존재하지 않습니다")
        );
        return RequestProductDto.builder()
                .name(product.getName())
                .qty(product.getQty())
                .price(product.getPrice())
                .build();
    }

    public long modifyPrice (Long id, RequestUpdatePriceDto requestUpdatePriceDto){
        Product product = productRepository.findById(id).orElseThrow(
                ()-> new IllegalArgumentException("아이디가 존재하지 않습니다")
        );
        product.updatePrice(requestUpdatePriceDto);
        return productRepository.save(product).getId();
    }

    public long removeProduct(Long id){
        productRepository.deleteById(id);
        return id;
    }
}