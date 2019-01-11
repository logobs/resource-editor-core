package com.lbs.re.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.lbs.re.util.EnumsV2.ResourceGroupType;

@Entity
@Table(name = "RE_RESOURCEGROUP")
@EntityListeners(AuditingEntityListener.class)
public class ReResourceGroup {

	@Id
	@Column(name = "[ID]", columnDefinition = "nvarchar(10)", nullable = false, updatable = false, unique = true)
	private String ID;

	@Column(name = "NAME", nullable = false, unique = true)
	private String name;

	@Column(name = "RESOURCEGROUPTYPE")
	private ResourceGroupType resourceGroupType;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ResourceGroupType getResourceGroupType() {
		return resourceGroupType;
	}

	public void setResourceGroupType(ResourceGroupType resourceGroupType) {
		this.resourceGroupType = resourceGroupType;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null || ID.isEmpty()) ? 0 : ID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		ReResourceGroup other = (ReResourceGroup) obj;
		if (this.getID().equals(other.getID()))
			return true;
		if (getClass() != obj.getClass())
			return false;
		return false;
	}

}
