package ass1;
import java.util.*;
public class NumPattern1 {
	public static void main(String[] args) {
		int n;
		System.out.print("enter number of rows : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int value = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(value+" ");
                value++;
            } 
            System.out.println();
        }
	}

}
