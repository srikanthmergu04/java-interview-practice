package practice;

public class DoublyLinkedListWithChilds {

    public DoublyLinkedListWithChilds next;
    public DoublyLinkedListWithChilds previous;
    public DoublyLinkedListWithChilds child;
    public int value;

    DoublyLinkedListWithChilds(int value){
        this.value = value;
    }

    public static void main(String[] args) {

        DoublyLinkedListWithChilds head = new DoublyLinkedListWithChilds(1);

        DoublyLinkedListWithChilds prev = null;
        DoublyLinkedListWithChilds next = null;

        head.previous = null;
        head.next = null;

        int i = 0;
        DoublyLinkedListWithChilds current = head;
        while(i < 9){
            current.previous = prev;
            current.next = new DoublyLinkedListWithChilds(i);

            current = current.next;
            prev = current;
            i++;
        }

        head.previous = null;
        head.next = null;

        i = 5;
        current = head;
        while(i < 9){
            current.previous = prev;
            current.next = new DoublyLinkedListWithChilds(i);

            current = current.next;
            prev = current;
            i++;
        }

        head.previous = null;
        head.next = null;

        i = 7;
        current = head;
        while(i < 9){
            current.previous = prev;
            current.next = new DoublyLinkedListWithChilds(i);

            current = current.next;
            prev = current;
            i++;
        }

    }

}
