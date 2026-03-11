public class primeno {
    public static void main(String[] args) {

        int a = 11;
        int n = a / 2;

        if (a <= 2) {
            System.out.println("prime");
        }
        else {
            if (a % 2 != 0 && n % 2 != 0) {
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }
        }

    }
}
