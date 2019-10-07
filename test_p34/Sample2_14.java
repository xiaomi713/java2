package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_14 
{
	
throws IOException
	{
		System.out.println("要跳过第几次的处理呢？（1～10）");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int res = Integer.parseInt(str);
		for (int i=1;i<=10;i++) {
			if(i==res)
				continue;
			System.out.println("第"+i+"次的处理。");
		}
	}
}
