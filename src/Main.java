import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //1
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        /*
        print = n -> O(n)
         */

        //2
        for (int i = 0; i <= Math.pow(2,n); i++) {
            System.out.println(i);
        }
        /*
        print = 2 * n -> O(2^n)
         */

        //3
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i);
            }
        }
        /*
        i = 1; j runs 1 to 1: 1 step
        i = 2: j runs 1 to 2: 2 steps
        i = 3: j runs 1 to 3: 3 steps
        ...

        total steps of the print statement:
        1+2+3+...+n = n*(n+1)/2
        -> O(n^2)
         */

        //4.2
        for (int i = 1; i <= n; i = i*2) {
            System.out.println(i);
        }
        /*
        i = 1    2    4    8    16  ...  2^x (n/2 <= 2^x <= n)
          = 2^0  2^1  2^2  2^3  2^4 ...  2^x

        print runs x+1 times

        n/2 <= 2^x <= n
        log(n) - 1 <= x <= log(n)


         */

        //4.2
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j=j*2) {
                System.out.println(n);
            }
        }


        //5.

        /*
            - Best case ... n is odd => time complexity: O(1)
            - Worst case ... n is 2^k (k>=0) => time complexity: O(log(n)+1)
            _ Average case ...
         */
        int i = 0;
        while (n%2 == 0){
            n = n/2;
            i++;
        }

        //n = 2^n ...     12     6     3

        //6.1
        int[][] A = new int[0][0];
        for (int j = 0; j < n; j++){
            for (int k = 0; k < n; k++) {
                A[i][j] = 0;
            }
        }
        for (int j = 0; j < n; j++) {
            A[j][j]=0;
        }



        

    }


}