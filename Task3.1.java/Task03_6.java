package StepLesson;

import java.util.Scanner;

public class Task03_6 {
	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ���:");
		int year;
		year = scanner.nextInt();
		
		if ((year % 100 != 0) && (year % 4 == 0))
			System.out.println("� " + year + " ���� 366 ����");
	     else if (year % 400 != 0)
	    	 System.out.println("� " + year + " ���� 365 ����");
	     else 
	    	 System.out.println("� " + year + " ���� 365 ����");
	     
		    
		scanner.close();
	}

}
