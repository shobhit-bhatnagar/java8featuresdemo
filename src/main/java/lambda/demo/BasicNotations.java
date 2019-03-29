package lambda.demo;

import java.util.Comparator;
import java.util.function.Consumer;

public class BasicNotations {

	
	public static void main(String[] args)
	{
		Comparator<String> comp = new Comparator<String>() {

			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		};
		
		Comparator<String> cLambda = (s1,s2)->Integer.compare(s1.length(), s2.length());
		
		Comparator<String> cMultipleLineLambda = (s1,s2)->{
			
			System.out.println("faasf");
			return Integer.compare(s1.length(), s2.length());
		};
	
		Consumer<String> co = s -> System.out.println(s);
		co.accept("hi");
		co = System.out::println ;
		
	}
}
