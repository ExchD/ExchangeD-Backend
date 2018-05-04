package com.ExchD.ExchangeD.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(path = "/helloWorld")
    public ResponseEntity<?> helloWorld() {
        String message = "Hello World!";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}
