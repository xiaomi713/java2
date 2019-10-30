import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Sample3_21
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("请输入两个整数");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		String str2=br.readLine();
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);
		int ans=Math.max(num1, num2);
		System.out.println(num1+"与"+num2+"中较大的是"+ans);
	}
}
