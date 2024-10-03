
import java.util.Scanner;


public class Bai3 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = src.nextInt();
        long giaithua = 1;
        for (int i = 1; i <= n ; i++)
            giaithua *= i;
        System.out.println("Giai thừa của " +n + " là: " +giaithua);
    }  
}
