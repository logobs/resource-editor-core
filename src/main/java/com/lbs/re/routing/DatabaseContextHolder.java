package com.lbs.re.routing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class DatabaseContextHolder {

	private static final ThreadLocal<DatabaseEnvironment> CONTEXT = new ThreadLocal<>();

	public static void set(DatabaseEnvironment databaseEnvironment) {
		CONTEXT.set(databaseEnvironment);
	}

	@Bean
	@Scope("session")
	public static DatabaseEnvironment getEnvironment() {
		return CONTEXT.get();
	}

	public static void clear() {
		CONTEXT.remove();
	}

}