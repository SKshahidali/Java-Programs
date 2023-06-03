import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(i=0;i<n;i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("The unsorted array is : ");
        for(i=0;i<n;i++) {
             System.out.print(array[i] + " ");
        }
        System.out.println();
        //insertion Sort //
        for(i=0;i<n;i++) {
            j=i;
            while(j>0 && array[j]<array[j-1]) {
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
        }
        System.out.print("The Sorted Array is :");
        for(i=0;i<n;i++) {
            System.out.print(array[i] + " ");
        }
    }
}