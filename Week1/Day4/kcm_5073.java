package baekjoon;

import java.util.Scanner;

public class kcm_5073 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num[] = new int[3];
		while(true) {
			for(int i =0; i < num.length; i++) {
				num[i] = in.nextInt();
			}
			for(int i =0; i < num.length; i++) {
				for(int j = i+1; j < num.length; j++)
					if(num[j] >= num[i]) {				//배워갑니다~
						int max = num[j];
						num[j] = num[i];
						num[i] = max;			
					}
			}
			if(num[0] == num[1] && num[2] ==num [1] && num[0] == 0)
				break;
			else if(num[0]== num[1] && num[1] == num[2])
				System.out.println("Equilateral");
			else if(num[0] >= num[1] + num[2])
				System.out.println("Invalid");
			else if(num[0] == num[1] || num[1] == num[2])
				System.out.println("Isosceles");
			else
				System.out.println("Scalene");
			
		}
	}
}
