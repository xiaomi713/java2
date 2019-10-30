public class Sample3_23 
{
	public static void main(String[] args)
	{
		Car car1;
		car1=new Car();
		car1.show();
		
		int number=1234;
		double gasoline=20.5;
		String str="1号车";
		
		car1.setCar(number,gasoline);
		car1.setName(str);
		
		car1.show();
	}
}
class Car
{
	private int num;
	private double gas;
	private String name;
	public Car()
	{
		num=0;
		gas=0.0;
		name="没有名称";
		System.out.println("生产了车子");
	}
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("将车号设为"+num+",汽油量设为"+gas);
	}
	public void setName(String nm)
	{
		name=nm;
		System.out.println("将车名称设为"+name);
	}
	public void show()
	{
		System.out.println("车号是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("车名是"+name);
		
	}
}