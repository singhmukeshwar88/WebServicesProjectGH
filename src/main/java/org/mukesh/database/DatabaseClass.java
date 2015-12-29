package org.mukesh.database;

import java.util.HashMap;
import java.util.Map;

import org.mukesh.entity.Employee;
import org.mukesh.entity.Profile;

public class DatabaseClass {
	
	private static Map<Long,Employee> employees = new HashMap<Long,Employee>();
	
	private static Map<String,Profile> profiles = new HashMap<String,Profile>();

	public static Map<Long, Employee> getMap() {
		return employees;
	}

	public static Map<String,Profile> getProfiles() {
		return profiles;
	}

}
