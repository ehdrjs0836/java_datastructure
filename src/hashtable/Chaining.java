package hashtable;

public class Chaining<K,V> {
  //인스턴스 변수
  private int M = 13; // 테이블 크기
  private Node[] a = new Node[M]; // 해시 테이블
  //정적 중첩 클래스
  public static class Node {
    //인스턴스 변수
    private Object key;
    private Object data;
    private Node next;
    //생성자
    public Node(Object key, Object data, Node next) {
      this.key = key;
      this.data = data;
      this.next = next;
    }
    //게터
    public Object getKey() { return key; }
    public Object getData() { return data; }
  } // Node 클래스
  //메서드
  private int hash(K key) { // 해시코드
    return (key.hashCode() & 0x7fffffff) % M;
  } // 나눗셈 연산

  public V get(K key) { // 탐색 연산
    int index = hash(key);
    for (Node x = a[index]; x != null; x = x.next) { // 연결리스트 검색
      if(key.equals(x.key)) {
        return (V) x.data; // 탐색 성공
      } //if
    } //for
    return null; // 탐색 실패
  }
  public void put(K key, V data) { // 삽입 연산
    int index = hash(key);
    for (Node x = a[index]; x != null; x = x.next) {
      if (key.equals(x.key)) { // 이미 key 존재
        x.data = data; // 데이터만 갱신
        return;
      } // if
    } // for
    a[index] = new Node(key, data, a[index]); // 연결 리스트의 첫 노드로 삽입
  }

  @Override
  public String toString() {
    String str = "";
    for (int i = 0; i < a.length; i++) {
      str += i;
      for (Node x = a[i]; x != null; x = x.next) {
        str += "->[" + x.key + "," + x.data + "]";
      }
      str += "\n";
    }
    return str;
  }
}
