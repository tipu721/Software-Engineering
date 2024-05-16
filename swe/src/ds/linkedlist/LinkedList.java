package ds.linkedlist;

public class LinkedList {

    Node head;
    static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = null;
        }

    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Node temp = linkedList.head = new Node(1);
        temp = temp.next = new Node(3);
        temp = temp.next = new Node(5);
        temp = temp.next = new Node(7);

        Node n1 = linkedList.head;
        Node n2 = linkedList.head.next;
        linkedList.head = n2;
        temp = linkedList.head;
        while(true){
            n1.next = n2.next;
            n2.next = n1;
            if(n1.next == null){
                break;
            }
            n1 = n1.next;
            n2 = n1.next;
        }
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

}
