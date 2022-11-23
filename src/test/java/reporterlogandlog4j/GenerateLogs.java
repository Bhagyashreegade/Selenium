package reporterlogandlog4j;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;


public class GenerateLogs {

    Logger log = Logger.getLogger(GenerateLogs.class);

    @Test
    public void test1() {
        log.debug("test1 execution");
    }

    @Test
    public void test2() {
        for(int i = 0; i<5; i++) {
            log.debug("test2 execution " + i);
        }
    }

}
