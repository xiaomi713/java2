public class Sample3_22 
{
	public static void main(String[] args)
	{
		System.out.println("宣告car1");
		Car car1;
		car1=new Car();
		car1.setCar(1234,20.5);
		
		System.out.println("宣告car2");
		Car car2;
		System.out.println("将car1指定给car2");
		car2=car1;
		System.out.print("car1的");
		car1.show();
		System.out.print("car2的");
		car2.show();
		System.out.println("改变car1的相关资料");
		car1.setCar(2345,30.5);
		System.out.print("car1的");
		car1.show();
		System.out.print("car2的");
		car2.show();
	}
}
class Car
{
	private int num;
	private double gas;
	public Car()
	{
		num=0;
		gas=0.0;
		System.out.println("生产了车子");
	}
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("将车号设为"+num+",汽油量设为"+gas);
	}
	public void show()
	{
		System.out.println("车号是"+num);
		System.out.println("汽油量是"+gas);
	}
}