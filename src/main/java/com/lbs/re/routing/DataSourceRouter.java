package com.lbs.re.routing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DataSourceRouter extends AbstractRoutingDataSource {

	@Autowired
	private SessionDatabase db;

	@Override
	protected Object determineCurrentLookupKey() {
		return db.getPreferredDb();
	}
}