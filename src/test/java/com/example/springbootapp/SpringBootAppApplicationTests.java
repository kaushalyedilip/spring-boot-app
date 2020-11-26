package com.example.springbootapp;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
public class SpringBootAppApplicationTests {

	Map<String, Map<Integer,Integer>> appRatingMap = new HashMap<>();

	@Test
	public void contextLoads() {

//		Map<String, Map<Integer,Integer>> appRatingMap = new HashMap<>();
//
//		String appName = "Facebook";
//		Integer rating = 2;
//
//		if(appRatingMap.containsKey(appName)) {
//			if(appRatingMap.get(appName).containsKey(rating)) {
//				Map<Integer,Integer> ratingMap = appRatingMap.get(appName);
//				ratingMap.put(rating, ratingMap.get(rating)+1);
//			} else {
//				Map<Integer,Integer> ratingMap = new HashMap<>();
//				ratingMap.put(rating, 1);
//				appRatingMap.put(appName, ratingMap);
//			}
//		} else {
//			Map<Integer,Integer> ratingMap = new HashMap<>();
//			ratingMap.put(rating, 1);
//			appRatingMap.put(appName, ratingMap);
//		}
//		System.out.println(appRatingMap);
	}

	@Test
	public void test() {
//		List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);
//
//		List<Integer> squares = numbers
//									.stream()
//			   						.map(x-> x * x)
//			  						.distinct()
//									.collect(Collectors.toList());

		String name ="KAUSHALYE";

		char[] chars = name.toCharArray();


		Map<Character, Integer> map = new LinkedHashMap<>();

		for(int i=0; i < chars.length; i++ ) {
			if(map.get(chars[i]) == null) {
				map.put(chars[i], 1);
			} else {
				map.put(chars[i], map.get(chars[i])+1);
			}
		}

		for(Map.Entry entry: map.entrySet()) {
			if((Integer) entry.getValue() == 1) {
				System.out.println("Non Repeating: "+entry.getKey());
				break;
			}
		}
	}

	@Test
	public void testMap() {
//		Employee employee1 = new Employee("1");
//		Employee employee2 = new Employee("2");
//		Employee employee3 = new Employee("3");

//		List<Employee> list = new ArrayList<>();
//		list.add(employee1);
//		list.add(employee2);
//		list.add(employee3);


//		List<String> list1 = list.stream()
//								   .map(employee -> employee.pancardNumber)
//								   .collect(Collectors.toList());

//		List<String> list2 = list.stream()
//								 .flatMap(Employee::getPancardNumber)
//								 .collect(Collectors.toList());

		//System.out.println(list1);

	}

	@Test
	public void test2() throws IOException, JSONException {
		//String json = "{\"testKeyOne\":\"testValueOne-1.0.0-test-version-351e035\",\"testKeyTwo\":\"testValueTwo-1.0.0-test-version-351e035\"}";
		//String json = "{\"configserver\":{\"client\":{\"globalVersion\":1}}}";
		String json = "{}";
		//JSONObject jsonObject = ;
		//.getJSONObject("client").getJSONObject("globalVersion")

		JSONObject jsonObject = new JSONObject(json);

		System.out.println("Length: "+jsonObject.length());

		//System.out.println("JSON Object: "+jsonObject.keys());
		//System.out.println("JSON VALUE: "+new JSONObject(json).getJSONObject("configserver").getJSONObject("client").getInt("globalVersion"));
		//ObjectMapper objectMapper = new ObjectMapper();
		// convert JSON string to Map
		//Map<String, String> map = objectMapper.readValue(json, Map.class);
		//System.out.println("Map: "+map.values());

		String jsonResponse = "{\n"
		+ "    \"test\": {\n"
		+ "        \"file\": {\n"
		+ "            \"key\": {\n"
		+ "                \"one\": \"test_value_one_version1\",\n"
		+ "                \"two\": \"test_value_two_version1\"\n"
		+ "            }\n"
		+ "        }\n"
		+ "    }\n"
		+ "}";
		JSONObject jsonObject1 = new JSONObject(jsonResponse);
		ObjectMapper objectMapper = new ObjectMapper();
		HashMap<String,String> result = new ObjectMapper().readValue(jsonResponse, HashMap.class);
		Properties props = new Properties();
		props.putAll(result);
		ObjectMapper objectMapper1 = new ObjectMapper();
		objectMapper1.readTree(jsonResponse);
		System.out.println("-------Propss"+props.keys());
		//Property

//		if(jsonObject1.names().length()>0) {
//
//			if(jsonObject1.getJSONObject(jsonObject1.names().get(0).toString()).length() > 0){
//				System.out.println("----Names: "+jsonObject1.getJSONObject(jsonObject1.names().get(0).toString()).names().get(0));
//			}
//		}

		//System.out.println("--------test-------"+jsonObject1.getJSONObject(jsonObject1.toString()));

		//System.out.println("+++++++Keys: "+jsonObject1.getJSONObject("test").getJSONObject("file").getJSONObject("key"));
		//System.out.println("Map: "+map.keySet());
//		Map<String,String> propss = transformJsonToMap(objectMapper.readTree(jsonResponse),null);
//		System.out.println("--------propss------"+propss);
//		System.out.println("Key Set: "+propss.values());
	}

