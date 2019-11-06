package ch19Exercise2;

public class Ch19Listing1 {

	public void runExample() {
		GenericStack<String> stack1 = new GenericStack<>();
		stack1.push("London");
		stack1.push("Paris");
		stack1.push("Berlin");
		System.out.println("Top of Stack: " + stack1.pop());
		System.out.println("Top of Stack: " + stack1.pop());
		System.out.println("Top of Stack: " + stack1.pop());
		
		
		GenericStack<Integer> stack2 = new GenericStack<>();
		stack2.push(1); // autoboxing 1 to new Integer(1)
		stack2.push(2);
		stack2.push(3);
		
	}

}
