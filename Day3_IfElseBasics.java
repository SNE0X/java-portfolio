import java.util.Scanner;

public class Day3_IfElseBasics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1️⃣ Positive / Negative / Zero
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // 2️⃣ Even or Odd
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // 3️⃣ Largest of Two Numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Largest is: " + a);
        } else if (b > a) {
            System.out.println("Largest is: " + b);
        } else {
            System.out.println("Both are equal");
        }

        // 4️⃣ Grade Calculator
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
