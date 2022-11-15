import org.testng.annotations.*;

public class Annotations_Selenium {  //testng3.xml

    @BeforeTest
    void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeSuite
    void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeClass
    void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test
    void test1() {
        System.out.println("This is test 1....");
    }

    @Test
    void test2() {
        System.out.println("This is test 2...");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("After Method");
    }

    @AfterClass
    void afterClass() {
        System.out.println("After Class");
    }

    @AfterSuite
    void afterSuite() {
        System.out.println("After Suite");
    }

    @AfterTest
    void afterTest() {
        System.out.println("After Test");
    }
}
