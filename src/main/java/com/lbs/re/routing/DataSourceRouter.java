package com.lbs.re.routing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DataSourceRouter extends AbstractRoutingDataSource {

	/*
	 * private DatabaseEnvironment preferredDatabase; public DatabaseEnvironment getPreferredDatabase() { return preferredDatabase; } public void
	 * setPreferredDatabase(DatabaseEnvironment preferredDatabase) { this.preferredDatabase = preferredDatabase; }
	 */

	@Autowired
	private SessionDatabase db;

	@Override
	protected Object determineCurrentLookupKey() {
		// return preferredDatabase;
		return db.getPreferredDb();
	}
}