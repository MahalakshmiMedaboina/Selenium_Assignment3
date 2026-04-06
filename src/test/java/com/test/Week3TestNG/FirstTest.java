package com.test.Week3TestNG;
import org.testng.annotations.*;

public class FirstTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Runs once before all tests in this class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Runs before each test method");
    }

    @Test
    public void test1() {
        System.out.println("Executing Test 1");
        System.out.println("Thread ID: " + Thread.currentThread().getId()); // for parallel execution
    }

    @Test
    public void test2() {
        System.out.println("Executing Test 2");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Runs after each test method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Runs once after all tests in this class");
    }
}