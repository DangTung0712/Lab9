package Lesson09.Lab.vehicle.truck;

import Lesson09.Lab.vehicle.Vehicles;
import Lesson09.Lab.vehicle.car.Car;

import java.util.Scanner;

public class Truck extends Vehicles {
    private int truckLoad;
    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập Maker: ");
        super.setMaker(stringInput(s));
        System.out.print("Nhập Model: ");
        super.setModel(stringInput(s));
        System.out.print("Nhập Price: ");
        super.setPrice(floatInput(s));
        System.out.print("Nhập TruckLoad: ");
        truckLoad = intInput(s);
    }

    @Override
    public String toString() {
        return "Truck{ " +
                "maker='" + super.getMaker() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", price=" + super.getPrice() +
                ", truckLoad='" + truckLoad + '\'' +
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
        Truck truck =new Truck();
        truck.input();
        truck.display();
    }
}
