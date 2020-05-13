package JavaCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KSmallestElementinBFS {
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList();
        List<Integer> list = new ArrayList();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if(list.isEmpty())
                list.add(node.val);
            else{
                var top = list.get(list.size() - 1);
                if(top > node.val){
                    var x = list.get(0);
                    list.set(list.get(0) - 1, node.val);
                    list.add(top);
                } else
                    list.add(node.val);
            }
            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }

        return list.get(k-1);

    }
}
