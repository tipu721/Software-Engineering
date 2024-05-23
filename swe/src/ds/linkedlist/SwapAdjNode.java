package ds.linkedlist;

class Node{
    Integer value;
    Node nextNode;
    Node(Integer value){
        this.value = value;
        nextNode = null;
    }
}

public class SwapAdjNode {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.nextNode = new Node(3);
        head.nextNode.nextNode = new Node(5);
        head.nextNode.nextNode.nextNode = new Node(7);

        while (head != null){
            System.out.println(head.value);
            head = head.nextNode;
        }
        System.out.println(head);

    }

}
