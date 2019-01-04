package com.lbs.re.routing;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.lbs.re.model.ReUser;

public class DataSourceRouter extends AbstractRoutingDataSource {

	private ReUser reUser;

	public void setREUser(ReUser reUser) {
		this.reUser = reUser;
	}

	@Override
	protected Object determineCurrentLookupKey() {
		return reUser.getPreferredDb();
	}
}