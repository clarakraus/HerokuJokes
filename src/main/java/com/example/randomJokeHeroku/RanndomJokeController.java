package com.example.randomJokeHeroku;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jokesonyou")

public class RanndomJokeController {
    @GetMapping()
    public String joke(){
        return "You're the joke";
    }
}
