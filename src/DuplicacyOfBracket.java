//((a + b) + (c + d)) -> false
//(a + b) + ((c + d)) -> true
//In this we have to check whether inside closing and opening bracket is there any content
//if yes then no duplicacy else duplicacy

import java.io.*;
import java.util.*;

public class DuplicacyOfBracket {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    Stack<Character> st = new Stack<>();
    for (int i = 0; i < str.length(); i++)
    {
      if (str.charAt(i) == ')')
      {
        if (st.peek() == '(') {
          System.out.println(true);
          return;
        }
        else
        {
          while (st.peek() != '(')
          {
            st.pop();
          }
          st.pop();
        }
      }
      else
      {
        st.push(str.charAt(i));
      }
    }
    System.out.println(false);





  }

}