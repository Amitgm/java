class notebook
{
	 double p1=10.99 ;
	 int pg1= 50;
	 String brand="chandra";
	 String type="long";

     
      public void openbook()
	{
       System.out.println("this is openbook () of notebook class");
	}
	  
      public void turnpage()
	{
       System.out.println("this is turnpage () of notebook class");
	}

   public void closebook()
	{
       System.out.println("this is closebook () of notebook class");
	}
}
class pens
{
	double p1=10.99 ;
	 String color= "blue";
	 String brand="flogel";
	 String type="ball";

     
      public void write()
	{
       System.out.println("this is write() of pen class");
	}
	  
      public void draw()
	{
       System.out.println("this is draw () of pen class");
	}

   public void refill()
	{
       System.out.println("this is refill () of pen class");
	}

}
	class mainclass3
	{

	public static void main(String[] args) 
	{
		System.out.println("Program starts");
		notebook ref;
		ref=new notebook();
			pens ref2 =new pens();
		System.out.println("ref="+ref);
		System.out.println("ref2="+ref2);

		System.out.println("p1= "+ref.p1);
		System.out.println("pg1= "+ref.pg1);
		System.out.println("p1= "+ref2.p1);
		 ref.openbook();
         ref.turnpage();
         ref2.write();
         ref2.draw();
         ref2.refill();
	     ref.closebook();
		//classname variablename
		System.out.println("Program ends");
	}
   }
