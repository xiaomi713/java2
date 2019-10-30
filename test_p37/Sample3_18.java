import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Sample3_18 
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("请输入英文字母");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String stru=str.toUpperCase();
		String stri=str.toLowerCase();
		System.out.println("转换成大小写时为"+stru);
		System.out.println("转换成大小写时为"+stri);
	}
}
