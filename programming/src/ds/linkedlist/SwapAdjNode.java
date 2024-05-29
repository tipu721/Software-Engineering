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

        Node temp = head;

        Node prev = head;
        Node p1 = head;
        Node p2 = head.nextNode;
        head = p2;
        while(true){
            p1.nextNode = p2.nextNode;
            p2.nextNode = p1;
            head = p2;
        }


    }

}
