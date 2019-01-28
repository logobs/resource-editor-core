package com.lbs.re.model;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.lbs.re.util.EnumsV2.ResourceCase;
import com.lbs.re.util.EnumsV2.ResourceState;
import com.lbs.re.util.EnumsV2.ResourceType;
import com.lbs.re.util.converter.ResourceCaseConverter;
import com.lbs.re.util.converter.ResourceStateConverter;
import com.lbs.re.util.converter.ResourceTypeConverter;

@Entity
@Table(name = "RE_RESOURCES")
@EntityListeners(AuditingEntityListener.class)
public class ReResourceAtom extends AbstractBaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "RESOURCENR")
	private Integer resourceNr;

	@Column(name = "DESCRIPTION", columnDefinition = "nvarchar(128)")
	private String description;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RESOURCEGROUP")
	private ReResourceGroup resourcegroup;

	@Convert(converter = ResourceTypeConverter.class)
	@Column(name = "RESOURCETYPE")
	private ResourceType resourcetype;

	@Convert(converter = ResourceCaseConverter.class)
	@Column(name = "RESOURCECASE")
	private ResourceCase resourcecase;

	@Convert(converter = ResourceStateConverter.class)
	@Column(name = "ACTIVE")
	private ResourceState active;

	public Integer getResourceNr() {
		return resourceNr;
	}

	public void setResourceNr(Integer resourceNr) {
		this.resourceNr = resourceNr;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ReResourceGroup getResourcegroup() {
		return resourcegroup;
	}

	public void setResourcegroup(ReResourceGroup resourcegroup) {
		this.resourcegroup = resourcegroup;
	}

	public ResourceType getResourcetype() {
		return resourcetype;
	}

	public void setResourcetype(ResourceType resourcetype) {
		this.resourcetype = resourcetype;
	}

	public ResourceCase getResourcecase() {
		return resourcecase;
	}

	public void setResourcecase(ResourceCase resourcecase) {
		this.resourcecase = resourcecase;
	}

	public ResourceState getActive() {
		return active;
	}

	public void setActive(ResourceState active) {
		this.active = active;
	}

}
