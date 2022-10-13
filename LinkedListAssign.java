package LinkedList;

public class LinkedListAssign {
   
        static Node head;
        static Node tail;
        static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static LinkedListAssign add (LinkedListAssign  list,int data){

            Node new_node = new Node(data);


            if (list.head == null) {
                list.head = new_node;
            } else {

                new_node.next = head;
                head = new_node;
            }

            return list;
        }


        public static void printList (LinkedListAssign list){
            Node currNode = list.head;

            System.out.print("LinkedList: ");

            while (currNode != null) {

                System.out.print(currNode.data + " -> ");

                currNode = currNode.next;
            }
            System.out.println("NULL");
        }


        public static void main (String[]args){
            System.out.println("Welcome to Linked List Assignment");
            LinkedListAssign list = new LinkedListAssign();// UC2


            list = add(list, 70);//UC2
            list = add(list, 30);
            list = add(list, 56);

            printList(list);
        }
    }
