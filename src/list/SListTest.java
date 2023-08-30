package list;

import java.util.LinkedList;

public class SListTest {
  public static void main(String[] args) {
    SLinkedList sl = new SLinkedList();
    Node<Integer> node = new Node<>(10);
    sl.addFirst(node);
    System.out.println(sl.size());
    Node<Integer> node2 = new Node<>(20);
    sl.addFirst(node2);
    for (:sl) {
      System.out.println();
    }
  }
}
