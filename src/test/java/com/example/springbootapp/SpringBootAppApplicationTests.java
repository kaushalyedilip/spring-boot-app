package com.example.springbootapp;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootTest
public class SpringBootAppApplicationTests {

	Map<String, Map<Integer,Integer>> appRatingMap = new HashMap<>();

	@Test
	public void contextLoads() {

		Map<String, Map<Integer,Integer>> appRatingMap = new HashMap<>();

		String appName = "Facebook";
		Integer rating = 2;

		if(appRatingMap.containsKey(appName)) {
			if(appRatingMap.get(appName).containsKey(rating)) {
				Map<Integer,Integer> ratingMap = appRatingMap.get(appName);
				ratingMap.put(rating, ratingMap.get(rating)+1);
			} else {
				Map<Integer,Integer> ratingMap = new HashMap<>();
				ratingMap.put(rating, 1);
				appRatingMap.put(appName, ratingMap);
			}
		} else {
			Map<Integer,Integer> ratingMap = new HashMap<>();
			ratingMap.put(rating, 1);
			appRatingMap.put(appName, ratingMap);
		}
		System.out.println(appRatingMap);
	}

	@Test
	public void test() {
		List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);

		List<Integer> squares = numbers
									.stream()
			   						.map(x-> x * x)
			  						.distinct()
									.collect(Collectors.toList());

		System.out.println(squares);
		//o/p
		//9,4,49,25

	}

}
