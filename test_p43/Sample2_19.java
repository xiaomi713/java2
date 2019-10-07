package sample;

public class Sample2_19
{
	public static void main(String[] args)
	{
		int []test= {80,60,22,50,75};
		for(int i=0;i<test.length;i++)
		{
			System.out.println("第"+(i+1)+"个人的分数是"+test[i]+"分");
		}
		System.out.println("考试人数为"+test.length+"人");
		
	}
}