package StepLesson;

import java.util.Scanner;

public class Task03_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������, ��� ���� �� ����?");		
		System.out.println("1. ���");
		System.out.println("2. ������");
		System.out.println("3. ����");
		System.out.println("4. ������");
		System.out.println("5. �������");
		System.out.println("6. ������");
		System.out.println("7. ����");
		System.out.println("8. �����");
		System.out.println("9. ����");
		System.out.println("10. ˸�");
		System.out.println("���-�� ����������? ������� �� 1 �� 10!!!");
		int Number = scanner.nextInt();
		
		switch(Number) {
	     case 1:
			System.out.println("���");
			break;
		case 2:
			System.out.println("���");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("�����");
			break;
		case 5:
			System.out.println("���");
			break;
		case 6:
			System.out.println("���");
			break;	
		case 7:
			System.out.println("����");
			break;
		case 8:
			System.out.println("���-�����");
			break;			
		case 9:
			System.out.println("���");
			break;			
		case 10:
			System.out.println("�����");
			break;
		default:
			System.out.println("������ ������� ��� � ������.");
		}
		
		
	}	

		
}


