package JavaCode;

import java.util.ArrayList;
import java.util.List;

public class StreamExp {
    public void printStream(){
        List<String> list = new ArrayList();
        list.add("Toyota");
        list.add("Mec");
        list.add("Vinfast");
        list.add("Ford");
        list.add("Kia");
        list.add("Huyndai");
        for (String s : list) {
            System.out.println(" my car "+s);
        }
    }
}
