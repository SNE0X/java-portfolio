public class arrayreverse {
    public static void main(String[] args) {

        int[] numbers = {5, 9, 2, 15, 6};

        // Find Smallest Number
        int smallest = numbers[0];

        for(int i = 1; i < numbers.length; i++) {

            if(numbers[i] < smallest) {
                smallest = numbers[i];
            }

        }

        System.out.println("Smallest = " + smallest);

        // Reverse Array
        System.out.println("\nReversed Array:");

        for(int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

    }
}