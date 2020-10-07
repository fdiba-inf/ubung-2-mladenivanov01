package exercise2;

import java.util.Scanner;


public class Circle {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a radius: ");
        int number = input.nextInt();
        double C = 3.1498629965179976*2*number;
        System.out.println("Circumference: "+ C);
        double A = 3.1498629965179976*number*number;
        System.out.println("Area: "+ A);





 }
}


