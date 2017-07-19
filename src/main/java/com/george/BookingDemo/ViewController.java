package com.george.BookingDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by George on 7/19/2017.
 */
@Controller
public class ViewController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
