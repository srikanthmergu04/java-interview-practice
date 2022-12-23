package practice;

public class LinkedListExample {

    public static class Node{
        Node(int value){
            this.value = value;
        }
        public int value;
        public Node next;
    }

    public static void main(String[] args) {
        reverse();
    }

    public static void reverse(){
        Node node = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);

        node.next = node1;
        node1.next = node2;

        Node prev = null;
        Node current = node;
        while(current !=null){
            System.out.println(current.value);
            current = current.next;
        }

        System.out.println("\n\n");

        current = node;
        while(current != null){
            Node nextElement = current.next;
            current.next = prev;
            prev = current;
            current = nextElement;
        }

        current = prev;

        while(current !=null){
            System.out.println(current.value);
            current = current.next;
        }


    }


}
