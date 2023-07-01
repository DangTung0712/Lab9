package Lesson09.Lab.vehicle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicles implements IVehicle{
    private String maker;
    private String model;
    private double price;
    @Override
    public void input() {

    }

    @Override
    public void display() {

    }
}
