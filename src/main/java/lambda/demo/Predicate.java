package lambda.demo;

@FunctionalInterface
public interface Predicate<T> {

	public boolean test(T t);

	public default Predicate<T> and(Predicate<T> p2)
	{
		
		return t->test(t) && p2.test(t);
	}
	
	public static <U> Predicate<U> isEqualsTo(U s1)
	{
		return s->s.equals(s1);
	}
}
