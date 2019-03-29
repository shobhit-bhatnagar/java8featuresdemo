package lambda.demo;

import java.util.List;
import java.util.function.BiPredicate;

public class Main {

	public static void main(String[] args) {
		
		Predicate<String> p1  = s->s.length()<20;
		
		Predicate<String> p2 = s->s.length()>5;
		
		
		// for strings of size greater than 5 and less than 25
		// implement a default and function and test both p1 and p2 with && in it
		Predicate<String> p3 = p1.and(p2);
		
		System.out.println(p3.test("Yes"));
		
		System.out.println(p3.test("Morning"));
		
		Predicate<String> p4 = Predicate.isEqualsTo("Yes");
		
		System.out.println(p4.test("Yes"));
		
		Predicate<Integer> p5 = Predicate.isEqualsTo(1);
		
		
	}

}
