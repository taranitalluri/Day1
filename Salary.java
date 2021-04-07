package task1;
import java.util.*;
public class Salary {

	public static void main(String[] args) {
		double basicSalary;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Basic Salary : ");
		basicSalary=sc.nextDouble();
		double hra, da, tax = 0;
		hra = basicSalary * 0.40;
		da = (basicSalary + hra) * 0.60;
		double annualSalary = (basicSalary+hra+da)*12;
		System.out.println("Annual Salary is : " + annualSalary);
		if(annualSalary < 200000.0) tax = annualSalary;
		else if(annualSalary >= 200000.0 && annualSalary <= 600000.0) tax = annualSalary * 0.10;
		else if(annualSalary > 600000.0) tax = annualSalary * 0.20;
		System.out.println("Tax is : " + tax);
		System.out.println("Exact pay is : " + (annualSalary-tax));
	}
}
