package JavaCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExp {
    public boolean isLuxury(String s){
        if(s.equals("Toyota"))
            return true;
        return false;
    }
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
        List<String> luxuryCars = list.stream()
                    .filter(car -> isLuxury(car))
                .collect(Collectors.toList());
        System.out.println("\nfilter luxury car \n");
        luxuryCars.forEach(x -> System.out.print(x));

    }
}
