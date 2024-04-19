package ds.tree.bst;



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

    private Node search(Node node ,int element) {

        if(node == null){
            return null;
        }
        if(node.value == element)
            return node;
        if(element < node.value){
            return search(node.left , element);
        }
        else if(element > node.value){
           return search(node.right, element);
        }
        return null;
    }

    private Node deleteNode(Node root, int element) {
        if(root == null){
            System.out.println("element to be deleted not found in BST");
            return root;
        }
        if(root.value == element){
            if(root.left == null && root.right == null){
                System.out.println("successfully deleted "+element);
                return null;
            }
            else if(root.left == null){
                System.out.println("successfully deleted "+element);
                return root.right;

            }
            else if(root.right == null){
                System.out.println("successfully deleted "+element);
                return root.left;
            }
            else if(root.right != null && root.left != null){
                
            }
        }
       if(element < root.value){
            root.left = deleteNode(root.left, element);
       }
       else if(element > root.value){
            root.right = deleteNode(root.right, element);

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
        System.out.println("After insert new value");
        bst.traverse(bst.root);
        System.out.println("Search an element in BST");
        Node foundNode = bst.search(bst.root,7);
        if(foundNode == null){
            System.out.println("Element is not found");
        }
        else{
            System.out.println(foundNode.value + " is found in Bnary Search Tree");
        }
        bst.traverse(bst.root);
        System.out.println("Insert value to be deleted");
        bst.deleteNode(bst.root, 10);
        bst.traverse(bst.root);
    }

}
