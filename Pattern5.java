package ass1;
import java.util.*;
public class Pattern5 {

	public static void main(String[] args) {
		int n;
		System.out.print("enter number of rows : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int i, j, space, k = 0;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            while (k != (2 * i - 1)) {
                if (k == 0 || k == 2 * i - 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
                k++;
            }
            k = 0;
            System.out.println();
        }
        n--;
        for (i = n; i >= 1; i--) {
            for (j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            k = 0;
            while (k != (2 * i - 1)) {
                if (k == 0 || k == 2 * i - 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
                k++;
            }
            System.out.println();
        }

	}

}
