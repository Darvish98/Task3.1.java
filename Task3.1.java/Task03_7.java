package StepLesson;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task03_7 {
	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ������:");
        String simvol = scanner.nextLine();
        Pattern patlatletter = Pattern.compile("[a-zA-Z]{1}");
        Matcher matlatletter = patlatletter.matcher(simvol);
        Pattern patkirletter = Pattern.compile("[�-��-�]{1}");
        Matcher matkirletter = patkirletter.matcher(simvol);
        Pattern patnumber = Pattern.compile("[0-9]{1}");
        Matcher matnumber = patnumber.matcher(simvol);
        if(matlatletter.matches()==true)
        {
            System.out.println("��������");
        }
        else if(matkirletter.matches()==true)
        {
            System.out.println("��������");
        }
        else if(matnumber.matches()==true)
        {
            System.out.println("�����");
        }
        else
        {
            System.out.println("���������� ����������");
        }
        
		scanner.close();
    }

        
}