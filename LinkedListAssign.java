package LinkedList;

public class LinkedListAssign  <T>{

    static Node head;
    Node tail;
    static class Node<T>{
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void append(int data){
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
        }
        else {

            Node last = head;
            while (last.next != null) {
                last = last.next;
            }


            last.next = new_node;
        }

    }


    public static void printList(LinkedListAssign list) {
        if(list.head == null){
            System.out.println("LinkedList is empty");
        }
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public void insert(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node<T> temp, current;
            current = head;
            temp = head.next;
            current.next = newNode;
            newNode.next = temp;
        }
    }

    public static void main(String[] args){
        System.out.println("Welcome to Linked List Assignment");
        LinkedListAssign list = new LinkedListAssign();// UC2


        list.append( 70);//UC3
        list.append(56);
        list.insert(30);//UC4

        printList(list);
    }
}