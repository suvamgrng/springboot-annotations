package com.suvam.requestMapping;

import com.suvam.bike.Bike;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bike") // @RequestMapping with Class
public class BikeRequestMapping {

    @RequestMapping("/mercedes") // @RequestMapping with Method
    public Bike getMercedes() {
        return new Bike(
                1,
                "Mercedes",
                100000
        );
    }

    @RequestMapping(value = {"/bike-yamaha", "/yamaha", "/Yamaha" }) // @RequestMapping with multiple URL path in same method
    public Bike getYamaha() {
        return new Bike(
                2,
                "Yamaha",
                150000
        );
    }

    // Only GET requests allowed
    @RequestMapping(
            value = "/honda",
            method = RequestMethod.GET
    ) // @RequestMapping with HTTP Method
    public Bike getHonda() {
        return new Bike(
                4,
                "Honda",
                150000
        );
    }

    @RequestMapping(
            value = {"/Bugatti"},
            method = RequestMethod.GET,
            produces = "application/json", // Plain String
            consumes = MediaType.APPLICATION_JSON_VALUE // Built-in Spring Constant
    )
    public Bike getBugatti() {
        return new Bike(
                3,
                "Bugatti",
                899999
        );
    }
}
