package StepLesson;

import java.util.Scanner;

public class Task03_4 {
	public static void main(String agrs[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ���������� \"x\"");
		double x = scanner.nextDouble();
		System.out.println("������� ���������� \"y\"");
		double y = scanner.nextDouble();
		
		if ((x > 0) && (y > 0))
			System.out.println("���������� ("+ x +" , "+ y +") ���������� I ��������");
		else if ((x < 0) && (y < 0))
			System.out.println("���������� ("+ x +" , "+ y +") ���������� III ��������");
		else if ((x < 0) && (y > 0))
			System.out.println("���������� ("+ x +", "+ y +") ���������� II ��������");
		else if ((x > 0) && (y < 0))
			System.out.println("���������� ("+ x +", "+ y +") ���������� IV ��������");
		else if ((x == 0) && (y == 0))
			System.out.println("���������� ("+ x +", "+ y +") ���������� � ������");
		else 
			System.out.println("����� ��������� ���");
			
			
		
	}

}
