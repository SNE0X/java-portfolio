import java.util.Scanner;

public class Day4_NestedIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // First level check
        if (num >= 0) {

            System.out.println("Number is Positive");

            // Second level check (nested)
            if (num % 2 == 0) {
                System.out.println("Number is Even");

                // Third level check (nested inside nested)
                if (num >= 10 && num <= 50) {
                    System.out.println("Number is between 10 and 50");
                } else {
                    System.out.println("Number is NOT between 10 and 50");
                }

            } else {
                System.out.println("Number is Odd");
            }

        } else {

            System.out.println("Number is Negative");

            // Nested inside negative
            if (num % 2 == 0) {
                System.out.println("Negative Even Number");
            } else {
                System.out.println("Negative Odd Number");
            }

        }

        sc.close();
    }
}
