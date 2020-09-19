package com.vcr.rps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author chicovi
 */
@Controller
public class GameController {
    
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
}
