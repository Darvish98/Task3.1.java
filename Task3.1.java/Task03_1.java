package StepLesson;

import java.util.Scanner;

public class Task03_1 {
	 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("������� ����� �� 1 �� 7");
	int Number = scanner.nextInt();	
	
	switch(Number) {
     case 1:
		System.out.println("�����������");
		break;
	case 2:
		System.out.println("�������");
		break;
	case 3:
		System.out.println("�����");
		break;
	case 4:
		System.out.println("�������");
		break;
	case 5:
		System.out.println("�������");
		break;
	case 6:
		System.out.println("�������");
		break;	
	case 7:
		System.out.println("�����������");
		break;
	default:
		System.out.println("����� ����������.");
	}
	
	
}	

	}
	


