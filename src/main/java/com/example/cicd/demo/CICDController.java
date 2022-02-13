package com.example.cicd.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {

    @GetMapping("/test")
    public String CICDTest(){
        return "CICD test successfully";
    }
}
