package src;

import java.util.Scanner;

public class FactoryPattern_demo {
    public static void main(String[] args) {
        System.out.println("enter Shape");
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        ShapeFactory s=new ShapeFactory();
        System.out.println(s.createShape(line));
    }
}
