class demo1
{
	 int x1= 501;
	 double z1= 0.36;
      public void test()
	{
       System.out.println("this is test () of demo1 class");
	}
}
	class mainclass2
	{

	public static void main(String[] args) 
	{
		System.out.println("Program starts");
		demo1 ref;
		ref=new demo1();
			demo1 ref2 =new demo1();
		System.out.println("ref="+ref);
		System.out.println("ref2="+ref2);
		System.out.println("x1= "+ref.x1);
		System.out.println("z1= "+ref.z1);
		 ref.test();
		//classname variablename
		System.out.println("Program ends");
	}
   }
