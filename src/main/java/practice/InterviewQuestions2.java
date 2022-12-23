package practice;

public class InterviewQuestions2 {

/*    single linked list find middle element without using streams ,set, collection try to do your own logic

    write singleton design pattern in multithreading*/

    public static void main(String[] args) {

        Node node1 = new Node(10);
        Node node2 = new Node(20);
        node1.next = node2;
        Node node3 = new Node(30);
        node2.next = node3;
        Node node4 = new Node(40);
        node3.next = node4;
        Node node5 = new Node(50);
        node4.next = node5;
        node5.next = null;

        System.out.println("Node value: "+getMiddleNode(node1).value);


    }

    public static Node getMiddleNode(Node head){

        Node mid = null;

        int midPos = getLengthOfLinkedList(head)/2;

        int i = 0;

        while (head != null){

            if(i == midPos){
                return head;
            }

            head = head.next;
            i++;
        }

        return null;

    }
    public static int getLengthOfLinkedList(Node head){
        int length = 0;

        while(head != null){
            head = head.next;
            length++;
        }

        return length;



    }

    static class Node {
        public int value;
        public Node next;

        Node(int value){
            this.value = value;
        }
    }

}
