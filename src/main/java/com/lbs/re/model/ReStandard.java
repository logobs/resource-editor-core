package com.lbs.re.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "RE_STANDARD", indexes = { @Index(name = "I_STANDARD_INFO", columnList = "INFO,ID", unique = true),
		@Index(name = "I_STANDARD_RESITEMREF", columnList = "RESOURCEITEMREF", unique = true) })
@EntityListeners(AuditingEntityListener.class)
public class ReStandard extends AbstractBaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String PROPERTY_NAME_DATABASE_DRIVER = "db.driver";

	@Column(name = "RESOURCESTR")
	private String resourceStr;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RESOURCEITEMREF", referencedColumnName = "ID", insertable = false, updatable = false)
	public ReResourceitem resourceItem;

	@Column(name = "RESOURCEITEMREF")
	private Integer resourceitemref;

	@Column(name = "INFO", columnDefinition = "nvarchar(20)")
	private String info;

	@Column(name = "VERSION")
	private Integer version;

	@Column(name = "RESOURCEREF")
	private Integer resourceref;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RESOURCEREF", insertable = false, updatable = false)
	private ReResource resource;

	public String getResourceStr() {
		return resourceStr;
	}

	public void setResourceStr(String resourceStr) {
		this.resourceStr = resourceStr;
	}

	public ReResourceitem getResourceItem() {
		return resourceItem;
	}

	public void setResourceItem(ReResourceitem resourceItem) {
		this.resourceItem = resourceItem;
	}

	public Integer getResourceitemref() {
		return resourceitemref;
	}

	public void setResourceitemref(Integer resourceitemref) {
		this.resourceitemref = resourceitemref;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Integer getResourceref() {
		return resourceref;
	}

	public void setResourceref(Integer resourceref) {
		this.resourceref = resourceref;
	}

	public ReResource getResource() {
		return resource;
	}

	public void setResource(ReResource resource) {
		this.resource = resource;
	}

	public ReStandard cloneStandard(ReResourceitem item) {
		ReStandard reStandard = new ReStandard();
		reStandard.setResourceStr(resourceStr);
		reStandard.setInfo(info);
		reStandard.setVersion(version);
		reStandard.setResourceitemref(item.getId());
		reStandard.setResourceref(item.getResourceref());
		return reStandard;
	}

}
