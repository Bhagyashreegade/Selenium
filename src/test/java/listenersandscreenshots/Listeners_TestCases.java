package listenersandscreenshots;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)  //not necessary when executing through testng.xml file

public class Listeners_TestCases {

    @Test
    public void test1() {
        System.out.println("This is test 1");
        Assert.assertEquals("A", "A");
    }

    @Test
    public void test2() {
        System.out.println("This is test 2");
        Assert.assertEquals("A", "B");

    }

    @Test
    public void test3() {
        System.out.println("This is test 3");
        throw new SkipException("This is skipped");
    }

}
