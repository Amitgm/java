class superclass1 
{
	int v1=51;
	public void count()
	{
		System.out.println(v1);
	}
}
	class superclass2 extends superclass1
	{
		int z1=42;
		public void display()
	{
		System.out.println(z1);
	}

	}
	class subclass extends superclass2
	{
		int w1=53;
		public void cut()
	{
		System.out.println(w1);
	}

	}
   class mainclass4
{

	public static void main(int[] args) 
	{
	
        subclass sub1=new subclass();
		System.out.println(+sub1.v1);
		sub1.count();
		System.out.println(+sub1.z1);
		sub1.display();
		System.out.println(+sub1.w1);
		sub1.cut();
		

	}
}
