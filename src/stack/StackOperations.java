package stack;

public class StackOperations {
	public static void main(String[] args) {
		System.out.print("Stack: \n");
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.peek();
		System.out.print("Stack after pop operation: \n");
		stack.pop();
		stack.print();
	}
}