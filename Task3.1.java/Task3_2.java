package StepLesson;

import java.util.Scanner;

public class Task3_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������������,������� ���������� �����:");		
		int Number = scanner.nextInt();					
		
		if ((Number >= 6) && (Number < 12))
			System.out.println("������ ����");
		else if ((Number >= 12) && (Number < 18))
			System.out.println("������ ����");
		else if ((Number >= 18) && (Number < 24))
			System.out.println("������ �����");
		else if ((Number < 6) || (Number <= 24))
			System.out.println("������ ����");
		else
			System.out.println("������� ����� �� 0 �� 24");
		scanner.close();
		
			

}
}