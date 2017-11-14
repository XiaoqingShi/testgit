package com.jsondemo.demo1.demo_01;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Testdemo01 {
	public static void main(String args[]) {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("name0", "zhangsan");
		jsonObj.put("sex1", "female");
		System.out.println(jsonObj); // 输出为：{"sex1":"female","name0":"zhangsan"}

		JSONArray jsonArray = new JSONArray();
		jsonArray.add("11");
		jsonArray.add("22");
		jsonArray.add("33");
		System.out.println(jsonArray); // 输出为：["11","22","33"]
	}
}
