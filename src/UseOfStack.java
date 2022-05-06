import java.util.Stack;

public class UseOfStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		st.push(10);
		System.out.println(st.size()+" "+st.peek()+" "+st);
		st.push(20);
		System.out.println(st.size()+" "+st.peek()+" "+st);
		st.push(30);
		System.out.println(st.size()+" "+st.peek()+" "+st);
		st.push(40);
		System.out.println(st.size()+" "+st.peek()+" "+st);
		System.out.println(st.pop());
		System.out.println(st.size()+" "+st.peek()+" "+st);
		System.out.println(st.pop());
		System.out.println(st.size()+" "+st.peek()+" "+st);
		System.out.println(st.pop());
		System.out.println(st.size()+" "+st.peek()+" "+st);
		System.out.println(st.pop());
		System.out.println(st.size()+"  "+st);
		

	}

}
