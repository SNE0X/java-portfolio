
//     for(int i = 1; i <= rows; i++) {
//     for(int j = 1; j <= columns; j++) {
//         // print something
//     }
// }

public class Day7_NestedLoops {

    public static void main(String[] args) {

        // ==============================
        // 1️⃣ Square Pattern
        // ==============================

        System.out.println("Square Pattern:");
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ==============================
        // 2️⃣ Right Triangle Pattern
        // ==============================

        System.out.println("\nRight Triangle Pattern:");
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ==============================
        // 3️⃣ Reverse Triangle Pattern
        // ==============================

        System.out.println("\nReverse Triangle Pattern:");
        for(int i = 4; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

// 1
// 12
// 123
// 1234

        System.out.println("number right  triangle :");
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }


// 1234
// 123
// 12
// 1
        System.out.println("number reverse triangle :");
        for(int i = 4; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }
}



