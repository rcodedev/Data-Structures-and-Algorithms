package Stack;

public class Stack {
	public static void main(String[] args) {
		StackLogic sl= new StackLogic(5);
		sl.push(10);
		sl.push(20);
		sl.push(30);
		sl.push(50);
		sl.push(150);
		sl.push(250);
		
		System.out.println();
		sl.pop();
		sl.pop();
		sl.pop();
		
		System.out.println();
		sl.peek();
		
		
		System.out.println();
		sl.delete();		
	}

}
class StackLogic{
	int[] stack;
	int topOfStack;
	public StackLogic(int size) {
		stack = new int[size];
		topOfStack=-1;
	}
	public boolean isEmpty() {
		return topOfStack == -1;
	}
	public boolean isFull() {
		return topOfStack == stack.length-1;
	}
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}
		else {
			stack[++topOfStack]=value;
			System.out.println("The Value: "+value+" is push to the Stack");
		}
	}
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			int value = stack[topOfStack];
			topOfStack--;
			System.out.println("The value: "+value+" pop from the stack");
		}
	}
	public void peek() {
		if(isEmpty()) {
			System.out.println("The Stack is Empty");
		}
		else {
			System.out.println("The peek value is "+stack[topOfStack]);
		}
	}
	public void delete() {
		stack = null;
		System.out.println("Stack is deleted");
	}
}