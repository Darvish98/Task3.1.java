package StepLesson;

import java.util.Scanner;

public class Task03_5 {		
	static int day, month, year;
	static String result;
	private static String [] animals = {"��������","������","������","������","�����","����",
            "�����","�����","�������","����","������","����"};

	public static void main(String[] args)  {
		 
		try (Scanner scanner = new Scanner(System.in)){
			System.out.println("������� ���� ���� �������� � ������� �� �� ����:");
        		day = scanner.nextInt();
        		month = scanner.nextInt();
        		year = scanner.nextInt();
        	   	}		
				
		System.out.println("�����:");
		System.out.println("����: " + getNameOfZodiak(month));
		System.out.println("���: " + getNameOfAnimal(year));
	}
			
	private static String getNameOfAnimal(int yaer) {
        return animals  yaer % animals.length;
	}


	private static String getNameOfZodiak(int month) {
		switch (month) {
    	case 1: if (day < 20) {
    		result = "�������";
    	} else result = "�������";
    			break;
    	case 2: if (day < 19) {
    		result = "�������";
    	} else result = "����";
    			break;
    	case 3: if (day < 21) {
    		result = "����";
    	} else result = "����";
    			break;
    	case 4: if (day < 20) {
    		result = "����";
    	} else result = "�����";
    			break;
    	case 5: if (day < 21) {
    		result = "�����";
    	} else result = "��������";
    			break;
    	case 6: if (day < 21) {
    		result = "��������";
    	} else result = "���";
    			break;
    	case 7: if (day < 23) {
    		result = "���";
    	} else result = "���";
    			break;
    	case 8: if (day < 23) {
    		result = "���";
    	} else result = "����";
    			break;
    	case 9: if (day < 23) {
    		result = "����";
    	} else result = "����";
    			break;
    	case 10: if (day < 23) {
    		result = "����";
    	} else result = "���������";
    			break;
    	case 11: if (day < 22) {
    		result = "��������";
    	} else result = "�������";
    			break;
    	case 12: if (day < 22) {
    		result = "�������";
    	} else result = "�������";
    			break;
    default: result = "�� ����� �� ������ ����� ��� ����.";
	}
		return result;
}
	
}