import java.io.*;
import java.util.*;

public class PostFixEvaluationConversion {


  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    Stack<Integer> value = new Stack<>();
    Stack<String> infix = new Stack<>();
    Stack<String> prefix = new Stack<>();

    for (int i = 0; i < exp.length(); i++)
    {
      char ch = exp.charAt(i);
      if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
      {
        int val2 = value.pop();
        int val1 = value.pop();
        int expValue = operation(val1, val2, ch);
        value.push(expValue);

        String str2 = infix.pop();
        String str1 = infix.pop();
        String exp1 = "(" + str1 + ch + str2 + ")";
        infix.push(exp1);

        String str22 = prefix.pop();
        String str21 = prefix.pop();
        String exp2 = ch + str21 + str22;
        prefix.push(exp2);
      }
      else
      {
        value.push(ch - '0');
        infix.push(ch + "");
        prefix.push(ch + "");
      }
    }
    System.out.println(value.pop());
    System.out.println(infix.pop());
    System.out.println(prefix.pop());


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