package com.suvam.bike;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Bike {
    private int id;
    private String brand;
    private double price;
}
