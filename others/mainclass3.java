    class pets {
	int age;
	String colour;
	String name;
	pets(int age,String colour,String name){
	this.age=age;
	this.colour=colour;
	this.name=name;
	}
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
		}

	class dog extends pets{
		dog (int age,String colour,String name){
			super(age,colour,name);
		}
			public void speak()
			{
				System.out.println("bow bow");
			}
			
			}

	class mainclass3
	{
		public static void main(String[] args)
		{
			cat c1=new cat(13,"black","cleo");
			System.out.println("the cat does");
			c1.speak();
			c1.jump();
			System.out.println("the cat is"+c1.age);
			System.out.println("the cat is"+c1.colour);
			System.out.println("the cat is"+c1.name);
			
			dog d1=new dog(14,"brown","scooby");
			System.out.println("the dog does");
			d1.speak();
			System.out.println("the dog is"+d1.age);
			System.out.println("the dog is"+d1.colour);
			System.out.println("the dog is"+d1.name);
		}
	}
			
		
