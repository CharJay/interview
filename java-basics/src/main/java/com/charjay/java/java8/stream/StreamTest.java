package com.charjay.java.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * 
 * <pre>http://blog.csdn.net/wwwsssaaaddd/article/details/24214219</pre>
 * @author taomk 2017年6月19日 下午3:01:30
 *
 */
public class StreamTest {

	public static void main(String[] args) {
		
		IntStream range =IntStream.range(0, 50).limit(10);
		range.forEach(System.out::println);

		System.out.println("_________________________________\n");
		
		new Random()
		  .ints()// 随机生成一条的整数数据流
		  .limit(10)// 我们只要10个随机整数
		  .forEach(System.out::println);

		//////////
		List<String> stringList = new ArrayList<>();
		stringList.add("ddd2");
		stringList.add("aaa2");
		stringList.add("bbb1");
		stringList.add("aaa1");
		stringList.add("bbb3");
		stringList.add("ccc");
		stringList.add("bbb2");
		stringList.add("ddd1");
		// 测试 Filter(过滤)
		// 测试 Sort (排序)
		stringList
				.stream()
				.sorted()
				.filter((s) -> s.startsWith("a"))
				.forEach(System.out::println);// aaa1 aaa2
		// 测试 Map 操作
		stringList
				.stream()
				.map(String::toUpperCase)
				.sorted((a, b) -> b.compareTo(a))
				.forEach(System.out::println);// "DDD2", "DDD1", "CCC", "BBB3", "BBB2", "AAA2", "AAA1"


	}
}
