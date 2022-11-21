package retryfailedtcs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test001 {

    //Specifying retryAnalyzer attribute in the @Test annotation

    @Test(retryAnalyzer = retryfailedtcs.RetryAnalyzer.class)
    public void Test1() {
        Assert.assertEquals(false, true);
    }

    @Test
    public void Test2() {
        Assert.assertEquals(false, true);
    }
}

