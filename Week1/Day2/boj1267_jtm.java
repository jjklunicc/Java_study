package algorithm;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int yFee = 0;
	    int mFee = 0;
	    int time;
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
