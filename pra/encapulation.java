class accounts {
	
	private int accountbalance=0;
	private int pincode=1234;
	
	public void setbalance(int accountbalance,int pincode){
		this.accountbalance=accountbalance;
		this.pincode=pincode;
	}
	public int getaccountbalance(){
		if(accountbalance<0)
		{
		System.out.println("the account is invalid");
		}
		else
		{
			System.out.println("the account is valid");
		}
		return accountbalance;
	}
	public int getpincode(){
		return pincode;
	}
    }
	public class encapulation{

	public static void main(String[] args) {
		accounts a1=new accounts();
		
		a1.setbalance(1000,1234);
                a1
	 }
	}
