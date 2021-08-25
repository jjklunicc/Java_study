package baekjoon;

import java.util.Scanner;

public class kcm_5086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
			while(true) {
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			if(num1 == num2) 
				break;
			else if(num2 % num1 == 0)
				System.out.println("factor");
			else if(num1 % num2 == 0)
				System.out.println("multiple");
			else
				System.out.println("neither");
		}
	}

}
