abstract class pets {
	int age;
	String colour;
	String name;
	pets(int age,String colour,String name){
	this.age=age;
	this.colour=colour;
	this.name=name;
	}
	public abstract void stayindoor();
}
	class cat extends pets {
		cat (int age,String colour,String name){
			super(age,colour,name);
		}
			public void speak()
			{
			System.out.println("purr purr");
		}
			public void jump()
			{
				System.out.println("jumping");
			}

			public void stayindoor() {
			System.out.println("the cat stays indoor");
				}
		}
	class persiancat extends cat 
	{
		persiancat (int age,String colour,String name){
			super(age,colour,name);
		}		
	}
	class indiancat extends cat
	{
		indiancat(int age,String colour,String name){
			super(age,colour,name);
		}
	}
	class dog extends pets{
		dog (int age,String colour,String name){
			super(age,colour,name);
		}
			public void speak()
			{
				System.out.println("bow bow");
			}
			public void stayindoor() {
				System.out.println("the dog dont stay indoor");
				
			}
			
			}

	class mainclass6
	{
		public static void main(String[] args)
		{
			pets c1=new cat(13,"black","cleo");
			System.out.println("the cat does");
			c1.stayindoor();
			System.out.println("the cat is "+ c1 . age);
			System.out.println("the cat is "+ c1 . colour);
			System.out.println("the cat is "+ c1 . name);
			
			cat p1=new persiancat(2,"brown","tokyo");
			p1.stayindoor();
			p1.jump();
			p1.speak();
			
			cat i1=new indiancat(7,"black","hookie");
			i1.speak();
			i1.jump();
			
			
			dog d1=new dog(14,"brown","scooby");
			System.out.println("the dog does");
			d1.speak();
			d1.stayindoor();
			System.out.println("the dog is " +d1 . age);
			System.out.println("the dog is " +d1 . colour);
			System.out.println("the dog is " +d1 . name);
		}
	}
			
		
