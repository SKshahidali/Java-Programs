import java.util.*;

public class reverseanarray {
    public static void main(String[] args) {
        int [] array;
        array = new int [50];

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("The Reversed array is : ");
        for(int j = n-1;j>=0;j--) {
            System.out.print(array[j] + " ");
        }
    }
}