package datadriventesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CSVTestCase {

    @DataProvider(name="dataProvider")
    public Object[][] dataProviderMethod() {

        Object[][] testObjArray = null;

        try {
            testObjArray = CSVUtilis.getTableArray("C:\\CSV\\TestDataCSV.csv");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return testObjArray;
    }

    @Test(dataProvider = "dataProvider")
    public void testReport(Object username, Object password) {
        System.out.println("Username :" + username + " Password :" + password);
    }







}
