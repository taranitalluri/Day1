package task1;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		int englishMarks, java, db, springTools;
		Scanner sc=new Scanner(System.in);
		englishMarks=sc.nextInt();
		java=sc.nextInt();
		db=sc.nextInt();
		springTools=sc.nextInt();
		float totalMarks=englishMarks+java+db+springTools;
		float averageMarks = totalMarks/4;
		System.out.println("Total Marks are : " + totalMarks);
		System.out.println("Average Marks are : " + averageMarks);
	}

}
