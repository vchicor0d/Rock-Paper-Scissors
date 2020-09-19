package com.vcr.rps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author chicovi
 */
@Controller
public class ScoresController {
    
    @GetMapping("/statistics")
    public String statistics() {
        return "scores";
    }
    
}
