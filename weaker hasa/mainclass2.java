class  car
{
	double price;
	String brand;
	String color;
    engine e1;
	car(double price,String brand,String color)
	{
		this.price=price;
	    this.brand=brand;
		this.color=color;
		e1=new engine(4,100,"petrol");
	}
}
class engine
{
	int noc;
	double bhp;
	String type;
	int engno=1450;
	engine(int noc,double bhp,String type)
	{
		this.noc=noc;
		this.bhp=bhp;
		this.type=type;
	}
}
class mainclass2
{

	public static void main(String[] args) 
	{
		System.out.println("program starts");
		car c1=new car(450000,"maruti","white");
		car c2=new car(3423321,"ford","black");
		System.out.println(c1.color);
		System.out.println(c1.e1.type);
		System.out.println(c2.color);

	}
}
