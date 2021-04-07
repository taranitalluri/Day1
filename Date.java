package task1;
import java.util.*;
public class Date {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.print("The date is : ");
		int m = n % 10;
		if(n > 31 || n <= 0) System.out.println("Wrong Date");
		if(n <= 31) {
			if(n>=11 && n<=20) System.out.println(n + "th");
			else if(m==1) System.out.println(n + "st");
			else if(m==2) System.out.println(n+"nd");
			else if(m==3) System.out.println(n+"rd");
			else System.out.println(n + "th");
		}
	}

}
