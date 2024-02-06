package Stack;

import java.util.Scanner;

class Stack {

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return (top < 0);
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }


    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
    }
}

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        System.out.println("Operation Choose by user: \n1.push\n2.pop\n3.peek\n4.print");{
            while(true){
                int n=sc.nextInt();
                if(n==1){
                    System.out.println("Enter the number :  ");
                    int data = sc.nextInt();
                    s.push(data);
                }else if(n==2){
                    s.pop();
                }else if(n==3){
                    s.peek();
                }else if(n==4){
                    s.print();
                }
            }
        }
    }
}