class demo1
{
	static int x1= 501;
	static double z1= 0.36;
      public static void test()
	{
       System.out.println("this is test () of demo1 class");
	}
}
	class mainclass
	{

	public static void main(String[] args) 
	{
		System.out.println("Program starts");
		System.out.println("x1= "+demo1.x1);
		System.out.println("z1= "+demo1.z1);
		demo1.test();
		System.out.println("Program ends");
	}
   }
