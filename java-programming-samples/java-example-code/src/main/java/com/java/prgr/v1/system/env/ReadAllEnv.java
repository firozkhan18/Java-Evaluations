package com.java.prgr.v1.system.env;

import java.util.Map;

public class ReadAllEnv {

	public static void main(String[] args) {

		Map<String, String> env = System.getenv();

		for (String key : env.keySet()) {

			String value = env.get(key);
			System.out.println(key + " : " + value);
		}

		// using java 8 forEach

		System.out.println("-----------");
		env.forEach((key, value) -> System.out.println(key + " : " + value));
	}

}
