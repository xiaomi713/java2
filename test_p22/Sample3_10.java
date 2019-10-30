public class Sample3_10 
{
	public static void main(String[] args)
	{
		Car car1;
		car1= new Car();
		car1.setNumGas(1234,20.5);
		car1.show();
		System.out.println("指定不正确的汽油量{-10.0}看看");
		car1.setNumGas(1234,-10.0);
		car1.show();
	}
}
class Car
{
	private int num;
	private double gas;
	public void setNumGas(int n,double g)
	{
		if(g>0&&g<100)
		{
			num=n;
			gas=g;
			System.out.println("将车号设为"+num+"，汽油量设为"+gas);
		}
		else
		{
			System.out.println(g+"不是正确的汽油量");
			System.out.println("无法变更汽油量");
		}
	}
	public void show()
	{
		System.out.println("车号是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}