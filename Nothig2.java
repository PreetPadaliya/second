import java.util.Scanner;

public class Nothig2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum=0;
        while(true){
            System.out.print("enter a number: ");
            sum += s.nextInt();

            if(sum > 100)
                break;


        }
        System.out.println("Done: " + sum);

    }
}
