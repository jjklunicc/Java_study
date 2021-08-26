package algorithm;

import java.util.Scanner;

public class Bj_1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		//// 언더바 사용ㄴㄴ
		//// minX 식으로 (첫단어만 제외하고) 단어 앞마다 대문자로 해서 구분하는게 자바 네이밍 관례임
		int minX = Math.min(x, w-x);	
		int minY = Math.min(y, h-y);	
		//// 불필요하게 줄바꿈 2번 ㄴㄴ
		System.out.println(Math.min(minX, minY));
		sc.close();
	}
}
