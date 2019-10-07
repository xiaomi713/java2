package sample;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Sample2_2
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("请输入整数");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		if(num==1)
			System.out.println("输入的是1");
		    System.out.println("选择的是1");
	
		    System.out.println("结束处理");
	}
}
