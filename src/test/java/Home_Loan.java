import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Home_Loan {

    @BeforeClass
    public void testData(){
        System.out.println("Before Class of HomeLoan");
    }

    @Test
    public void WebLoginHomeLoan() {
        System.out.println("Web Login Home Loan");
    }

    @Test(groups = {"SmokeTest"})
    public void MobileLoginHomeLoan() {
        System.out.println("Mobile Login Home Loan");
    }

    @Test
    public void APILoginHomeLoan() {
        System.out.println("API Login Home Loan");
    }
}
