package com.lbs.re.routing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DataSourceRouter extends AbstractRoutingDataSource {

	@Autowired
	private PreferredDatabaseSession db;

	@Override
	protected Object determineCurrentLookupKey() {
		return db.getPreferredDb();
	}
}