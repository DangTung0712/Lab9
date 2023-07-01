package Lesson09.Lab.vehicle.test;

import Lesson09.Lab.vehicle.car.Car;
import Lesson09.Lab.vehicle.truck.Truck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void menu(){
        System.out.println("=====Danh sách chức năng=====");
        System.out.println("1.Thêm thông tin");
        System.out.println("2.Hiển thị danh sách");
        System.out.println("3.Sắp xếp danh sách");
        System.out.println("4.Tìm kiếm thông tin");
        System.out.println("5.Thoát chương trình");
        System.out.println("=============================");

    }
    public static void main(String[] args) {
        List<Car> listCar = new ArrayList<>();
        List<Truck> listTruck = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        boolean run =true;
        while (run){
            menu();
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(s.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập thông tin Car:");
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Nhập thông tin Car thứ "+(i+1)+": ");
                        Car car = new Car();
                        car.input();
                        listCar.add(car);

                    }
                    System.out.println("Nhập thông tin Truck:");
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Nhập thông tin Truck thứ "+(i+1)+": ");
                        Truck truck = new Truck();
                        truck.input();
                        listTruck.add(truck);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách thông tin Car:");
                    for (Car car:listCar){
                        car.display();
                    }
                    System.out.println("Danh sách thông tin Truck:");
                    for (Truck truck:listTruck){
                        truck.display();
                    }
                    break;
                case 3:
                    List<Car> carSort = new ArrayList<>();
                    carSort.addAll(listCar);
                    List<Truck> truckSort = new ArrayList<>();
                    truckSort.addAll(listTruck);
                    Collections.sort(carSort,(x, y)->{return (int) (x.getPrice()-y.getPrice());});
                    Collections.sort(truckSort,(x, y)->{return (int) (x.getPrice()-y.getPrice());});
                    System.out.println("Danh sách xắp xếp theo giá: ");
                    for (Car car : carSort) {
                        car.display();
                    }
                    System.out.println("--------------------------");
                    for (Truck truck : truckSort) {
                        truck.display();
                    }
                    break;
                case 4:

                    System.out.print("Nhập từ khoá cần tìm: ");
                    String keyword = s.nextLine();
                    for (Car car:listCar){
                        if(car.getMaker().contains(keyword))
                            car.display();
                    }
                    for (Truck truck:listTruck){
                        if(truck.getMaker().contains(keyword))
                            truck.display();
                    }
                    break;
                case 5:
                    System.out.println("Thoát chương trình thành công!!!");
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }
}
