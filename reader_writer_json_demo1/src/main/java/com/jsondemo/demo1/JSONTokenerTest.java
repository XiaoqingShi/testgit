package com.jsondemo.demo1;

import java.io.File;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JSONTokenerTest {
	public static void readJsonFile() throws Exception {
		JSONTokener jsonTokener = new JSONTokener(new FileReader(new File("test.txt")));
		JSONObject jsonObject = new JSONObject(jsonTokener);
		System.out.println(jsonObject);
		System.out.println("姓名：" + jsonObject.getString("name"));
		System.out.println("年龄：" + jsonObject.getInt("age"));
	}

	public static void main(String[] args) throws Exception {
		readJsonFile();
	}
}
