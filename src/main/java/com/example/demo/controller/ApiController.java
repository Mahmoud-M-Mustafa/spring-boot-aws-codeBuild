package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("api/health")
    public ResponseEntity<?> healthCheck()
    {

        //printsdjfhs shdfu
        //dfgdf

        return ResponseEntity.ok("build 1gh3");
    }
}
