package JavaCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {
    //Traverse the node as deep as possible (deeper and deeper)
    Node node;
    class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public Node insert(Node node, int value){
        if(node == null)
            return new Node(value);
        else if(value < node.value)
            node.left = insert(node.left, value);
        else if(value > node.value)
            node.right = insert(node.right, value);
        return  node;
    }

    /*
    1. Traverse the left subtree
    2. Visit node
    3. Traverse the right subtree
     */
    public void inOrder(Node node){
        if(node == null)
            return;
        inOrder(node.left);
        System.out.println(node.value + " ");
        inOrder(node.right);
    }

    public void preOrder(Node node){
        if(node == null)
            return;
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node){
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }

    //traverse in order without recursion
    public void inorderIteration(Node root) {
        Stack<Node> stack = new Stack<>();
        while(true) {
            while(root != null)
            {
                stack.push(root);
                root = root.left;
            }
            if(stack.isEmpty())
                return;
            Node node = stack.pop();
            System.out.println(node.value);
            root = node.right;
        }
    }

    //traverse preOrder without recursion
    public void preOrderInteration(Node root){
        Stack<Node> stack = new Stack<>();
        while(true){
            while(root != null){
                System.out.println(root.value);
                stack.push(root);
                root = root.left;
            }
            if(stack.isEmpty())
                return;
            Node node = stack.pop();
            root = node.right;
        }
    }

    public List<Integer> postorderTraversal(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            root = stack.pop();
            list.add(0, root.value);

            if(root.left != null) stack.push(root.left);
            if(root.right != null) stack.push(root.right);
        }

        return list;
    }
    public List<Integer> postorderTraversal1(Node root) {
        List<Integer> list = new LinkedList();
        Stack<Node> stack = new Stack();
        while(true){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            if(stack.isEmpty())
                break;
            if(stack.peek().right == null){
                Node node = stack.pop();
                list.add(node.value);

                while(!stack.isEmpty() && node == stack.peek().right){
                    node = stack.pop();
                    list.add(node.value);
                }
                if(stack.isEmpty())
                    break;
            }
            root = stack.peek().right;
        }
        return list;
    }

    //traverse postOrder without recursion
    public void postOrderInteration(Node root){
       Stack<Node> stack = new Stack();
       while(true){
           while(root != null){
               stack.push(root);
               root = root.left;
           }
           if(stack.isEmpty())
               return;
        //   if(stack.peek().right == null){
               Node node = stack.pop();
               System.out.println(node.value);
               if(node == stack.peek().right){
                   Node node1 = stack.pop();
                   System.out.println(node1.value);
               }
        //   }
           if(stack.isEmpty())
               return;
           root = stack.peek().right;
       }
    }

    public void printDFS(){
        node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
      //  System.out.println(" Inorder");

        //inOrder(node);k
       // preOrder(node);

        postOrder(node);
        System.out.println(" Inorder without recurtion");
        inorderIteration(node);
       // System.out.println(" preorder without recursion");
        //preOrderInteration(node);
        System.out.println(" postOrder without recursion");
       // postOrderInteration(node);
        postorderTraversal(node);
    }
}
