public class decreasingstar {
    public static void main(String[] args) {
        int i,j,rows=5;

        for(i=rows;i>=1;i--) {
            for(j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
