
public class Sample3_4_2
{
	public static void main(String[] args)
	{
		Car car1;
		car1=new Car();
		
		car1.num=1234;
		car1.gas=20.5;
	}
}
class Car
{
	int num;
	double gas;
	void show()
	{
		System.out.println("车号是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}