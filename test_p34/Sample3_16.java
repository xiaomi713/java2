import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Sample3_16
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("请输入一个整数");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int num=Integer.parseInt(str);
		System.out.println("您输入的数字是:"+num);
	
	}
}
