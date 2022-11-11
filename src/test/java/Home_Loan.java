import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Home_Loan {

    @BeforeClass
    public void testData(){
        System.out.println("Before Class of HomeLoan");
    }

    @Test
    public void webLoginHomeLoan() {
        System.out.println("Web Login Home Loan");
    }

    @Test(groups = {"SmokeTest"})
    public void mobileLoginHomeLoan() {
        System.out.println("Mobile Login Home Loan");
    }

    @Test
    public void aPILoginHomeLoan() {
        System.out.println("API Login Home Loan");
    }
}
