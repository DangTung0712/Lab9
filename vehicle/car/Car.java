package Lesson09.Lab.vehicle.car;

import Lesson09.Lab.vehicle.IVehicle;
import Lesson09.Lab.vehicle.Vehicles;

import java.util.Scanner;

public class Car extends Vehicles{
    private String color;
    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập Maker: ");
        super.setMaker(stringInput(s));
        System.out.print("Nhập Model: ");
        super.setModel(stringInput(s));
        System.out.print("Nhập Price: ");
        super.setPrice(floatInput(s));
        System.out.print("Nhập Color: ");
        color = stringInput(s);
    }

    @Override
    public String toString() {
        return "Car{ " +
                "maker='" + super.getMaker() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", price=" + super.getPrice() +
                ", color='" + color + '\'' +
                '}';
    }

    public void display(){
        System.out.println(toString());
    }
    public String stringInput(Scanner s){
        return s.nextLine();
    }
    public int intInput(Scanner s){
        return Integer.parseInt(s.nextLine());
    }
    public float floatInput(Scanner s){
        return Float.parseFloat(s.nextLine());
    }
    public static void main(String[] args) {
        Car car =new Car();
        car.input();
        car.display();
    }
}
