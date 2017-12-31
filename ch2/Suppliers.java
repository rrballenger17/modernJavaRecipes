
import java.util.*;

import java.util.function.*;

public class Suppliers{  


    public static void main(String args[]){  

		System.out.println("Hello Java");  

		// anonymous inner class implementation
		DoubleSupplier randomSupplier = new DoubleSupplier() {

			@Override 
			public double getAsDouble() {
				return Math.random();
			}
		};

		System.out.println(randomSupplier.getAsDouble());

		// expression lambda 
		randomSupplier = () -> Math.random();
		System.out.println(randomSupplier.getAsDouble());


		// method reference
		randomSupplier = Math::random;
		System.out.println(randomSupplier.getAsDouble());

    }  


}  



