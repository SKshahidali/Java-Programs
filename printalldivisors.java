import java.util.Scanner;
public class printalldivisors {
    public static void main(String[] args) {
        int number,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();

        for(i=1;i<=number;i++) {
            if(number%i==0) {
                System.out.print(i + " ");
            }
        }

    }
}
