
import java.util.Scanner;


public class Bai6 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Hay nhap mot chuoi: ");
        String chuoi = src.next();
        int t =0;
        int dd = chuoi.length() -1;
        for (int i = 0; i <= dd/2 ; i++)
           if(chuoi.charAt(i) != chuoi.charAt(dd))
           {
               t=0;
               System.out.println("Khong la chuoi doi xung.");
               break;
           }
           else
           {
               t=1;
               dd--;
           } 
        if(t==1)
                System.out.println("Là chuỗi đối xứng.");
    }
}
