package reporterlogandlog4j;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTesting {

    @Test
    public void test1(){
        Reporter.log("Test 1 execution start", true);
        int num=2;
        Assert.assertTrue(num == 2);
    }

    @Test
    public void test2(){
        Reporter.log("Test 2 execution start", true);
        int num=2;
        Assert.assertTrue(num == 2);
    }

    @Test
    public void test3(){
        Reporter.log("Test 3 execution start", true);
        int num=2;
        Assert.assertTrue(num != 3);
    }
}
