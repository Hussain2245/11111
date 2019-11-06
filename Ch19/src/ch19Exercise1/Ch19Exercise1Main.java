package ch19Exercise1;

import ch19Exercise2.Ch19Listing1;

public class Ch19Exercise1Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		/* (Revising Listing 19.1) 
		 * Revise the GenericStack class in Listing 19.1 to implement
		 * it using an array rather than an ArrayList. 
		 * You should check the array size before adding a new element to the stack. 
		 * If the array is full, create a new array that
		 * doubles the current array size and copy the 
		 * elements from the current array to the new array.
		 */

		// TODO get listing 19.1 working
		Ch19Listing1 c19L1 = new Ch19Listing1();
		c19L1.runExample();
		System.out.println("It ran for 19.1.");

	}

}
