package com.jsondemo.demo1.demo_01;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ObjectAndArray {
	public static void main(String args[]) {
		JSONArray jsonarray;
		JSONObject jsonObj;
		// 读取JSONArray，用下标索引获取
		String array = "[\"11\",\"22\",\"33\"]";
		jsonarray = JSONArray.fromObject(array);
		System.out.println(jsonarray.getString(1)); // 输出为：22

		// 读取JSONObject
		String object = "{\"NO1\":[\"44\",\"55\",\"66\"],\"NO2\":{\"NO1\":\"第一个\"}}";
		jsonObj = JSONObject.fromObject(object);
		System.out.println(jsonObj.get("NO1")); // 输出为：["44","55","66"]

		jsonarray = (JSONArray) (jsonObj.get("NO1"));
		System.out.println(jsonarray.getString(1)); // 输出为：55

		// 用"键"获取值
		jsonObj = (JSONObject) jsonObj.get("NO2");
		System.out.println(jsonObj); // 输出为：{"NO1":"第一个"}

	}
}
