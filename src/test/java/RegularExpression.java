import org.testng.annotations.Test;

public class RegularExpression {

    @Test(description = "This is a WebLogin car loan test")
    public void WebLoginCarLoan() {
        System.out.println("WebLoginCarLoan");
    }

    @Test(priority = 1)
    public void mobileLoginCarLoan() {
        System.out.println("MobileLoginCarLoan");
    }

    @Test(timeOut = 300)
    public void mobileLoginPersonalLoan() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("MobileLoginPersonalLoan");
    }

    @Test(dependsOnMethods = {"WebLoginCarLoan"})
    public void mobileLoginHomeLoan() {
        System.out.println("MobileLoginHomeLoan");
    }

    @Test(priority = 2)
    public void loginAPICarLoan() {
        System.out.println("LoginAPICarLoan");
    }
}
