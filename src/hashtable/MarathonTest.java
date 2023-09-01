package hashtable;

public class MarathonTest {
  public static void main(String[] args) {
    Marathon marathon = new Marathon();
    String[] part = {"leo","kiki","eden"};
    String[] comp = {"eden", "kiki"};
    System.out.println(marathon.solution(part, comp));
  }
}