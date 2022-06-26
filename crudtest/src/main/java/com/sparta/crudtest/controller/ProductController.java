package com.sparta.crudtest.controller;

import com.sparta.crudtest.common.ApiResponse;
import com.sparta.crudtest.dto.RequestCreateProductDto;
import com.sparta.crudtest.dto.RequestUpdatePriceDto;
import com.sparta.crudtest.dto.RequestProductDto;
import com.sparta.crudtest.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ProductController {
    private final ProductService productService;

    @PostMapping ("/register")
    public ApiResponse registerProduct (@RequestBody RequestCreateProductDto requestCreateProductDto){
        long retId = productService.saveProduct(requestCreateProductDto);
        return ApiResponse.success("result", retId);
    }

    @GetMapping("/search/{id}")
    public ApiResponse searchProduct (@PathVariable Long id){
        RequestProductDto requestProductDto = productService.findProduct(id);
        return ApiResponse.success("result",requestProductDto);
    }

    @PutMapping("/update/{id}")
    public ApiResponse updatePrice (@PathVariable Long id, @RequestBody RequestUpdatePriceDto requestUpdatePriceDto){
        long retId = productService.modifyPrice(id, requestUpdatePriceDto);
        return ApiResponse.success("result",retId);
    }

    @DeleteMapping("/delete/{id}")
    public ApiResponse deleteProduct(@PathVariable Long id){
        long retId = productService.removeProduct(id);
        return ApiResponse.success("result",retId);
    }
}