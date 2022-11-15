import org.testng.annotations.*;

public class ChildClass_LifeCycle extends BaseClass_LifeCycle {

    //Ideally the Test Cases are present only in Child Class as we do not Over-Ride the test case ever.

    @BeforeMethod
    public void beforeChildMethod() {
        System.out.println("ChildClass's Before Test method");
    }

    @AfterMethod
    public void afterChildMethod() {
        System.out.println("ChildClass's After Test method");
    }

    @BeforeClass
    public void beforeChildClass() {
        System.out.println("ChildClass's Before Class method");
    }

    @AfterClass
    public void afterChildClass() {
        System.out.println("ChildClass's After Class method");
    }

    @Test
    public void testCase() {
        System.out.println("===== Executing actual test ======");
    }


}
