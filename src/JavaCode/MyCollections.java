package JavaCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCollections {
    public void testCollections(){
        List<int[]> list = new ArrayList();
        int[] element = new int[2];
        list.add(new int[]{2,34});
        list.add(new int[]{33,32});
        list.add(new int[]{261,311});
        list.add(new int[]{251,311});
        list.add(new int[]{27781,311});
        list.add(new int[]{27781,3131});
        list.add(new int[]{27781,11});
        list.add(new int[]{211,311});
        list.add(new int[]{21,311});
        list.add(new int[]{1661,3213});
        Collections.sort(list,  new ListComparator());
        for(int i = 0; i < list.size(); i++)
            System.out.println(" element = "+list.get(i)[0] +" "+list.get(i)[1]);
    }

    class ListComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] a, int[] b) {
            return a[0] < b[0] ? -1 : a[0] > b[0] ? 1 : (a[1] < b[1] ? -1 : a[1] > b[1] ? 1 : (0));
        }
    }

}
