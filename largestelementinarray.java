import java.util.Scanner;

public class largestelementinarray {
    public static void main(String[] args) {
        int n,i;
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the elements of array : ");
        for(i=0;i<n;i++) {
            array[i]=sc.nextInt();
        }

        int max = array[0];

        for(i=1;i<n;i++) {
            if(array[i]>max) {
               max = array[i];
            }
        }
        System.out.print("The greatest element in array is : "+max);
    }
}
