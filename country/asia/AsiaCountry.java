package Lesson09.Lab.country.asia;

import Lesson09.Lab.country.Country;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AsiaCountry extends Country {
    private String location;
    public void input() {
        Scanner s= new Scanner(System.in);
        super.input();
        System.out.print("Input CountryName: ");
        location = s.nextLine();

    }
    public void display() {
        super.display();
        System.out.println("Location: "+location);

    }
    public float everageArea() {
        return super.everageArea(super.getArea(),super.getNumberPerson());
    }
}
