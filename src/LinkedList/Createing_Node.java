package LinkedList;


class Node <T>{
    Node <T> next;
    T data;

    Node(T data){
        this.data=data;
        this.next=null;
    }
}
public class Createing_Node {
    private static void printNode(Node head){
        while(head.next!=null){
            System.out.print(head.data+" ");
            head=head.next;
        } 
    }
    public static void main(String[] args) {
        Node Node1 = new Node(10);
        Node Node2 = new Node(20);
        Node Node3 = new Node(30);
        Node Node4 = new Node(40);

        Node1.next=Node2;
        Node2.next = Node3;
        Node3.next=Node4;
        Node head=Node1;

        printNode(head);
        
    }
    
}
