package com.lbs.re.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "RE_RESOURCEGROUP")
@EntityListeners(AuditingEntityListener.class)
public class ReResourceGroup {

	@Id
	@Column(name = "[ID]", columnDefinition = "nvarchar(10)", nullable = false, updatable = false, unique = true)
	private String ID;

	@Column(name = "NAME", nullable = false, unique = true)
	private String name;

	/*
	 * @OneToMany(mappedBy = "resourcegroup") private List<ReResource> resourceList = new ArrayList<ReResource>();
	 * @OneToMany(mappedBy = "defaultresourcegroup") private List<ReUser> userList = new ArrayList<ReUser>();
	 * @OneToMany(mappedBy = "resgroup") private List<ReMessage> messageList = new ArrayList<ReMessage>();
	 */

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

	/*
	 * public List<ReResource> getResourceList() { return resourceList; } public void setResourceList(List<ReResource> resourceList) { this.resourceList = resourceList; } public
	 * List<ReUser> getUserList() { return userList; } public void setUserList(List<ReUser> userList) { this.userList = userList; } public List<ReMessage> getMessageList() { return
	 * messageList; } public void setMessageList(List<ReMessage> messageList) { this.messageList = messageList; }
	 */

	@Override
	public String toString() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null || ID.isEmpty()) ? 0 : ID.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		ReResourceGroup other = (ReResourceGroup) obj;
		if (this.getID().equals(other.getID()))
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return false;
	}

}
