package com.lbs.re.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "RE_USERGROUP")
@EntityListeners(AuditingEntityListener.class)
public class ReUserGroup {

	@Id
	@Column(name = "ID", nullable = false, updatable = false, unique = true)
	private Integer id;

	@Column(name = "GROUP_NAME", nullable = false, unique = true)
	private String groupName;

	@Column(name = "GROUP_DESCRIPTION")
	private String groupDescription;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ReOperation> operations = new ArrayList<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	public List<ReOperation> getOperations() {
		return operations;
	}

	public void setOperations(List<ReOperation> operations) {
		this.operations = operations;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (id == null ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		ReUserGroup other = (ReUserGroup) obj;
		if (this.getId().equals(other.getId()))
			return true;
		if (getClass() != obj.getClass())
			return false;
		return false;
	}

}
