

import java.util.stream.Stream;


public class MethodReference {
	
	public static void main(String[] args){

		// lambda expression
		Stream.of(3, 1, 4, 1, 5, 9)
			.forEach(x -> System.out.println(x));

		// method reference
		Stream.of(3, 1, 4, 1, 5, 9)
			.forEach(System.out::println);	

	}

}



