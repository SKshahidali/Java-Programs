import java.util.Scanner;

public class sumofNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i=0;i<=n;i++) {
            sum = sum + i;
        }
        System.out.println("The sum of the numbers are " +sum);
    }
}
