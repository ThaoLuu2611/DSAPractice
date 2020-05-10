package JavaCode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class BreadthFirstSearch {
    class Node{
        Node left;
        Node right;
        int value;
        Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    public Node insert(Node node, int value){
        if(node == null)
            return new Node(value);
        else if(node.value > value)
            node.left = insert(node.left, value);
        else if(node.value < value)
            node.right = insert(node.right, value);
        return node;
    }

    public void displayLineOrder(Node node){
        Queue<Node> queue = new LinkedList<>();
        if(node != null)
            queue.add(node);
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size > 0){
                Node mNode = queue.remove();
                System.out.print(mNode.value + " ");
                if(mNode.left != null)
                    queue.add(mNode.left);
                if(mNode.right != null)
                    queue.add(mNode.right);
                size--;
            }
            System.out.println();
        }
    }


    public void printTree() {
        Node node = new Node(27);
        insert(node, 14);
        insert(node, 35);
        insert(node, 10);
        insert(node, 19);
        insert(node, 31);
        insert(node, 42);
        //displayBFS(node);
        displayLineOrder(node);
    }

}
