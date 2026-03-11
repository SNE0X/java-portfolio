public class Day2_TypePromotion {

    public static void main(String[] args) {

        System.out.println("---- Integer Division ----");
        System.out.println("5 / 2 = " + (5 / 2));
        System.out.println("10 / 4 = " + (10 / 4));

        System.out.println("\n---- Double Division ----");
        System.out.println("5 / 2.0 = " + (5 / 2.0));
        System.out.println("10 / (double)4 = " + (10 / (double)4));

        System.out.println("\n---- Casting ----");
        System.out.println("(int)5.7 = " + ((int)5.7));
        System.out.println("(double)10 = " + ((double)10));
        System.out.println("(int)(5.7 + 2.3) = " + ((int)(5.7 + 2.3)));
        System.out.println("(int)5.7 + 2.3 = " + ((int)5.7 + 2.3));

        System.out.println("\n---- Operator Precedence ----");
        System.out.println("10 + 5 / 2 = " + (10 + 5 / 2));
        System.out.println("(10 + 5) / 2 = " + ((10 + 5) / 2));
        System.out.println("10 + 5 / 2.0 = " + (10 + 5 / 2.0));
        System.out.println("10 + 5 / 2 * 2.0 = " + (10 + 5 / 2 * 2.0));

    }
}
