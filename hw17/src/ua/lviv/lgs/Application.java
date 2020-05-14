/**
 * Lesson 17 - Java core - Logos IT Academy
 */

package ua.lviv.lgs;

/**
 * @author alexl
 *
 */


public class Application {

	public static void main(String[] args) {
		
		
		Number [] array = {1, 2, 4333, -21.0, 542, -91, 104, -812, 10, 69, 516.0, 1.5, 16, -2.0, -98, 22.0, 21, 18, -91, -24, 15};
		System.out.println("Original array of " + array.length + " elements:" );
		for (int i = 0; i < array.length; i++) {
			Number number = array[i];
			System.out.println(number);
		}
		Collection collection = new Collection(array);
		System.out.println();
		Iterator iteratorFirst = collection.createFirst();
		System.out.println("The output of First array - evens are replaced with 'zero'[0]");
		while (iteratorFirst.hasNext()) {
			System.out.println(iteratorFirst.next());
			
		}
		
		
		System.out.println();
		
		Iterator iteratorSecond = collection.createSecond();
		System.out.println("The output of Second array - backward each second to output");
		while (iteratorSecond.hasNext()) {
			System.out.println(iteratorSecond.next());
			
		}
		
		System.out.println();
		
		Iterator iteratorThird = collection.createAnonymousIterator();
		System.out.println("The output of Third array - backward each 3th elements checking for odd");
		while (iteratorThird.hasNext()) {
			Number next = iteratorThird.next();
			if(next!=null) 
			System.out.println(next);
			
		}
		
		System.out.println();
		
		Iterator iteratorFourth = collection.createLocalIterator();
		System.out.println("The output of Fourth array - forward each 5th elements checking for even (even + 100)");
		while (iteratorFourth.hasNext()) {
			Number next = iteratorFourth.next();
			System.out.println(next);
			
		}
		
		System.out.println();
		
		Iterator iteratorFifth = Collection.createFifthIterator();
		System.out.println("The output of Fifth array - forward each second elements checking for even (even + 1 and output)");
		while (iteratorFifth.hasNext()) {
			Number next = iteratorFifth.next();
			if (next !=null)
			System.out.println(next);
			
		}
		
		
		
	}

}
