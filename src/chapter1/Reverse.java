package chapter1;

import java.util.Stack;

public class Reverse {

	public static int getAndRemoveLastElement(Stack<Integer> stack){
		int result = stack.pop();
		if(stack.empty()){
			return result;
		}else {
			int last = getAndRemoveLastElement(stack);
			stack.push(result);
			return last;
		}
	}
	
	public static void reverse(Stack<Integer> stack){
		if (stack.isEmpty()) {
			return;
		}
		int i = getAndRemoveLastElement(stack);
		reverse(stack);
		stack.push(i);
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
//		Reverse.reverse(stack);
//		System.out.println(stack.size()+"--------");
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		
	}
}
