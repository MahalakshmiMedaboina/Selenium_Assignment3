package com.test.Week2TestNG;
import org.testng.annotations.Test;

public class GroupsDemo {
	@Test(groups = "smoke")
    public void loginTest() {
        System.out.println("Login Test - Smoke");
    }

    @Test(groups = "regression")
    public void paymentTest() {
        System.out.println("Payment Test - Regression");
    }

    @Test(groups = "smoke")
    public void logoutTest() {
        System.out.println("Logout Test - Smoke");
    }
}
