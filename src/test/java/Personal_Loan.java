import org.testng.annotations.Test;

public class Personal_Loan {

    @Test(groups = {"SmokeTest"})
    public void webLoginPersonalLoan() {
        System.out.println("Web Login Personal Loan");
    }

    @Test
    public void mobileLoginPersonalLoan() {
        System.out.println("Mobile Login Personal Loan");
    }

    @Test
    public void aPILoginPersonalLoan() {
        System.out.println("API Login Personal Loan");
    }
}
