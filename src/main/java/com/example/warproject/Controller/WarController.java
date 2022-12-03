package com.example.warproject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarController {
    @GetMapping("/war")
    public String war() {
        return "war";
    }
}
