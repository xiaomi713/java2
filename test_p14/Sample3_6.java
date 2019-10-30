
public class Sample3_6 
{
	public static void main(String[] args)
	{
		Car car1;
		car1=new Car();
		
		car1.setNum(1234);
		car1.setGas(20.5);
	}
}
class Car
{
	int num;
	double gas;
	
	void setNum(int n)
	{
		num=n;
		System.out.println("将车号设为"+num);
	}
	void setGas(double g)
	{
		gas=g;
		System.out.println("将汽油量设为"+gas);
	}
}