import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the Elements of the array");

        for(int i=0;i<n;i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("The unsorted array is : ");
        for(int i=0;i<n;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //<-----> Bubble Sort algorithm begins here <-----> //

        for(int i=0;i<n-1;i++) {
            int swap = 0;
            //The variable "i" is used for representing loop for swaps in the total array //

            //The variable j is used for comparing the elements of the array during a single swap
            for(int j=0;j<n-1;j++) {
                if(array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1]; 
                    array[j+1] = temp;
                    swap =1;
                }
            }
            if(swap == 0) {
                break;
            }
        }

        //<----->Bubble sort algorithm ends here <-----> //

        System.out.println("The sorted array is : ");

        for(int i = 0;i<n;i++) {
            System.out.print(array[i] + " ");
        }
    }
}
