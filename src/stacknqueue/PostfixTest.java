package stacknqueue;

public class PostfixTest {
  public static void main(String[] args) {
    ListStack<String> stack = new ListStack<>();
    String[] ops = {"8","3","2","+","1","-","/"};
    int num1 = 0, num2 = 0, res = 0;
    for (String op:ops) {
      if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
        num2 = Integer.parseInt(stack.pop());
        num1 = Integer.parseInt(stack.pop());
        res = calculation(num1, op, num2);
      //stack.push(res + "");
        stack.push(String.valueOf(res));
      } else {
        stack.push(op);
      }
    }
    if(!stack.isEmpty()) {
      System.out.println("계산결과는 " + stack.pop() + "입니다.");
    }
  }
  public static int calculation(int num1, String op, int num2) {
    int result = 0;
    switch (op) {
      case "+" :
        result = num1 + num2;
        break;
      case "-" :
        result = num1 - num2;
        break;
      case "*" :
        result = num1 * num2;
        break;
      case "/" :
        result = num1 / num2;
        break;
    }
    return result;
  }
}
