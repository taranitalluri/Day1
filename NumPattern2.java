package ass1;

import java.util.Scanner;

public class NumPattern2 {

	public static void main(String[] args) {
		int n;
		System.out.print("enter number of rows : ");
		Scanner sc=new Scanner(System.in);
		n = sc.nextInt();
		  for (int i = 1; i <= n; i++) {
	            int num = i;
	            for (int j = 1; j <= i; j++){
	                System.out.print(num+" ");   
	                num = num+n-j;
	            }
	            System.out.println();
		  }
	}

}
