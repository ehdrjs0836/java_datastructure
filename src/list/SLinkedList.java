package list;

public class SLinkedList {
  //인스턴스 변수
  private Node head;
  private Node tail;
  private int size;

  //생성자
  public SLinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  //탐색,추가,삭제 연산 메서드
  public void addFirst(Node newNode) {
    if (size == 0) {
      tail = newNode;
    }
    newNode.setNext(head);
    head = newNode;
    size++;
  }

  public void addLast(Node newNode) {
    if (size == 0) {
      addFirst(newNode);
    } else {
      tail.setNext(newNode);
      tail = newNode;
      size++;
    }
  }

  public void add(int index, Node newNode) {
    if (index == 0) { //맨앞이면
      addFirst(newNode);
    } else { //중간이면
      Node prevNode = getNode(index - 1);
      newNode.setNext(prevNode.getNext());
      prevNode.setNext(newNode);
      size++;
    }
    if (newNode.getNext() == null) { //맨끝이면
      tail = newNode;
    }
  }

  public Node getNode(int index) { //중간에 끼워넣기 위해서
    Node x = head;
    for (int i = 0; i < index; i++) {
      x = x.getNext();
    }
    return x;
  }

  public Node getTail() {
    Node temp = head.getNext();
    while (temp.getNext() != null) {
      temp = temp.getNext();
    }
    return null;
  }

//  public Object removeFirst() {
//    Node temp = head;
//    head = temp.getNext();
//    temp.setNext(null);
//    size--;
//    return temp.getItem();
//  }

  public String removeFirst() {
    Node temp = head;
    head = temp.getNext();
    temp.setNext(null);
    size--;
    return temp.getItem().toString();
  }

  public int indexOf(Object item) {
    Node temp = head;
    int index = 0;

    while (temp.getItem() != item) {
      temp = temp.getNext();
      index++;

      if(temp == null) {
        return -1;
      }
    }
    return index;
  }

  public int size() {
    return size;
  }

  @Override
  public String toString() {
    String str = "[";
    if (size == 0) {
      str += "]";
    } else {
        Node x = head;
        for (int i = 0; i < size - 1; i++) {
          str += x.getItem() + ",";
          x = x.getNext();
        }
        str += x.getItem() + "]";
    }
    return str;
  }
}
