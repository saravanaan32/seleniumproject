package week1.day1;

public class Mobile 
{
	public String mobBrand="Samsung Note"; //Scope Restriction - Access outside of the package
	private short mobModel=9; //Scope Restriction is within the class Level
	long imeiNumber=1234567890123456789l; //Default or No Package Scope Restriction - Outside of the Package
	String mobColor="Blue";
	public static void main(String[] args) 
	{
	Mobile mobileObject = new Mobile();	
	System.out.println(mobileObject.mobModel);	
	}
}
