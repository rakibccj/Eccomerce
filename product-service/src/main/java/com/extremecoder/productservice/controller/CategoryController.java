package com.extremecoder.productservice.controller;

import com.extremecoder.productservice.dto.CategoryRegistrationRequest;
import com.extremecoder.productservice.model.CategoryEntity;
import com.extremecoder.productservice.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService service;


    @PostMapping
    public ResponseEntity<CategoryEntity> create(@Valid @RequestBody CategoryRegistrationRequest request) {

//        Response response = ResponseBuilder.getSuccessResponse(
//                HttpStatus.OK,
//                "Created",
//                service.create(request));
        return new ResponseEntity<>(service.create(request), HttpStatus.CREATED);
    }
}
