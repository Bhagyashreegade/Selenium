import org.testng.annotations.Test;

public class Car_Loan {

    @Test
    public void webLoginCarLoan() {
        System.out.println("Web Login Home Loan");
    }

    @Test
    public void mobileLoginCarLoan() {
        System.out.println("Mobile Login Home Loan");
    }

    @Test(groups = {"SmokeTest"})
    public void aPILoginCarLoan() {
        System.out.println("API Login Home Loan");
    }
}
