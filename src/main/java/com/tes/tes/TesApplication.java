package com.tes.tes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class TesApplication {

    public static void main(String[] args) {
        
        SpringApplication.run(TesApplication.class, args);
    }


    @PostMapping("/tes")
    public String tes(){
        return "";
    }
}
