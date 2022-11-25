package datadriventesting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVUtilis{

    public static Object[][] getTableArray(String filepath) throws IOException {
        File file = new File(filepath);

        System.out.println("File Exists? " + file.exists());
        System.out.println("File can be readbable? " + file.canRead());

        Object[][] tabArray = null;

        List<List<Object>> list = new ArrayList<List<Object>>();
        BufferedReader br = new BufferedReader(new FileReader(filepath));
        String line = br.readLine();
        Object[] cell = line.split(",");
        for (Object header : cell) {
            List<Object> subList = new ArrayList<Object>();
            subList.add(header);
            list.add(subList);
        }
        while ((line = br.readLine()) != null) {
            Object[] elems = line.split(",");
            for (int i = 0; i < elems.length; i++) {
                list.get(i).add(elems[i]);
            }
        }

        br.close();

        int rows = list.get(0).size();
        int cols = list.size();

        tabArray = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tabArray[i][j] = list.get(j).get(i);
            }
        }
        return tabArray;
    }


    
}


