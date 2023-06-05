import java.util.Scanner;

public class secondlargestinarray {
    public static void main(String[] args) {
        int n,i,second_largest,largest;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        n=sc.nextInt();

        int [] array = new int[n];

        System.out.println("Enter the elements of the array : ");
        for(i=0;i<n;i++) {
            array[i]=sc.nextInt();
        }
        largest = array[0];
        second_largest = -1;

        for(i=1;i<n;i++) {
            if(array[i] > largest) {
                second_largest = largest;
                largest = array[i];
            }
            else if(array[i]<largest && array[i] > second_largest) {
                second_largest = array[i];
            }
        }
        System.out.println("Second largest element in the array is :  " +second_largest);
    }
}