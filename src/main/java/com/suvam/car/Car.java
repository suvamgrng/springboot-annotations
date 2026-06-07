package com.suvam.car;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Car {
    private Integer id;
    private String name;
    private double price;
}
