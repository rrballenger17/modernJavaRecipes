

import java.io.File;

import java.util.Arrays;

public class LambdaExpression {
	
	public static void main(String[] args){

		System.out.println("Hello World!");



		File directory = new File("/Users/Ryan/Desktop/");

		String[] names = directory.list((File dir, String name) -> {

			return name.endsWith(".java");
		});

		System.out.println(Arrays.asList(names));

	}

}