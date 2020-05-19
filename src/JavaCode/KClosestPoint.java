package JavaCode;

import java.util.*;
import java.util.stream.Stream;

public class KClosestPoint {
    public int[][] kClosest(int[][] points, int K) {
        if(points.length == K)
            return points;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < points.length; i++){
            int[] p = points[i];
            int x = p[0]*p[0] + p[1]*p[1];
            map.put(i,x);
        }
        Stream<Map.Entry<Integer,Integer>> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).limit(K);
        List<Integer> listIndex = new LinkedList<>();
        sorted.forEach(x -> listIndex.add(x.getKey()));

        int i = 0;
        int[][] result = new int[K][2];

        for(int index: listIndex){
            if(i==K)
                break;
            result[i++] = points[index];
        }
        return result;

    }

    public void example() {
        int[][] points = new int[][]{{2,2},{-2,-2},{1,3}};
        System.out.println("point "+points[0][0] + " "+points[0][1]);
        int[][] result = kClosest(points,2);
        System.out.println("result size = "+result.length);
        for(int i = 0; i < result.length;i++) {
            System.out.println(result[i][0] +" "+result[i][1]);
        }
    }
}
