package StepLesson;

import java.util.Scanner;

public class Task03_9 {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �����!");
		System.out.println("������� ���������� \"x\" ������ �����");
		double x1 = scanner.nextDouble();
		System.out.println("������� ���������� \"y\" ������ �����");
		double y1 = scanner.nextDouble();
		System.out.println("������� ���������� \"x\" ������ �����");
		double x2 = scanner.nextDouble();
		System.out.println("������� ���������� \"y\" ������ �����");
		double y2 = scanner.nextDouble();
		
		if (y1 == y2)
			System.out.println("������ ������");
		else if (x1 == x2)
			System.out.println("������ ��������");
		else if(x1 > x2 && y1 > y2 )
			System.out.println("�����");
		else
			System.out.println("�����");
						
	}

}