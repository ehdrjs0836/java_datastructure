package stacknqueue;

import java.util.LinkedList;
import java.util.Queue;

public class bridgeSolution {
  public static int solution(int bridge_length, int weight, int[] truck_weight) {
    int answer = 0;
    int sum_w = 0,w;
    Queue<Integer> q = new LinkedList<>();

    for (int t:truck_weight) {
      while (true) {
        if (q.isEmpty()) {
          q.add(t);
          sum_w += t;
          answer++;
          break;
        } else if (q.size() == bridge_length) {
          w = q.poll();
          sum_w -= w;
        } else {
          if (sum_w + t > weight) {
            q.add(0);
            answer++;
            break;
          } else {
            q.add(t);
            sum_w += t;
            answer++;
            break;
          }
        }
      } //while문
    } //for문
    return answer;
  }
}