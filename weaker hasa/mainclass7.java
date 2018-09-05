class superclass
{
 superclass()
{
	System.out.println("superclass is executed");
}
		superclass(int x1)
		{
			System.out.println("superclass is executed");
		}
}
class subclass1 extends superclass
{
	subclass1()
	{

this(10);
	
	System.out.println("subclass1 is executed");
	}
	
		subclass1(int a1)
		{
			super(10);
			System.out.println("subclass1 int a1 executed");
		}
}
class subclass2 extends superclass
{
	subclass2()
	{

this(10);
	
	System.out.println("subclass2 is executed");
	}
	
		subclass2(int a1)
		{
			super(10);
			System.out.println("subclass2 int a1 executed");
		}
}


	class mainclass7
	{
		public static void main(String[] args)
		{
			System.out.println("program starts");
		superclass s1= new superclass();
		System.out.println("program ends");
	}
	}
