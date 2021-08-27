using System;
using System.Linq;
using System.Text;

public class Test
{
	public static void Main()
	{
		StringBuilder sb = new StringBuilder();
		
		while(true)
		{
			int[] numArr = ReadInt();
			
			if(numArr.Sum() == 0) break;
			
			if(!isTriangle(numArr))
			{
				sb.Append("Invalid\n");
				continue;
			}
			
            //중복을 제거한 개수 count
			int distinctCnt = numArr.Distinct().Count();
			
			switch(distinctCnt)
			{
				case 1:
					sb.Append("Equilateral\n");
					break;
				case 2:
					sb.Append("Isosceles\n");
					break;
				default:
					sb.Append("Scalene\n");
					break;
			}
		}
		Console.Write(sb);
	}
	
	static int[] ReadInt()
	{
		string[] inputs = Console.ReadLine().Split(' ');
		int len = inputs.Length;
		int[] numArr = new int[len];
		
		for(int i=0; i<len; i++)
		{
			numArr[i] = Convert.ToInt32(inputs[i]);
		}
		
		return numArr;
	}
	static bool isTriangle(int[] legs)
	{
		int maxNum = 0;
		int sum = 0;
		
		for(int i=0; i<legs.Length; i++)
		{
            sum += legs[i];
            
			if(legs[i] > maxNum)
            {
                maxNum = legs[i];
            }
		}
        
        sum -= maxNum;
		
		return sum > maxNum ? true : false;
	}
}
