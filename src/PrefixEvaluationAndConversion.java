import java.io.*;
import java.util.*;

public class PrefixEvaluationAndConversion {


  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    Stack<Integer> value = new Stack<>();
    Stack<String> infix = new Stack<>();
    Stack<String> postfix = new Stack();

    for (int i = exp.length() - 1; i >= 0; i--)
    {
      char ch = exp.charAt(i);
      if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
      {
        int val1 = value.pop();
        int val2 = value.pop();
        int val = operation(val1, val2, ch);
        value.push(val);

        String val11 = infix.pop();
        String val21 = infix.pop();
        String val123 = "(" + val11 + ch + val21 + ")";
        infix.push(val123);

        String val13 = postfix.pop();
        String val23 = postfix.pop();
        String val1234 = val13 + val23 + ch + "";
        postfix.push(val1234);




      }
      else
      {
        value.push(ch - '0');
        infix.push(ch + "");
        postfix.push(ch + "");
      }
    }

    System.out.println(value.pop());
    System.out.println(infix.pop());
    System.out.println(postfix.pop());


    // code
  }

  public static int operation(int val1, int val2, char ch)
  {
    if (ch == '+')
      return val1 + val2;
    else if (ch == '-')
      return val1 - val2;
    else if (ch == '*')
      return val1 * val2;
    else
      return val1 / val2;
  }
}
