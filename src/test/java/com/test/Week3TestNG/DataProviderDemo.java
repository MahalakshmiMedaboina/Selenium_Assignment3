package com.test.Week3TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {
        System.out.println(username + " | " + password);
        System.out.println("Thread ID: " + Thread.currentThread().getId()); // for parallel execution
    }

    @DataProvider
    public Object[][] loginData() {

        Object[][] data = new Object[3][2];

        data[0][0] = "user1";
        data[0][1] = "pass1";

        data[1][0] = "user2";
        data[1][1] = "pass2";

        data[2][0] = "user3";
        data[2][1] = "pass3";

        return data;
    }
    
}
