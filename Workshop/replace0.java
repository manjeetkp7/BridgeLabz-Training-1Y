package assignment;
import java.util.*;
public class replace0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0, place = 1;
        if (n == 0) result = 1;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0) digit = 1;
            result = digit * place + result;
            place *= 10;
            n /= 10;
        }
        System.out.println(result);
    }
}