
import java.util.Scanner;

public class Bai5 {
    // Hàm tính UCLN
    public static int UCLN(int a, int b) {
        while (a%b != 0) 
        {
            int r = a%b;
            a = b;
            b = r;
        }
        return b;
    }

    // Hàm tính BCNN
    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = src.nextInt();
        
        System.out.print("Nhập số nguyên thứ hai: ");
        int b = src.nextInt();
        
        int ucln = UCLN(a, b);
        int bcnn = BCNN(a, b);
        
        System.out.println("UCLN của " + a + " và " + b + " là: " + ucln);
        System.out.println("BCNN của " + a + " và " + b + " là: " + bcnn);
    }
}
