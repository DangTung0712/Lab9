package Lesson09.Lab.motor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Motor implements IMotor {
    private String code;
    private String name;
    private double capacity;
    private int num;

    @Override
    public void inputInfor() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập Code: ");
        code = s.nextLine();
        System.out.print("Nhập Name: ");
        name = s.nextLine();
        System.out.print("Nhập Capacity: ");
        capacity = Double.parseDouble(s.nextLine());
        System.out.print("Nhập Num: ");
        num = Integer.parseInt(s.nextLine());


    }


    @Override
    public void displayInfor() {
        System.out.println("Code: "+code);
        System.out.println("Name: "+name);
        System.out.println("Capacity: "+capacity);
        System.out.println("Num: "+num);
    }

    @Override
    public void changeInfor() {

    }
}
