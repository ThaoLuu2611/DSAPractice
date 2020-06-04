package JavaCode;


import javax.swing.tree.TreeNode;
import java.util.*;

class VerticalOrderTraversal {
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int value){
            this.val = value;
            this.left = null;
            this.right = null;
        }
    }

    TreeMap<Integer, List<int[]>> map = new TreeMap();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        dfs(root, 0, 0);
        List<List<Integer>> list = new ArrayList();
        for(int i: map.keySet())
        {   List<int[]> myList = map.get(i);
           // Collections.sort(myList,new ListComparator());
            Collections.sort(myList,(a,b) -> { return a[0] < b[0] ? -1 : a[0] > b[0] ? 1 : (a[1] < b[1] ? -1 : a[1] > b[1] ? 1 : (0)); });
            List<Integer> verticalList = new ArrayList();

            for(int j = 0; j < myList.size(); j++){
                verticalList.add(myList.get(j)[1]);
            }
            list.add(verticalList);
        }
        return list;
    }

    class ListComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] a, int[] b) {
            return a[0] < b[0] ? -1 : a[0] > b[0] ? 1 : (a[1] < b[1] ? -1 : a[1] > b[1] ? 1 : (0));
        }
    }

    public void dfs(TreeNode root, int i, int j){
        if(root == null)
            return;
        if(map.containsKey(i)){
            map.get(i).add(new int[]{j, root.val});
        }
        else{
            List<int[]> list = new ArrayList();
            list.add(new int[]{j, root.val});
            map.put(i, list);
            //System.out.println("add new map = "+map + " i = "+i);
        }
        if(root.left != null){
            //  System.out.println("root = "+ root.val +" root left = "+root.left.val);
            dfs(root.left, i - 1, j + 1);
        }
        System.out.println("break");
        if(root.right != null){
            // System.out.println("root = "+ root.val + " root right = "+root.right.val);
            dfs(root.right, i + 1, j + 1);
        }
    }
}