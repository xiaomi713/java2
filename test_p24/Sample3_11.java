
public class Sample3_11 
{
	public static void main(String[] args)
	{
		Car car1;
		car1=new Car();
		
		car1.setCar(1234,20.5);
		car1.show();
		
		System.out.println("只变更车号");
		car1.setCar(2345);
		car1.show();
		
		System.out.println("只变更汽油量");
		car1.setCar(30.5);
		car1.show();
	}
}
class Car
{
	private int num;
	private double gas;
	public void setCar(int n)
	{
		num=n;
		System.out.println("将车号设为"+num);
	}
	public void setCar(double g)
	{
		gas=g;
		System.out.println("将汽油量设为"+gas);
	}
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("将车号设为"+num+",汽油量设为"+gas);
	}
	public void show()
	{
		System.out.println("车号是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}
