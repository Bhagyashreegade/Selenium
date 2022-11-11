import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestCase {

    /*Test Suites--> Test Cases--> Test steps
    Package--->Classes---> Methods*/

    @BeforeClass
    public void dataPrinterBeforeClass() {
        System.out.println("Before Class of FirstTestCase");
    }

    @BeforeSuite
    public void dataPrinterBeforeMethod() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void dataPrinterBeforeGroup() {
        System.out.println("Before Test");
    }

    @Test
    public void setup() {
        System.out.println("opening browser");
    }

    @Test    //By default all Tcs are enabled
    public void login() {
        System.out.println("Login into browser");
    }

    @Test
    public void teardown() {
        System.out.println("closing the browser");
    }

}
