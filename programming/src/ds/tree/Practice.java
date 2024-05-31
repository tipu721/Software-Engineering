package ds.tree;


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
public class Practice {
    private static void traverse(Node root) {

        if(root == null){
            return;
        }
        traverse(root.left);
        System.out.println(root.value);
        traverse(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        traverse(root);
    }


}
