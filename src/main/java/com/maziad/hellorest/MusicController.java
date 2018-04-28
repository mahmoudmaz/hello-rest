package com.maziad.hellorest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pl/v1.0")
public class MusicController {

    @RequestMapping("/music/all")
    public String hey(){
        return "t";
    }
}
