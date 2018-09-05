 class vemana{
	private String firstname;
	private String lastname;
	private static int classmates=2;
	
	public vemana(String firstname, String lastname)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		classmates++;
	}
	public String getfirstname(){
	return firstname;
	}
	public String getlastname(){
		return lastname;
		}
	public static int getclassmates(){
		return classmates;
		}

}
class mainclass6
{
	public static void main(String[] args){
		
		vemana v1=new vemana("amit","geo");
		System.out.println("the first is"+v1.getfirstname());
		System.out.println("the last is"+v1.getlastname());
	        v1.getclassmates();
	}
}