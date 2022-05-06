
public class StackUsingArray {
	int[] stack;
	int top;
	int capacity;
	
	StackUsingArray(int capacity)
	{
		stack=new int[capacity];
		top=0;
		this.capacity=capacity;
	}
	
	public int size()
	{
		return top;
	}
	
	public boolean isEmpty()
	{
		if(top==0)
			return true;
		else
			return false;
	}
	
	public void push(int data)
	{
		if(top==capacity)
		{
			System.out.println("Stack Overflow");
			return ;
		}
		stack[top]=data;
		top++;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Undrflow");
			return Integer.MIN_VALUE;
		}
		return stack[--top];
	}
	
	public int top()
	{
		if(isEmpty())
		{
			System.out.println("Stack Underflow");
			return Integer.MIN_VALUE;
		}
		 int n=stack[top-1];
		 return n;
	}
	
	public void display()
	{
		int i=top-1;
		for(int j=i;j>=0;j--)
		{
			System.out.print(stack[j]+" ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingArray st=new StackUsingArray(5);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.top());
		
		System.out.println(st.pop());
		
		st.display();
		System.out.println(st.top());
		
		System.out.println(st.pop());
		st.display();
		System.out.println(st.top());
		
		System.out.println(st.pop());
		st.display();
		
		
		
		

	}

}
