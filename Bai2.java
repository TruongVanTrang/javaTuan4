
public class Bai2 {
    public static void main(String[] args) {
        System.out.println("***BẢNG CỬU CHƯƠNG***");
        for (int i = 2; i <= 9; i++) 
        {
            System.out.println("\nCửu chương x" + i);
            for (int j = 1; j <= 9; j++) 
            {
                System.out.println(i +" * " + j + " = " +(i*j));
            }
        }
    }
}
