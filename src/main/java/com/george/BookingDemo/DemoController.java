package com.george.BookingDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by George on 7/16/2017.
 */

@RestController
public class DemoController {
    @RequestMapping( value = "/hello")
    public String hello(){
        return "Rather be a comma than a fullstops!";
    }
}
