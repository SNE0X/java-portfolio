public class Day6_Loops {

    public static void main(String[] args) {

        // ==============================
        // 1️⃣ FOR LOOP
        // Used when number of iterations is known
        // ==============================

        System.out.println("For Loop Output:");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // ==============================
        // 2️⃣ WHILE LOOP
        // Used when iterations are condition-based
        // ==============================

        System.out.println("\nWhile Loop Output:");
        int j = 1;

        while(j <= 5) {
            System.out.println(j);
            j++;
        }

        // ==============================
        // 3️⃣ DO-WHILE LOOP
        // Runs at least once
        // ==============================

        System.out.println("\nDo-While Loop Output:");
        int k = 1;

        do {
            System.out.println(k);
            k++;
        } while(k <= 5);

    }
}