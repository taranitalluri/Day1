package ass1;
import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
		int n;
		System.out.print("enter number of rows : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0; i<n; i++){  
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

	}

}
