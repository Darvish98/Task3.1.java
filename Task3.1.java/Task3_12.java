package StepLesson;

import java.util.Scanner;

public class Task12_03 {
	public static void main(String[] args) {		
		int ticketNum;
		 Scanner scanner = new Scanner(System.in);
			 System.out.println("������� ����� ������: ");
        		ticketNum = scanner.nextInt();
        	
		
		if (ticketNum / 100000 + (ticketNum / 10000) % 10 + (ticketNum / 1000) % 10 == 
				(ticketNum / 100) % 10 + (ticketNum / 10) % 10 + ticketNum % 10) {
			System.out.print("��� ����� ����������!");
		} else
			System.out.print("��� ����� �� ����������. ��� ������� � ��������� ���!");
	}
 
}