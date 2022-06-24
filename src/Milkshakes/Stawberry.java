package Milkshakes;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Stawberry {

	@BeforeMethod
	public void bm()
	{
		System.out.println("Stawberry Happy Faces");
	}
	@Test(groups= {"Favourite Items"})
	public void stawberry()
	{
		System.out.println("Stawberry Milkshake");
	}
	
	@Test
	public void stawberryBanana()
	{
		System.out.println("StawberryBanana Milkshake");
	}
	
	@Test
	public void stawberryApple()
	{
		System.out.println("Stawberry Apple Milkshake");
	}
}
