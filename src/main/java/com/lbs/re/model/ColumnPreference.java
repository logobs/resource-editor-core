package com.lbs.re.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "COLUMN_PREFERENCE", indexes = @Index(columnList = "GRID_PREFERENCE_ID"))
public class ColumnPreference extends AbstractBaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "GRID_PREFERENCE_ID")
	private Integer gridPreferenceId = null;

	@Column(name = "COLUMN_ID", nullable = false)
	private String columnId = null;

	@Column(name = "IS_HIDDEN")
	private boolean hidden = false;

	@Column(name = "COLUMN_WIDTH")
	private double columnWidth = 0;

	/**
	 * @return the gridPreferenceId
	 */
	public Integer getGridPreferenceId() {
		return gridPreferenceId;
	}

	/**
	 * @param gridPreferenceId
	 *            the gridPreferenceId to set
	 */
	public void setGridPreferenceId(Integer gridPreferenceId) {
		this.gridPreferenceId = gridPreferenceId;
	}

	/**
	 * @return the columnId
	 */
	public String getColumnId() {
		return columnId;
	}

	/**
	 * @param columnId
	 *            the columnId to set
	 */
	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}

	/**
	 * @return the hidden
	 */
	public boolean isHidden() {
		return hidden;
	}

	/**
	 * @param hidden
	 *            the hidden to set
	 */
	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

	/**
	 * @return the columnWidth
	 */
	public double getColumnWidth() {
		return columnWidth;
	}

	/**
	 * @param columnWidth
	 *            the columnWidth to set
	 */
	public void setColumnWidth(double columnWidth) {
		this.columnWidth = columnWidth;
	}

}