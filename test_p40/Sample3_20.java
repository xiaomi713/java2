import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Sample3_20 
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("请输入字串");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		System.out.println("请输入要新增的字串");
		String str2=br.readLine();
		StringBuffer sb=new StringBuffer(str1);
		sb.append(str2);
		System.out.println("在「"+str1+"」后新增「"+str2+"」的话,就会变成「"+sb+"」.");
		
	}
}
