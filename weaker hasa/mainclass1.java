class library
{
	static student s1=new student();
	public void issuebooks()
	{
	System.out.println("library should issue books");
	}
	public void collectfine()
	{
		System.out.println("this is employee");
	}
}
	class student
	{
		   int borrowed=3;
			public void borrowbooks()
	{
System.out.println("student borrows books");
	}
	public void payfine()
	{
System.out.println("student pay fine");
	}
}
class mainclass1
{

	public static void main(String[] args) 
	{
		System.out.println("program starts");
		System.out.println(library.s1);
		library.s1.borrowbooks();
		library.s1.payfine();
		 System.out.println("borrowed="+library.s1.borrowed);
	   System.out.println("program starts");
	}
}