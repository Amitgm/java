class superclass
{
	int z1=50;
	public void count()
	{
		System.out.println("count() of superclass");
	}
}
	class subclass extends superclass
	{
		int z1=42;
		public void display()
	{
		System.out.println(super.z1);
		System.out.println(z1);

		super.count();
		count();
		{
			System.out.println("count of subclass");

	}

	}
	}
	  class mainclass8
{

	public static void main(String[] args) 
	{
	
        subclass sub1=new subclass();
		sub1.display();
		System.out.println(sub1.z1);
	}
}
