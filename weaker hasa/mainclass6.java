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
class subclass extends superclass
{
	subclass()
	{

this(10);
	
	System.out.println("subclass is executed");
	}
	
		subclass(int a1)
		{
			super(10);
			System.out.println("subclass int a1 executed");
		}
}
	class mainclass6
	{
		public static void main(String[] args)
		{
			System.out.println("program starts");
		subclass sub1=new subclass();
		System.out.println("program ends");
	}
	}
