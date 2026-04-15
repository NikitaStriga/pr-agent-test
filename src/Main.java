import java.util.Arrays;
import java.util.List;
import java.util.Set;


public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello world!");
		List<Integer> list = List.of(25, 26, 27);
		list.add(25);
		System.out.println(list);

		DataProcessor dp = new DataProcessor(Arrays.asList("apple", "banana", "very_long_string_that_might_be_over_the_limit"));

		dp.items.add("cherry");

		dp.process();


		Set<Integer> integers = Set.of(1, 2, 34);
		integers.add(25);
	}
}
