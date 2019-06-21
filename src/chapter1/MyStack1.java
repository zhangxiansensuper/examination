package chapter1;

import java.util.Stack;

public class MyStack1 {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	
	public MyStack1(){
		this.stackData = new Stack<Integer>();
		this.stackMin = new Stack<Integer>();
	}
	public void push(int newNum){
		if(stackMin.isEmpty()){
			stackMin.push(newNum);
		}else if(newNum <= stackMin.peek()){
			stackMin.push(newNum);
		}
		stackData.push(newNum);
	}
	
	public int pop(){
		if(stackData.isEmpty()){
			throw new RuntimeException("This stack is empty!");
		}
		int value = stackData.pop();
		if(value == stackMin.peek()){
			stackMin.pop();
		}
		return value;
	}
	public int getMin(){
		if(stackMin.isEmpty()){
			throw new RuntimeException("This stack is empty");
		}
		return stackMin.peek();
	}
	
	public static void main(String[] args) {
		MyStack1 stack1 = new MyStack1();
		stack1.push(3);
		stack1.push(4);
		stack1.push(5);
		stack1.push(1);
		stack1.push(2);
//		System.out.println(stack1.getMin());
		stack1.pop();
		System.out.println(stack1.getMin());
		stack1.pop();
		System.out.println(stack1.getMin());
		stack1.pop();
		System.out.println(stack1.getMin());
		stack1.pop();
		System.out.println(stack1.getMin());
	}
}
