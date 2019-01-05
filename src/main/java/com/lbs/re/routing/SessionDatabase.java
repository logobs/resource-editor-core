package com.lbs.re.routing;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionDatabase implements Serializable {

	private DatabaseEnvironment preferredDb;

	public DatabaseEnvironment getPreferredDb() {
		return preferredDb;
	}

	public void setPreferredDb(DatabaseEnvironment preferredDb) {
		this.preferredDb = preferredDb;
	}

}
