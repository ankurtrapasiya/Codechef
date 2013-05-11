package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Power {

	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String s;
		String[] arr;
		int num,dig;
		BigInteger res;
		BigInteger temp;
		int i=0;
		
		while(t-->0)
		{
			s=br.readLine();
			arr=s.split(" ");
			num=Integer.parseInt(arr[0]);
			dig=Integer.parseInt(arr[1]);
			temp=new BigInteger(String.valueOf(num));
			res=new BigInteger("1");
			
			for(i=0;i<num;i++)
			{
				res=res.multiply(temp);
			}
			
			int l=res.toString().length();
			String r=res.toString();
			System.out.print(r.substring(0,dig));
			System.out.println(r.substring(l-dig,l));
		}
		
	}
}
