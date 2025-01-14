package algorithm;
import java.util.Scanner;

public class Main {
    
	static int maxNum(int a, int b, int c) {
		int max = 0;
		if(a > b) {
			if(b > c)
				max = a;
			else 
				max = (a > c) ? a : c;
		}
		
		else 
			max = (b > c) ? b : c;
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			String result = "";
			if(a == 0 && b == 0 && c == 0)
				break;
			
			int max = maxNum(a, b, c);
			
			if(a == max) {
				if(a >= b+c)
					result = "Invalid";
			}
			else if(b == max){
				if(b >= a + c)
					result = "Invalid";
			}
			else {
				if(c >= a + b)
					result = "Invalid";
			}
			
			if(result == "" && a == b && b == c )
				result = "Equilateral";
			else if(result == "" && (a == b && b != c) || (a == c && b != c) || (b == c && a != b))
				result = "Isosceles";
			else if(result == "" && a != b && b != c && a != c)
				result = "Scalene";
			
			System.out.println(result);
			
		}
		sc.close();
	}
}
