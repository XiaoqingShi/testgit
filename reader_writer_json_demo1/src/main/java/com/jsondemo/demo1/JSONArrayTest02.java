package com.jsondemo.demo1;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;

public class JSONArrayTest02 {
	public static void putMethodTest() {
		JSONArray jsonArray1 = new JSONArray();
		jsonArray1.put("JTZen9");
		jsonArray1.put(21);
		jsonArray1.put("male");
		System.out.println(jsonArray1);

		JSONArray jsonArray2 = new JSONArray();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", "java程序设计 第2版");
		map.put("price", 20);
		jsonArray2.put(map); // 传入一个map
		System.out.println("传入一个Map：" + jsonArray2);
		map.clear();
		map.put("title", "java程序设计 第3版");
		map.put("price", 30);
		jsonArray2.put(map); // 没有下标的直接在结果后面添加
		System.out.println("没有指定下标：" + jsonArray2);
		map.clear();
		map.put("title", "java程序设计 第1版");
		map.put("price", 10);
		jsonArray2.put(0, map); // 使用下标可以添加到自定义的位置
		System.out.println("添加到第一个位置：" + jsonArray2);

		Student[] student = { new Student(), new Student() };
		student[0].setAge(21);
		student[0].setName("JTZen9");
		student[0].setSex("male");
		student[1].setAge(21);
		student[1].setName("heiheihei");
		student[1].setSex("female");
		JSONArray jsonArray3 = new JSONArray();
		jsonArray3.put(student);
		System.out.println("注意输出结果：" + jsonArray3);

	}

	public static void main(String[] args) {
		putMethodTest();
	}
}
