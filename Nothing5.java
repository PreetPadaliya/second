import java.util.Scanner;

public class Nothing5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int max = n;
        int min = n;

        while(true) {
            n = s.nextInt();

            if(n < 0)
            break;

            if(n > 0)
            max = n;

            if(n < 0)
            min = n;
        }
        System.out.println("min=" + min + "max=" + max);
    }
}
