package main;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for (int i = 1; i < 101; i++) {
			nums.add(i);
		}
		nums.stream().map(x -> x * x).filter(x -> x % 5 == 0).reduce((a, b) -> a + b).get();
//		nums.stream().forEach(someVariable -> System.out.println(someVariable));
//		nums.stream().forEach(System.out::println);
//		nums.stream().filter(x -> x % 2 == 1).forEach(System.out::println);
//		List<Integer> filtered = nums.stream().filter(x -> x % 2 == 1).collect(Collectors.toList());

	}

}
