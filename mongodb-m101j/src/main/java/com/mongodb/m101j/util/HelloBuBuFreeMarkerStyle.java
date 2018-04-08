/**
 * 
 */
package com.mongodb.m101j.util;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;

/**
 * @author ShenazAssu
 *
 */
public class HelloBuBuFreeMarkerStyle {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Configuration configuration = new Configuration(new Version("2.3.28"));
		configuration.setClassForTemplateLoading(HelloBuBuFreeMarkerStyle.class, ".");

		try {
			Template helloTemplate = configuration.getTemplate("hello.ftl");
			StringWriter writer = new StringWriter();
			Map<String, Object> map = new HashMap<>();
			map.put("name", "BuBu");
			
			helloTemplate.process(map, writer);
			
			System.out.println(writer);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
