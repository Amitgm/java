        class practice {
	private double r;
	private static double pi=3.14;
	private double area;
	public practice(double r,double area){
		this.r=r;
		this.area=area;
		area=pi*(r*2);
	}
	public double getr(){
		return r;
	}
	public double getarea(){
		return area;
	}
	public static double getpi(){
		return pi;
	}

}
class calculate{
	public static void main(String[] args){
		System.out.println("the stuff is"+practice.getpi());
		
	}
}