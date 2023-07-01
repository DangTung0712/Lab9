package Lesson09.Lab.motor.yamaha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Yamaha {
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
        List<Serius> listSerius = new ArrayList<>();
        List<Jupiter> listJupiter = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        boolean run =true;
        while (run){
            menu();
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(s.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập thông tin Jupiter:");
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Nhập thông tin Jupiter thứ "+(i+1)+": ");
                        Jupiter jupiter = new Jupiter();
                        jupiter.inputInfor();
                        listJupiter.add(jupiter);

                    }
                    System.out.println("Nhập thông tin Serius:");
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Nhập thông tin Serius thứ "+(i+1)+": ");
                        Serius serius = new Serius();
                        serius.inputInfor();
                        listSerius.add(serius);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách thông tin Serius:");
                    for (Serius serius:listSerius){
                        serius.displayInfor();
                    }
                    System.out.println("Danh sách thông tin Jupiter:");
                    for (Jupiter jupiter:listJupiter){
                        jupiter.displayInfor();
                    }
                    break;
                case 3:
                    List<Serius> seriusSort = new ArrayList<>();
                    seriusSort.addAll(listSerius);
                    List<Jupiter> jupiterSort = new ArrayList<>();
                    jupiterSort.addAll(listJupiter);
                    Collections.sort(jupiterSort,(x, y)->{return (x.getWarranty()-y.getWarranty());});
                    Collections.sort(seriusSort,(x, y)->{return  (x.getWarranty()-y.getWarranty());});
                    System.out.println("Danh sách xắp xếp theo Warranty: ");
                    System.out.println("Danh sách thông tin Serius:");
                    for (Serius serius:seriusSort){
                        serius.displayInfor();
                    }
                    System.out.println("Danh sách thông tin Jupiter:");
                    for (Jupiter jupiter:jupiterSort){
                        jupiter.displayInfor();
                    }
                    break;
                case 4:
                    String keyword = "Serius";
                    System.out.println("Thông tin xe có tên Serius:");
                    for (Serius serius:listSerius){
                        if(serius.getName().contains(keyword))
                        serius.displayInfor();
                    }
                    for (Jupiter jupiter:listJupiter){
                        if(jupiter.getName().contains(keyword))
                            jupiter.displayInfor();
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
