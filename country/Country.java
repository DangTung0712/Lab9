package Lesson09.Lab.country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country implements ICountry{
    private String countryName;
    private double area;
    private long numberPerson;
    @Override
    public void input() {
        Scanner s= new Scanner(System.in);
        System.out.print("Input CountryName: ");
        countryName = s.nextLine();
        System.out.print("Input Area: ");
        area = Double.parseDouble(s.nextLine());
        System.out.print("Input NumberPerson: ");
        numberPerson = Long.parseLong(s.nextLine());
    }

    @Override
    public void display() {
        System.out.println("CountryName: "+countryName);
        System.out.println("Area: "+area);
        System.out.println("NumberPerson: "+numberPerson);
    }

    @Override
    public float everageArea(double area, long numberPerson) {
        return (float) area/numberPerson;
    }
}
