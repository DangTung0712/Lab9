package Lesson09.Lab.country.asia;

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
        List<AsiaCountry> asian = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        boolean run =true;
        while (run){
            menu();
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(s.nextLine());
            switch (choice){
                case 1:
                    System.out.print("Nhập số lượng quốc qia:");
                    int n = Integer.parseInt(s.nextLine());
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Nhập thông tin Truck thứ "+(i+1)+": ");
                        AsiaCountry asiaCountry = new AsiaCountry();
                        asiaCountry.input();
                        asian.add(asiaCountry);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách thông tin Car:");
                    for (AsiaCountry asiaCountry:asian){
                        asiaCountry.display();
                        System.out.println("--------------------");
                    }

                    break;
                case 3:

                    List<AsiaCountry> listSort = new ArrayList<>();
                    listSort.addAll(asian);
                    Collections.sort(listSort,(x, y)->{return (int) (x.getArea()-y.getArea());});
                    System.out.println("Danh sách xắp xếp theo diện tích: ");
                    for (AsiaCountry asiaCountry : listSort) {
                        asiaCountry.display();
                        System.out.println("--------------------");
                    }

                    break;
                case 4:

                    System.out.print("Nhập từ khoá cần tìm: ");
                    String keyword = s.nextLine();
                    for (AsiaCountry asiaCountry:asian){
                        if(asiaCountry.getCountryName().contains(keyword))
                            asiaCountry.display();
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
