import java.util.Scanner;

public class checkifarrayissorted {
    public static void main(String[] args) {
        int n,i;

        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(i=0;i<n;i++) {
            array[i] = sc.nextInt();
        }

        for(i=1;i<n;i++) {
            if(array[i]<array[i-1]) {
                System.out.println("The Array is not sorted");
                break;
            }
            else {
                System.out.println("The array is sorted");
            }
            
        }
        
    }
}
