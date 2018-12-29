package com.lbs.re.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RE_VERSIONASGS")
public class ReVersionAsgs extends AbstractBaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "VERSIONID")
	private int versionId = 0;

	@Column(name = "RESOURCEID")
	private int resourceId = 0;

	public int getVersionId() {
		return versionId;
	}

	public void setVersionId(int versionId) {
		this.versionId = versionId;
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public boolean isPersisted() {
		return getId() != null;
	}

	public ReVersionAsgs() {
		/* */
	}

}