	//------------ Transform jackson JsonNode to Map -----------
	public static Map<String, String> transformJsonToMap(JsonNode node, String prefix){

		Map<String,String> jsonMap = new HashMap<>();

		if(node.isArray()) {
			//Iterate over all array nodes
			int i = 0;
			for (JsonNode arrayElement : node) {
				jsonMap.putAll(transformJsonToMap(arrayElement, prefix+"[" + i + "]"));
				i++;
			}
		}else if(node.isObject()){
			Iterator<String> fieldNames = node.fieldNames();
			String curPrefixWithDot = (prefix==null || prefix.trim().length()==0) ? "" : prefix+".";
			//list all keys and values
			while(fieldNames.hasNext()){
				String fieldName = fieldNames.next();
				JsonNode fieldValue = node.get(fieldName);
				jsonMap.putAll(transformJsonToMap(fieldValue, curPrefixWithDot+fieldName));
			}
		}else {
			//basic type
			jsonMap.put(prefix,node.asText());
			System.out.println(prefix+"="+node.asText());
		}

		return jsonMap;
	}

//	public static Map<String,String> transformJsonToMapIterative(JsonNode node){
//		Map<String,String> jsonMap = new HashMap<>();
//		LinkedList<JsonNodeWrapper> queue = new LinkedList<>();
//
//		//Add root of json tree to Queue
//		JsonNodeWrapper root = new JsonNodeWrapper(node,"");
//		queue.offer(root);
//
//		while(queue.size()!=0){
//			JsonNodeWrapper curElement = queue.poll();
//			if(curElement.node.isObject()){
//				//Add all fields (JsonNodes) to the queue
//				Iterator<Map.Entry<String,JsonNode>> fieldIterator = curElement.node.fields();
//				while(fieldIterator.hasNext()){
//					Map.Entry<String,JsonNode> field = fieldIterator.next();
//					String prefix = (curElement.prefix==null || curElement.prefix.trim().length()==0)? "":curElement.prefix+".";
//					queue.offer(new JsonNodeWrapper(field.getValue(),prefix+field.getKey()));
//				}
//			}else if (curElement.node.isArray()){
//				//Add all array elements(JsonNodes) to the Queue
//				int i=0;
//				for(JsonNode arrayElement : curElement.node){
//					queue.offer(new JsonNodeWrapper(arrayElement,curElement.prefix+"["+i+"]"));
//					i++;
//				}
//			}else{
//				//If basic type, then time to fetch the Property value
//				jsonMap.put(curElement.prefix,curElement.node.asText());
//				System.out.println(curElement.prefix+"="+curElement.node.asText());
//			}
//		}
//
//		return jsonMap;
//	}

	@Test
	public void t2() {
		{
			LinkedList<Integer> list = new LinkedList<Integer>();
			list.add(-8);
			list.add(10);
			list.add(-20);
			list.add(null);
//			Comparator<Integer> r = Collections.reverseOrder();
//			Collections.sort(list, r);
//			for(int i : list)
//				System.out.print(i+ " ");
//			System.out.println();

		}
	}

	static class JsonNodeWrapper{

		public JsonNode node;
		public String prefix;

		public JsonNodeWrapper(JsonNode node, String prefix){
			this.node = node;
			this.prefix = prefix;
		}
	}

	//second highest element from the array
//	@Test
//	public void secondHigest() {
//		int[] arr = {12,3,7,2,15};
//
//		int highest = 0;
//		int secondHighest = 0;
//
//		for(int i=0; i < arr.length; i++) {
//
//			if(arr[i] > arr[i+1]) {
//				highest = arr[i];
//				secondHighest = arr[i+1];
//			} else {
//
//			}
//		}
//	}

//	@Test
//	public void emptest() {
//
//		Set<Employee> employeeSet = new HashSet<>();
//
//		Employee emp1 = new Employee("123","XYZ");
//
//		employeeSet.add(emp1);
//
//		emp1.setName("ABC");
//
//		employeeSet.add(emp1);
//
//		System.out.println("Size: "+employeeSet.size());
//		System.out.println("Employees: ");
//
//		//employees.stream().distinct();
//
//	}
//
//	//second most occuring character from string
//	@Test
//	public void testChar(){
//
//		String str = "abccdscadca";
//		//c-4
//		//a-3
//
//		char[] charArray = str.toCharArray();
//		Map<Character,Integer> countChar = new HashMap<>();
//
//		for(int i=0; i< charArray.length; i++) {
//			if(!countChar.containsKey(charArray[i])) {
//				countChar.put(charArray[i], 1);
//			} else {
//				countChar.put(charArray[i], countChar.get(charArray[i])+1);
//			}
//		}
//
//		int mostOccuranceCount = -1;
//		char mostOcc = ' ';
//		for(char c : countChar.keySet()) {
//			if(countChar.get(c) > mostOccuranceCount) {
//				mostOccuranceCount = countChar.get(c);
//				mostOcc = c;
//			}
//		}
//
//		System.out.println("Most Occ char: "+mostOcc);
//	}
//	//middle element from the linked list
//	@Test
//	public void middleElementLinkedList() {
//		LinkedList<String> linkedList = new LinkedList<>();
//		linkedList.add("1");
//		linkedList.add("2");
//		linkedList.add("3");
//		linkedList.add("4");
//		linkedList.add("5");
//
//		System.out.println(linkedList.indexOf(linkedList.getLast())); ;
//
//		//linkedList.
//
////		for (String str : linkedList) {
////			System.out.println(str);
////		}
//
//
//	}

}
