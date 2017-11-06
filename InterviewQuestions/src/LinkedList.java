/**
 * Created by vyshaalnarayanam on 11/6/17.
 */
public class LinkedList {

  public Node head;

  public class Node{
    public int data;
    public Node next;

    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  public LinkedList(){
    this.head = null;
  }

  public void appendNode(int x){
    Node newNode = new Node(x);
    if(head == null){
      head = newNode;
    }
    else {
      Node n = head;
      while (n.next != null) {
        n = n.next;
      }
      n.next = newNode;
    }
  }

  public void printList(){
    Node n = head;
    while(n != null){
      System.out.println(n.data);
      n = n.next;
    }
  }

  public void reverseList(){
    Node prev = null;
    Node current = head;
    Node next;
    while(current != null){
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    this.head = prev;
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.appendNode(1);
    list.appendNode(2);
    list.appendNode(3);
    list.appendNode(4);
    list.printList();
    list.reverseList();
    list.printList();
  }
}
