import java.io.*;
import java.util.*;

public class BalancedBracket {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    Stack<Character> st = new Stack<>();

    for (int i = 0 ; i < str.length(); i++)
    {
      if (str.charAt(i) == ')')
      {
        if (st.size() != 0 && st.peek() == '(')
        {
          st.pop();
          continue;
        }
        else
        {
          System.out.println(false);
          return;
        }
      }
      else if (str.charAt(i) == '}')
      {
        if (st.size() != 0 && st.peek() == '{' )
        {
          st.pop();
          continue;
        }
        else
        {
          System.out.println(false);
          return;
        }
      }
      else if (str.charAt(i) == ']' )
      {
        if (st.size() != 0 && st.peek() == '[')
        {
          st.pop();
          continue;
        }
        else
        {
          System.out.println(false);
          return;
        }
      }
      else if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
      {
        st.push(str.charAt(i));
      }

    }
    if (st.size() == 0)
      System.out.println(true);
    else
    {
      System.out.println(false);
    }

  }

}
