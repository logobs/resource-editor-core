package com.lbs.re.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "GRID_PREFERENCE", indexes = @Index(columnList = "USER_ID, VIEW_ID, GRID_ID"))
public class GridPreference extends AbstractBaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "USER_ID", nullable = false)
	private Integer userId = null;

	@Column(name = "VIEW_ID", nullable = false)
	private String viewId = null;

	@Column(name = "GRID_ID", nullable = false)
	private String gridId = null;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "GRID_PREFERENCE_ID")
	private List<ColumnPreference> columnPreferenceList = new ArrayList<ColumnPreference>();

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the viewId
	 */
	public String getViewId() {
		return viewId;
	}

	/**
	 * @param viewId
	 *            the viewId to set
	 */
	public void setViewId(String viewId) {
		this.viewId = viewId;
	}

	/**
	 * @return the gridId
	 */
	public String getGridId() {
		return gridId;
	}

	/**
	 * @param gridId
	 *            the gridId to set
	 */
	public void setGridId(String gridId) {
		this.gridId = gridId;
	}

	/**
	 * @return the columnPreferenceList
	 */
	public List<ColumnPreference> getColumnPreferenceList() {
		return columnPreferenceList;
	}

	/**
	 * @param columnPreferenceList
	 *            the columnPreferenceList to set
	 */
	public void setColumnPreferenceList(List<ColumnPreference> columnPreferenceList) {
		this.columnPreferenceList = columnPreferenceList;
	}

}
