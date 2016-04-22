package com.example.controller;

import com.example.config.ImageServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageServiceController {

    @Autowired
    ImageServiceConfig imageServiceConfig;

    @RequestMapping(value = "/")
    ResponseEntity<?> get() {
        return new ResponseEntity(imageServiceConfig, HttpStatus.OK);
    }
}


