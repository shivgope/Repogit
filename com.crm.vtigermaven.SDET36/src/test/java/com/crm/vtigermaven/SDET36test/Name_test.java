package com.crm.vtigermaven.SDET36test;

import org.testng.annotations.Test;

public class Name_test {
	
@Test(groups = "regression")
public void name2()
{
System.out.println("shiv");	
}

@Test(groups = "smoke")
public void address()
{
System.out.println("home");	
}

@Test
public void name3() {
	System.out.println("name print");
}

}
