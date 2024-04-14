package dsa.tree.bt;


import java.util.LinkedList;
import java.util.Queue;

class Node{
    int value, level;
    Node left, right;
    Node(int value){
        this.value = value;
        left = right = null;
    }
}

public class BinaryTree {
    Node root = null;


    //trave with dfs
    void traverse(Node root){
        if(root == null){
            return;
        }
//        System.out.println(root.value);   //preorder
        traverse(root.left);
//        System.out.println(root.value);   //inorder
        traverse(root.right);
        System.out.println(root.value);     //postorder
    }
    //find max height with bfs
    int bfs(Node root){
        Queue<Node>queue = new LinkedList<>();
        int level = root.level;
        queue.add(root);
        while (!queue.isEmpty()){

            System.out.println(queue.element().value);
            if(queue.element().left != null){
                queue.element().left.level = queue.element().level + 1;
                queue.add(queue.element().left);

            }
            if(queue.element().right != null){
                queue.element().right.level = queue.element().level + 1;
                queue.add(queue.element().right);
            }

            if(queue.size() == 1){
                level = queue.element().level;
            }
            queue.remove(queue.element());


        }
        return level;
    }



    //insert with bfs
    void insert(Node root, Integer newValue){
        Queue<Node>queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            if(queue.element().left != null){
                queue.add(queue.element().left);
            }
            else {
                queue.element().left = new Node(12);
                return;
            }

            if(queue.element().right != null){
                queue.add(queue.element().right);
            }
            else {
                queue.element().right = new Node(12);
                return;
            }
        }
    }


    //max dept with dfs
    int maxLevel(Node root){
        if(root == null){
            return 0;
        }
        maxLevel(root.left);
        maxLevel(root.right);
        return Math.max(maxLevel(root.left)+1, maxLevel(root.right)+1);
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(10);
        tree.root.right.left = new Node(11);
        tree.root.right.right = new Node(13);
        tree.root.left.left.left = new Node(5);
        tree.root.left.left.right = new Node(3);
        tree.root.left.left.right.left = new Node(10);

        tree.root.level = 0;
        System.out.println("Height with BFS: " +(tree.bfs(tree.root)+1));
        System.out.println("Traverse with DFS: ");
        tree.traverse(tree.root);
        System.out.println("Height with DFS: "+tree.maxLevel(tree.root));
        System.out.println("Inser 12 in first available");
        tree.insert(tree.root, 12);
        System.out.println("Traverse with DFS: ");
        tree.traverse(tree.root);

    }
}
