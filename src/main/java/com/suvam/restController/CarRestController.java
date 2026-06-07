package com.suvam.restController;

import com.suvam.car.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarRestController {

    @GetMapping("/cars")
    public List<Car> getCar() {
        return List.of(
                new Car(
                        1,
                        "Lamborghini",
                        9000000.99
                ),
                new Car(
                        2,
                        "Bugatti",
                        19000000
                ),
                new Car(
                        3,
                        "Porsche",
                        9999999
                ));
    }
}
