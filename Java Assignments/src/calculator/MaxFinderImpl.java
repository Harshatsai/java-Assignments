package calculator;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MaxFinderImpl {
	
	public static void main(String args[])
	{
		MaxFindDemo finder=(num1,num2)->num1>num2?num1:num2;
		   int result=finder.MaxFinder(5, 8);
		   System.out.println(result);
		   
		 Consumer <String> consumer=(String str)->System.out.println(str);
		 consumer.accept("Hello LE!");
		 Supplier <String>supplier=()->"Hello from supplier";
		 consumer.accept(supplier.get());
		 //even number  test
		 Predicate<Integer>predicate=num->num%2==0;
		 System.out.println("The given numbwer is "+predicate.test(44));
		 System.out.println("The given numbwer is "+predicate.test(43));
		 //max or min test
		 BiFunction<Integer,Integer,Integer> maxFunction=(x,y)->x>y?x:y;
		 System.out.println(" The maximum number is " +maxFunction.apply(44, 43));
		 
		 
	}

}
