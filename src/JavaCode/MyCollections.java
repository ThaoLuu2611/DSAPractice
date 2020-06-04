package JavaCode;

import java.util.*;

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
        List<int[]> copyList = new ArrayList<>(list);//new ArrayList();
        Collections.sort(copyList,  new ListComparator());
        //Collections.sort(list,  new ListComparator());
        for(int i = 0; i < list.size(); i++)
            System.out.println(" element = "+list.get(i)[0] +" "+list.get(i)[1]);
        for(int i = 0; i < list.size(); i++)
            System.out.println(" copy list element = "+copyList.get(i)[0] +" "+copyList.get(i)[1]);
        int[] myList = new int[]{1661,3213};
        if(list.contains(myList))
            System.out.println(" co chua contain");
        else
            System.out.println(" khong co chua");

        List<List<Integer>> list2 = new ArrayList();
        List<Integer> l1 = new ArrayList<>();
        l1.add(12);
        l1.add(23);

        List<Integer> l2 = new ArrayList<>();
        l2.add(12);
        l2.add(23);
        list2.add(l1);
        if(list2.contains(l2))
            System.out.println("list 2 contain l1");
        else
            System.out.println("list 2 ko contain l1");
    }

    class ListComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] a, int[] b) {
            return a[0] < b[0] ? -1 : a[0] > b[0] ? 1 : (a[1] < b[1] ? -1 : a[1] > b[1] ? 1 : (0));
        }
    }

    public class Person{
        String name;
        int age;
        String address;
        Person(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }



}
