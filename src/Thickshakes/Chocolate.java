package Thickshakes;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Chocolate {
	@BeforeTest
	public void Bft()
	{
		System.out.println("Chocolates make everyone happy");
	}
	@Parameters ({ "Juices" } )
	@Test
	public void Chocolate(String Juicesname)
	{
		System.out.println("Chocolate thickshake");
		System.out.println(Juicesname);
	}
	@Test(groups= {"Favourite Items"})
	public void Oreo()
	{
		System.out.println("Oreo thickshake");
	}
	@Test
	public void Vanila()
	{
		System.out.println("Vanila thickshake");
	}
	@Test(dataProvider= "getData")
	public void Coffee(String userName, String password)
	{
		System.out.println("Coffee thickshake");
		System.out.println(userName);
		System.out.println(password);
		
	}
	@AfterTest
	public void aft()
	{
		System.out.println("Chocolates Ends");
	}
	
	//if we have multiple data to test for one test scenario we can use dataprovider attonation. so it can run one test case for different data values
	//here we have login with username and password values: which have 3 different values for 3 users.
	//we need to create multi dimensional array
	
	@DataProvider
	public Object[][] getData()
	{
		Object [] [] data=new Object[3] [2];
		
		//user1
		
		data[0][0]= "firstusername";
		data[0][1]= "firstpassword"	;
		
		//user2
		data[1][0]= "secondusername";
		data[1][1]= "secondpassword"	;
		
		//user3
		data[2][0]= "thirdusername";
		data[2][1]= "thirdpassword"	;
		
		return data;
	}
}
