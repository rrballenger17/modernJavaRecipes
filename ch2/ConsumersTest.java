
import java.util.*;

import java.util.function.*;

public class ConsumersTest{  


    public static void main(String args[]){  

		System.out.println("Hello Java");  

		List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings!");

		// anonymous inner class
		strings.forEach(new Consumer<String>() {

			@Override 
			public void accept(String s) {

				System.out.println(s);

			}
		});


		// expression lambda
		strings.forEach(s -> System.out.println(s));

		// method reference
		strings.forEach(System.out::println);


    }  


}  



