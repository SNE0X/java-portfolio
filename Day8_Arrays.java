public class Day8_Arrays {

    public static void main(String[] args) {

        // // ==============================
        // // 1️⃣ Declare and Initialize Array
        // // ==============================

        // int[] numbers = {10, 20, 30, 40, 50};

        // // ==============================
        // // 2️⃣ Print Array Elements
        // // ==============================

        // System.out.println("Array Elements:");

        // for(int i = 0; i < numbers.length; i++) {
        //     System.out.println("Index " + i + " = " + numbers[i]);
        // }

        // // ==============================
        // // 3️⃣ Calculate Sum of Array
        // // ==============================

        // int sum = 0;

        // for(int i = 0; i < numbers.length; i++) {
        //     sum += numbers[i];
        // }

        // System.out.println("\nSum of Elements: " + sum);







        int[] numbers = {5, 9, 2, 15, 6};

        // Assume first element is largest
        int largest = numbers[0];

        // Start loop from index 1
        for(int i = 1; i < numbers.length; i++) {

            if(numbers[i] > largest) {
                largest = numbers[i];
            }

        }

        System.out.println("Largest = " + largest);
    }
}