package JavaCode;
import java.util.*;
public class CombinationsSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(candidates, 0, target, 0, temp, result);
        return result;
    }

    private void helper(int[] candidates, int start, int target, int sum,
                        List<Integer> list, List<List<Integer>> result) {
        if (sum > target) {
            return;
        }

        if (sum == target) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            list.add(candidates[i]);
            helper(candidates, i, target, sum + candidates[i], list, result);
            list.remove(list.size() - 1);
        }
    }

    public void test(){
        List<List<Integer>> list = new ArrayList();
        int[] candidates = {2,3,5};
        int target = 8;
        list = combinationSum(candidates, target);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
