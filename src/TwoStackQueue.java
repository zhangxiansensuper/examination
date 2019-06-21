import java.util.Scanner;
import java.util.Stack;


public class TwoStackQueue {
	public Stack<Integer> stackPush;
	public Stack<Integer> stackPop;
	
	public TwoStackQueue(){
		stackPush = new Stack<Integer>();
		stackPop = new Stack<Integer>();
	}
	
	public void add(int pushInt){
		stackPush.push(pushInt);
	}
	
	public int poll(){
		if(stackPush.empty() && stackPop.empty()){
			throw new RuntimeException("This stack is empty!");
		}else if(stackPop.empty()){
			while(!stackPush.empty()){
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.pop();
	}
	
	public int peek(){
		if(stackPush.empty() && stackPop.empty()){
			throw new RuntimeException("This stack is empty!");
		}else if(stackPop.empty()){
			while(!stackPush.empty()){
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.peek();
	}
	
	public static void main(String[] args) {
		TwoStackQueue stackQueue = new TwoStackQueue();
		Scanner input = new Scanner(System.in);
		int j = input.nextInt();
		for(int i = 0;i<j;i++){
			stackQueue.add(i+1);
		}
		for (int i = 0; i < j; i++) {
			System.out.println(stackQueue.poll());
		}
	}
}
