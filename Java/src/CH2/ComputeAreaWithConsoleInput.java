package CH2;

import java.util.Scanner;

/**
 * Created by Tino on 2015/12/6.
 */
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * 3.14159;

        System.out.print("The area for the circle of radius " + radius + "is " + area);
    }
}