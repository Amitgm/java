class demo1
{
	 int x1= 501;
	 double z1= 0.36;
      public void test()
	{
       System.out.println("this is test () of demo1 class");
	}
}
	class mainclass1
	{

	public static void main(String[] args) 
	{
		System.out.println("Program starts");
		System.out.println("x1= "+new demo1().x1);
		System.out.println("z1= "+new demo1().z1);
		new demo1().test();
		//new classname()
		System.out.println("Program ends");
	}
   }
