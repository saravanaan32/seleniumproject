package week1.day2;

import week1.day1.Mobile;

public class PackageLevelAccessMobile 
{
 public static void main(String[] args) 
 {
	 Mobile objMobile = new Mobile();
	 System.out.println(objMobile.mobBrand);
	 //We are not able to access the Package or Default or private
	 System.out.println("Apart from mobile Brand you cant access anything apart from that");
}
}
