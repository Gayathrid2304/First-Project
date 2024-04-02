import java.util.*;
class Linked {
    Node head;
    Node tail;
    int size;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public void insertEnd(int data){
        Node node = new Node(data);
        if(head == null){
            head = tail = node;
            size++;
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }
    public void display(int a){
        Node temp = head;
        for(int i = 1; i<a ; i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Linked l = new Linked();
        for(int i = 0; i<n; i++){
            l.insertEnd(sc.nextInt());
        }
        int a = sc.nextInt();
        l.display(a);
        sc.close();
    }
}