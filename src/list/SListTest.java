package list;

import java.util.LinkedList;

public class SListTest {
  public static void main(String[] args) {
    SLinkedList sl = new SLinkedList();
    Node<Integer> node = new Node<>(50);
    //sl.addFirst(node);
    //sl.addLast(node);
    sl.add(0, node);
    System.out.println(sl.size());
    Node<Integer> node1 = new Node<>(40);
    sl.add(0, node1);
    System.out.println(sl.size());
    Node<Integer> node3 = new Node<>(30);
    sl.add(1, node3);
    System.out.println(sl.size());
    Node<Integer> node2 = new Node<>(10);
    sl.add(2,node2);
    System.out.println(sl.size());
    System.out.println(sl);

    System.out.println(sl.removeFirst() + "이 삭제됨");
    System.out.println(sl);
    System.out.println(sl.removeFirst() + "이 삭제됨");
    System.out.println(sl);
    System.out.println(sl.removeFirst() + "이 삭제됨");
    System.out.println(sl);
    System.out.println(sl.removeFirst() + "이 삭제됨");
    System.out.println(sl);

    LinkedList<Integer> ll = new LinkedList<>();
    ll.add(10);
    ll.add(20);
    System.out.println(ll);
    LinkedList<Integer> ll2 = new LinkedList<>();
    ll2.addLast(10);
    ll2.addLast(10);
    System.out.println(ll2); //add는 addLast와 동일하다.
  }
}
