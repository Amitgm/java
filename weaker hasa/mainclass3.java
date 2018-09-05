class superclass 
{
	int v1=51;
	public void count()
	{
		System.out.println("count() of superclass");
	}
}
	class subclass extends superclass
	{
		int z1=71;
		public void display()
	{
		System.out.println("display () of subclass");
	}

	}
class mainclass3
{

	public static void main(String[] args) 
	{
		System.out.println("program starts");
        subclass sub1=new subclass();
		System.out.println(+sub1.z1);
		sub1.count();
		System.out.println(+sub1.v1);
		sub1.display();
		System.out.println("program ends");

	}
}
