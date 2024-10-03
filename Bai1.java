
import java.util.Scanner;


public class Bai1 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = src.nextInt();
        int tong = 0;
        for (int i = 1; i <= n; i++)
            tong += i;
        System.out.println("Tổng từ 1 đến n là: " + tong);
    }
}
