import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("----- List of Prime Numbers from 1 to 100 -----");

        for (int i = 2; i < 100; i++){
            int n = 0;
            for (int j = 2; j < i; j++){
                if (i%j == 0)
                    n++;
            }
            if (n == 0) {
                System.out.print(" " + i);
            }
        }
    }
}
