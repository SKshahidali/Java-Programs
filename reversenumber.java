import java.util.Scanner;

public class reversenumber {
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
        System.out.println("The Reverse of the number is : " +newnum);
    }
}
