package algorithm;
import java.util.Scanner;

//// 깔끔함~
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int yFee = 0;
	    int mFee = 0;
			int time; //// 12줄에서 선언해도 됐음. for문 안에서만 사용되기때문에 12줄에서 선언하는 게 더 깔끔함
	    for(int i = 0; i < num; i++){
	        time = sc.nextInt();
	        yFee += ((time / 30) + 1) * 10;
	        mFee += ((time / 60) + 1) * 15;
	    }
	    if(yFee > mFee){
	        System.out.println("M " + mFee);
	    }
	    else if(yFee < mFee){
	        System.out.println("Y " + yFee);
	    }
	    else{
	        System.out.println("Y M " + mFee);
	    }
	}
}
