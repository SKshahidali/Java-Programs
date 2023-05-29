import java.util.Scanner;

class countdigits {
    public static void main(String[] args) {
        int number,digits=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        while(number>0){
            number = number/10;
            digits++;
        }
        System.out.println(digits);
    }
}