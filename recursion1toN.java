import java.util.Scanner;

public class recursion1toN {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be printed :");
        n=sc.nextInt();
        for(int i = 1;i<=n;i++) {
            System.out.print(i+" ");
        }
    }
}
