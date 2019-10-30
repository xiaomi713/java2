public class Sample3_14 
{
	public static void main(String[] args)
	{
		Car car1;
		car1=new Car();
		car1.show();
		
		Car car2;
		car2=new Car(1234,25.0);
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
	public Car(int n,double g) {
		this();
		num=n;
		gas=g;
		System.out.println("生产了车号为"+num+",汽油量为"+gas+"的车子");
	}
	public void show()
	{
		System.out.println("车号是"+num);
		System.out.println("汽油量是"+gas);
	}
}