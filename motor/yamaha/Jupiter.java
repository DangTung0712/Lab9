package Lesson09.Lab.motor.yamaha;

import Lesson09.Lab.motor.Motor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Jupiter extends Motor {
    private int warranty;
    public void inputInfor(){
        Scanner s =new Scanner(System.in);
        super.inputInfor();
        System.out.print("Nhập Warranty: ");
        warranty = Integer.parseInt(s.nextLine());
    }

    public void displayInfor() {
        super.displayInfor();
        System.out.println("Warranty: "+warranty);

    }
}
