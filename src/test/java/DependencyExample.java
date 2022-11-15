import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

    @Test
    void startCar() {
        System.out.println("Car started");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar() {
        System.out.println("Car driving");
    }

    @Test(dependsOnMethods = {"driveCar", "startCar"})
    void stopCar() {
        System.out.println("Car stopped");
    }

    @Test(dependsOnMethods = {"stopCar", "driveCar"}, alwaysRun = true)
        //alwaysRun will execute the method even if dependency method fails to execute
    void parkCar() {
        System.out.println("Car parked");
    }


}
