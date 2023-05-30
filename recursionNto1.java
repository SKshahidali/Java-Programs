import java.util.Scanner;

public class recursionNto1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        n= sc.nextInt();
        for(int i = n;i>=1;i--) {
            System.out.print(i + " ");
        }
    }
}
