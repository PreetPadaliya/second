import java.util.Scanner;

public class Nothing4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter a number: ");
        int n = s.nextInt();

        boolean isPrime = true;
        for(int i = 2; i <= n / 2; i++)
            if (n % i == 0) {
                isPrime=false;
                break;
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}
