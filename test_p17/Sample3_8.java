
public class Sample3_8 
{
	public static void main (String[] args)
	{
		Car car1;
		car1=new Car();
		car1.setNumGas(1234,20.5);
		int number =car1.getNum();
		double gasoline =car1.getGas();
		System.out.println("调查样品车时得知");
		System.out.println("车号是"+number+",汽油量是"+gasoline);
	}
}
class Car 
{
	int num;
	double gas;
	int getNum()
	{
		System.out.println("调查车号");
		return num;
	}
	double getGas()
	{
		System.out.println("调查汽油量");
		return gas;
	}
	void setNumGas(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("将车号设为"+num+",汽油量设为"+gas);
	}
}
