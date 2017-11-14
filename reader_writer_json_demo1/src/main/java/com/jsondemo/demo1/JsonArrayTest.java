package com.jsondemo.demo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;

public class JsonArrayTest {
	public static void constructorTest() {

		String jsonStr = "[{'name':'JTZen9','age':21}]";
		JSONArray strJson = new JSONArray(jsonStr); // 传入字符串
		System.out.println("构造参数为String类：" + strJson);

		List<Object> list = new ArrayList<Object>();
		for (int i = 1; i < 3; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("title", "java程序设计 第" + i + "版");
			map.put("price", i * 20);
			list.add(map);
		}
		JSONArray mapJson = new JSONArray(list); // 传入Collection类型
		System.out.println("构造参数为Collection类：" + mapJson);

		int[] numlist = new int[10];
		for (int i = 0; i < numlist.length; i++) {
			numlist[i] = i;
		}
		JSONArray arrayJson = new JSONArray(numlist); // 传入Array类型，实例1
		System.out.println(arrayJson);

		Student[] student = { new Student(), new Student() };
		student[0].setAge(21);
		student[0].setName("JTZen9");
		student[0].setSex("male");
		student[1].setAge(21);
		student[1].setName("heiheihei");
		student[1].setSex("female");
		JSONArray beanJson = new JSONArray(student); // 传入Array类型，实例2
		System.out.println("构造参数为Array类：" + beanJson);
	}

	public static void main(String[] args) {
		constructorTest();
	}
}
