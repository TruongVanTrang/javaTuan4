
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên: ");
        int x = src.nextInt();
        int demU = 2;
        for (int i = 2; i <= x/2; i++) 
            if( x % i == 0)
                demU++;
        if(demU == 2)
            System.out.println("Số " +x + " là số nguyên tố.");
        else
            System.out.println("Số " +x + " không phải số nguyên tố.");
    }
}
