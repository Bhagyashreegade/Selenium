import org.testng.annotations.Test;

public class FirstTestCase {

    /*Test Suites--> Test Cases--> Test steps
    Package--->Classes---> Methods*/

    @Test
    public static void setup() {
        System.out.println("opening browser");
    }

    @Test    //By default all Tcs are enabled
    public static void login() {
        System.out.println("Login into browser");
    }

    @Test
    public static void teardown() {
        System.out.println("closing the browser");
    }

}
