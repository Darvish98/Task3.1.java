package StepLesson;

import java.util.Scanner;

public class Task03_6 {
	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Укажите год:");
		int year;
		year = scanner.nextInt();
		
		if ((year % 100 != 0) && (year % 4 == 0))
			System.out.println("В " + year + " году 366 дней");
	     else if (year % 400 != 0)
	    	 System.out.println("В " + year + " году 365 дней");
	     else 
	    	 System.out.println("В " + year + " году 365 дней");
	     
		    
		scanner.close();
	}

}
