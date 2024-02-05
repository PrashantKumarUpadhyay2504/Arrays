package LinkedList;

public class Linked_list {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    Node root;
    public void display(){
        Node temp=root;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public int Size(){
        Node temp=root;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public int getFirst() throws Exception {
        if(Size()==0){
            throw new Exception("Linked list is empty");
        }
        return root.data;
    }
    public int getLast() throws Exception {
        if(Size()==0){
            throw new Exception("Linked list is empty");
        }
        Node temp=root;
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp.data;
    }
    public int getIdx(int idx){
        Node temp=root;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    public void addLast(int val){
        Node nn=new Node(val);
        if(Size()==0){
            root=nn;
        }
        else{
            Node temp=root;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=nn;
        }
    }
    public void addFirst(int val){

        Node nn=new Node(val);
//        if(Size()==0){
//            root=nn;
//        }import java.util.Scanner;

public class MultiplicativeCipher {

    public static String encrypt(String plaintext, int key) {
        StringBuilder ciphertext = new StringBuilder();
        for (char c : plaintext.toCharArray()) {
            if (Character.isLowerCase(c)) {
                char encryptedChar = (char) (((c - 'a') * key % 26) + 'A');
                ciphertext.append(encryptedChar);
            } else {
                ciphertext.append(c);
            }
        }
        return ciphertext.toString();
    }

    public static String decrypt(String ciphertext, int key) {
        StringBuilder plaintext = new StringBuilder();
        int modInverse = -1;
        for (int i = 0; i < 26; i++) {
            if ((key * i) % 26 == 1) {
                modInverse = i;
                break;
            }
        }

        if (modInverse == -1) {
            System.out.println("The key does not have a multiplicative inverse.");
            return "";
        }

        for (char c : ciphertext.toCharArray()) {
            if (Character.isUpperCase(c)) {
                char decryptedChar = (char) ((((c - 'A') * modInverse) % 26) + 'a');
                plaintext.append(decryptedChar);
            } else {
                plaintext.append(c);
            }
        }
        return plaintext.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key;
        String text;

        while (true) {
            System.out.println("Multiplicative Cipher");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("3. Brute Force Decryption");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter plaintext (lowercase only): ");
                    scanner.nextLine();  // Consume the newline character
                    text = scanner.nextLine();
                    System.out.print("Enter key (an integer coprime with 26): ");
                    key = scanner.nextInt();
                    String ciphertext = encrypt(text, key);
                    System.out.println("Encrypted message (uppercase): " + ciphertext);
                    break;

                case 2:
                    System.out.print("Enter ciphertext (uppercase only): ");
                    scanner.nextLine();  // Consume the newline character
                    text = scanner.nextLine();
                    System.out.print("Enter key (an integer coprime with 26): ");
                    key = scanner.nextInt();
                    String decryptedText = decrypt(text, key);
                    System.out.println("Decrypted message (lowercase): " + decryptedText);
                    break;

                case 3:
                    System.out.print("Enter ciphertext (uppercase only): ");
                    scanner.nextLine();  // Consume the newline character
                    text = scanner.nextLine();
                    System.out.println("Brute Force Decryption:");
                    for (int i = 1; i < 26; i++) {
                        String possibleDecryption = decrypt(text, i);
                        System.out.println("Key " + i + ": " + possibleDecryption);
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
            }
        }
    }
}
        nn.next=root;
        this.root=nn;
    }
    public int removeFirst(){
        Node temp=root;
        root=root.next;
        return temp.data;
    }
    public int removeLast(){
        Node temp=root;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        Node remove=temp.next;
        temp.next=null;
        return remove.data;
    }
    public int removeAt(int idx){
        if(idx==0){
            removeFirst();
        }
        if(idx==Size()-1){
            removeLast();
        }
        Node temp=root;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        Node remove=temp.next;
        temp.next=temp.next.next;
        return remove.data;
    }
}