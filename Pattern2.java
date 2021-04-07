package ass1;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		int rows, k = 0;
		System.out.print("enter number of rows : ");
		Scanner sc=new Scanner(System.in);
		rows = sc.nextInt();
	    for (int i = 1; i <= rows; ++i, k = 0) {
	      for (int j = 1; j <= rows - i; ++j) {
	        System.out.print("  ");
	      }

	      while (k != 2 * i - 1) {
	        System.out.print("* ");
	        ++k;
	      }

	      System.out.println();
	    }

	}

}
