package stacknqueue;

public class Main {
  public static void main(String[] args) {
    bridgeSolution s = new bridgeSolution();
//    int[] truck_weight = {7, 4, 5, 6};
    int[] truck_weight = {10};
    int answer = s.solution(100, 100, truck_weight);
    System.out.println(answer);
  }
}
