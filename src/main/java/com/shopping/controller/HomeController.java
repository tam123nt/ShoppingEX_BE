package com.shopping.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
@CrossOrigin("*")
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ResponseEntity<String> getAllProduct() {
        return new ResponseEntity<>("Home Page", HttpStatus.OK);
    }
}