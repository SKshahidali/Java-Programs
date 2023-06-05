import java.util.Scanner;

public class maxconsecutiveone {
    public static void main(String[] args) {
        int n,i,count=0,max=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of array : ");
        n=sc.nextInt();

        int [] array = new int[n];
        System.out.println("Enter the Elements of the array");
        for(i=0;i<n;i++) {
            array[i] =sc.nextInt();
        }

        for(i=0;i<n;i++) {
            if(array[i]==1) {
                count++;
            }
            else {
                count = 0 ;
            }
            max = Math.max(max,count);
        }
        System.out.print("The Maximum consecutive ones are : " +max);
    }
}
