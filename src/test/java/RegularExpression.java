import org.testng.annotations.Test;

public class RegularExpression {

    @Test(description = "This is a WebLogin car loan test")
    public void WebLoginCarLoan() {
        System.out.println("WebLoginCarLoan");
    }

    @Test (priority = 1)
    public void MobileLoginCarLoan() {
        System.out.println("MobileLoginCarLoan");
    }

    @Test (timeOut = 3)
    public void MobileLoginPersonalLoan() {
        System.out.println("MobileLoginPersonalLoan");
    }

    @Test (dependsOnMethods = {"WebLoginCarLoan"})
    public void MobileLoginHomeLoan() {
        System.out.println("MobileLoginHomeLoan");
    }

    @Test (priority = 2)
    public void LoginAPICarLoan() {
        System.out.println("LoginAPICarLoan");
    }
}
