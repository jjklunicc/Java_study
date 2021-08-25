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

// 자바에서 한번에 두개를 입력받으려면 저렇게 해야되는지 이제 알았습니다 ^0^ - 현민
