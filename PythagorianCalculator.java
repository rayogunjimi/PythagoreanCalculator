package pythagorian.calculator;
import java.util.Scanner;
public class PythagorianCalculator {

    public static void main(String[] args) {
        double a, b, c;

        System.out.println("Enter a leg of the right triangle:");
        Scanner leg1 = new Scanner(System.in);
        a = leg1.nextDouble();

        System.out.println("Enter a leg of the right triangle:");
        Scanner leg2 = new Scanner(System.in);
        b = leg2.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("The hypotenuse is  %.5f", c);
    }
}
