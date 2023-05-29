import java.util.Scanner;

public class palindromenumber {
    public static void main(String[] args) {
        int digits,number,temp,newnum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number = sc.nextInt();
        temp = number;
        while(temp>0){
            digits = temp%10;
            newnum = (newnum*10) + digits;
            temp = temp/10;
        }
        if(newnum == number) {
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not a palindrome number");
        }
    }
}
