package hashtable;

import java.util.Hashtable;
import java.util.Map;

public class MapDemo {
  public static void main(String[] args) {
    Chaining<Integer, String> c = new Chaining<>();
    Chaining.Node[] a = new Chaining.Node[13];
    c.put(10, "A");
    c.put(23, "B");
    c.put(36, "C");

    System.out.println(c.get(36));
    System.out.println(c);
  }
}
