package JavaCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    List<List<Integer>> result = new ArrayList();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println("arraysort = "+Arrays.toString(nums));
        List<Integer> list = new ArrayList();
        dfs(0, nums, 0, new ArrayList<Integer>());
        return result;
    }

    public void dfs(int start, int[] nums, int sum, List<Integer> list){
        if(list.size() == 3){
            if(sum == 0  && !result.contains(list)){
                System.out.println("List = "+list.toString() +" sum = "+sum);
                result.add(new ArrayList<Integer>(list));
            }
            return;
        }

        for(int i = start; i < nums.length; i++){
            list.add(nums[i]);
            dfs(start + 1, nums, sum + nums[i], list);
            list.remove(list.size() - 1);
        }
    }

    public void test(){
        int[] nums = new int[]{1, -1 , -1, 0};
        List<List<Integer>> result = threeSum(nums);
        for(int i = 0; i < result.size(); i++){
            System.out.println(" result "+ result.get(i).toString());
        }
    }
}
