package LinkedList.Basic;

public class AdvanceLinkedList {
    public static class Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data = data;
        }
    }

    static void main() {
        System.out.println("Method 1");
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        head = a;
        tail=e;
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        System.out.println("------------------------------------------");
        display();
        System.out.println();
        reversedisplay();
    }
    public static Node head;
    public static Node tail;
    public static void display()
    {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }
    }

    public static void reversedisplay(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp = temp.prev;
        }
        System.out.println("null");
    }
//    Insert first
    public static void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
//    Insert Last
    public static void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
}
