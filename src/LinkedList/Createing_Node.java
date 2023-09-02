package LinkedList;

import java.util.Scanner;

class Node <T>{
    Node <T> next;
    T data;

    Node(T data){
        this.data=data;
        this.next=null;
    }

    public Node() {
    }
}
public class Createing_Node {

    private static Node<Integer>insertNode(){
        Node<Integer>head=null;
        Scanner sc=new Scanner(System.in);
        int data= sc.nextInt();
        while(data!=-1){
            Node<Integer> newnode=new Node<Integer>(data);
            if (head==null){
                head=newnode;
            }else{
                Node<Integer> temp=head;
                while(temp.next!=null){
                    temp =temp.next;
                }
                temp.next=newnode;
            }
            data=sc.nextInt();
        }
        return head;
    }
        

    }
    private static void printNode(Node head){
        while(head.next!=null){
            System.out.print(head.data+" ");
            head=head.next;
        } 
    }
    public static void main(String[] args) {
        Node<Integer> head = new Node<Integer>();
        printNode(head);
        
    }
    
}
