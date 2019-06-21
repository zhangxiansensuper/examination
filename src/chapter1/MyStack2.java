package chapter1;

import java.util.Stack;

public class MyStack2 {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	
	public MyStack2(){
		this.stackData = new Stack<Integer>();
		this.stackMin = new Stack<Integer>();
	}
	
	public void push(int newNum){
		stackData.push(newNum);
		if(stackMin.isEmpty()){
			stackMin.push(newNum);
		}else if(newNum <= stackMin.peek()){
			stackMin.push(newNum);
		}else{
			stackMin.push(stackMin.peek());
		}
	}
	
	public int pop(){
		if(stackData.isEmpty()){
			throw new RuntimeException("This stack is empty!");
		}
		int value = stackData.pop();
		stackMin.pop();
		return value;
	}
	
	public int getMin(){
		if(stackMin.isEmpty()){
			throw new RuntimeException("This stack is empty!");
		}
		return stackMin.peek();
	}
	
	public static void main(String[] args) {
		MyStack2 stack2 = new MyStack2();
		stack2.push(3);
		stack2.push(4);
		stack2.push(5);
		stack2.push(1);
		stack2.push(2);
		stack2.push(1);
		stack2.pop();
		System.out.println(stack2.getMin());
		stack2.pop();
		System.out.println(stack2.getMin());
		stack2.pop();
		System.out.println(stack2.getMin());
		stack2.pop();
		System.out.println(stack2.getMin());
		stack2.pop();
		System.out.println(stack2.getMin());
		stack2.pop();
		System.out.println(stack2.getMin());
	}
}
