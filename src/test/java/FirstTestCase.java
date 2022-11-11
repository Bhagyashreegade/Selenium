import org.testng.annotations.Test;

public class FirstTestCase {

    /*Test Suites--> Test Cases--> Test steps
    Package--->Classes---> Methods*/

    @Test(priority = 1)
   public static void setup(){
       System.out.println("opening browser");
   }
   @Test (priority = 2)
   public static void login(){
       System.out.println("Login into browser");
   }

   @Test(priority = 3)
    public static void teardown(){
       System.out.println("closing the browser");
   }

}
