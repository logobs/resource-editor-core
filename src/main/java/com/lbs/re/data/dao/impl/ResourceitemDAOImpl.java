package com.lbs.re.data.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.lbs.re.data.dao.ResourceitemDAO;
import com.lbs.re.data.repository.ResourceitemRepository;
import com.lbs.re.model.ReResourceitem;

@Component
public class ResourceitemDAOImpl extends BaseDAOImpl<ReResourceitem, Integer> implements ResourceitemDAO {
	/**
	 * long serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private transient ResourceitemRepository repository;

	private DataSource dataSource;

	@Autowired
	public void setRepository(ResourceitemRepository repository, DataSource dataSource) {
		this.repository = repository;
		this.dataSource = dataSource;
		super.setRepository(repository);
	}

	@Override
	public List<ReResourceitem> getItemListByResource(int resourceref) {
		return repository.findByresourceref(resourceref);
	}

	@Override
	public void updateOrderNumbers(List<ReResourceitem> itemList) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "UPDATE RE_RESOURCEITEMS SET ORDERNR = ? WHERE ID = ?";
		List<Object[]> parameters = new ArrayList<Object[]>();
		for (ReResourceitem item : itemList) {
			parameters.add(new Object[] { item.getOrdernr(), item.getId() });
		}
		jdbcTemplate.batchUpdate(sql, parameters);
	}

}
