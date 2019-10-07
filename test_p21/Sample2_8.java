package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Sample2_8
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("请问要选哪条路线？");
		System.out.println("请输入整数");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		String str =br.readLine();
		int res=Integer.parseInt(str);
	    char ans=(res==1)?'A':'B';
	    System.out.println("选择了"+ans+"路线");
	}
}
