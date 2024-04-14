package dsa.tree.bst;



class Node{
    int value;
    Node left , right;
    Node(int value){
        this.value = value;
        this.left = this.right = null;
    }
}

public class BinarySearchTree {

    Node root ;

    void traverse(Node root){
        if(root == null){
            return;
        }
        traverse(root.left);
        System.out.println(root.value); //inorder(left - root - right)
        traverse(root.right);
    }
    //using dfs
    Node insert(Node root, int value){


        if(root == null){
           root = new Node(value);
           return root;
        }

        if(value < root.value){
           root.left  = insert(root.left, value);
        }
        else if(value > root.value){
           root.right = insert(root.right, value);
        }

        return root;

    }



    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = new Node(8);
        bst.root.left = new Node(3);
        bst.root.right = new Node(10);
        bst.root.right.right = new Node(14);

        bst.traverse(bst.root);
        bst.insert(bst.root, 7);
        System.out.println("After inser new value");
        bst.traverse(bst.root);






    }
}
