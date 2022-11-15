import org.testng.annotations.*;

public class Annotations_2 { //testng3.xml

    @BeforeClass
    void beforeClass(){
        System.out.println("Before Class 2");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("Before Method 2");
    }

    @Test
    void test3(){
        System.out.println("This is test3....");
    }

    @Test
    void test4(){
        System.out.println("This is test 4....");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("After Method 2");
    }

    @AfterClass
    void afterClass(){
        System.out.println("After Class 2");
    }

}
