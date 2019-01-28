package com.lbs.re.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class ReResourceitemBase extends AbstractBaseEntity {

	private static final long serialVersionUID = 1L;

	public static final String PROPERTY_NAME_DATABASE_DRIVER = "db.driver";

	@Column(name = "ACTIVE")
	private Integer active = 1;

	@LastModifiedDate
	@Column(name = "AUTOMODIFIEDON", columnDefinition = "datetime")
	private LocalDateTime automodifiedon;

	@Column(name = "INFO", columnDefinition = "nvarchar(20)")
	private String info;

	@Column(name = "LEVELNR")
	private Integer levelnr = Integer.valueOf(0);

	@Column(name = "LOCALIZATIONAFFECTED")
	private Integer localizationaffected;

	@Column(name = "ORDERNR")
	private Integer ordernr = Integer.valueOf(0);

	// @Convert(converter = OwnerProductConverter.class)
	@Column(name = "OWNERPRODUCT")
	private Integer ownerproduct = 0;

	@Column(name = "PREFIXSTR", columnDefinition = "nvarchar(30)")
	private String prefixstr;

	@Column(name = "REQUESTED")
	private Integer requested;

	// @Convert(converter = ResourceCaseConverter.class)
	@Column(name = "RESOURCECASE")
	private Integer resourcecase = 0;

	@Column(name = "RESOURCECATEGORY")
	private Integer resourcecategory = 0;

	@Column(name = "RESOURCEREF")
	private Integer resourceref;

	@Column(name = "RESOURCETYPE")
	private Integer resourcetype = 0;

	@Column(name = "RIGHTLEVELNR")
	private Integer rightlevelnr;

	@Column(name = "RIGHTPARENTID")
	private Integer rightparentid;

	@Column(name = "TAGNR")
	private Integer tagnr = Integer.valueOf(0);

	@Column(name = "VERSION")
	private Integer version;

	@Column(name = "DICTIONARYID")
	private Integer dictionaryId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RESOURCEREF", insertable = false, updatable = false)
	private ReResourceAtom resourceAtom;

	public final Integer getActive() {
		return active;
	}

	public final void setActive(Integer active) {
		this.active = active;
	}

	public String getActiveValue() {
		if (active == 1) {
			return "Active";
		} else {
			return "Deactive";
		}
	}

	public final LocalDateTime getAutomodifiedon() {
		return automodifiedon;
	}

	public final void setAutomodifiedon(LocalDateTime automodifiedon) {
		this.automodifiedon = automodifiedon;
	}

	public final String getInfo() {
		return info;
	}

	public final void setInfo(String info) {
		this.info = info;
	}

	public final Integer getLevelnr() {
		return levelnr;
	}

	public final void setLevelnr(Integer levelnr) {
		this.levelnr = levelnr;
	}

	public final Integer getLocalizationaffected() {
		return localizationaffected;
	}

	public final void setLocalizationaffected(Integer localizationaffected) {
		this.localizationaffected = localizationaffected;
	}

	public final Integer getOrdernr() {
		return ordernr;
	}

	public final void setOrdernr(Integer ordernr) {
		this.ordernr = ordernr;
	}

	public final Integer getOwnerproduct() {
		return ownerproduct;
	}

	public final void setOwnerproduct(Integer ownerproduct) {
		this.ownerproduct = ownerproduct;
	}

	public final String getPrefixstr() {
		return prefixstr;
	}

	public final void setPrefixstr(String prefixstr) {
		this.prefixstr = prefixstr;
	}

	public final Integer getRequested() {
		return requested;
	}

	public final void setRequested(Integer requested) {
		this.requested = requested;
	}

	public final Integer getResourcecase() {
		return resourcecase;
	}

	public final void setResourcecase(Integer resourcecase) {
		this.resourcecase = resourcecase;
	}

	public final Integer getResourcecategory() {
		return resourcecategory;
	}

	public final void setResourcecategory(Integer resourcecategory) {
		this.resourcecategory = resourcecategory;
	}

	public final Integer getResourceref() {
		return resourceref;
	}

	public final void setResourceref(Integer resourceref) {
		this.resourceref = resourceref;
	}

	public final Integer getResourcetype() {
		return resourcetype;
	}

	public final void setResourcetype(Integer resourcetype) {
		this.resourcetype = resourcetype;
	}

	public final Integer getRightlevelnr() {
		return rightlevelnr;
	}

	public final void setRightlevelnr(Integer rightlevelnr) {
		this.rightlevelnr = rightlevelnr;
	}

	public final Integer getRightparentid() {
		return rightparentid;
	}

	public final void setRightparentid(Integer rightparentid) {
		this.rightparentid = rightparentid;
	}

	public final Integer getTagnr() {
		return tagnr;
	}

	public final void setTagnr(Integer tagnr) {
		this.tagnr = tagnr;
	}

	public final Integer getVersion() {
		return version;
	}

	public final void setVersion(Integer version) {
		this.version = version;
	}

	public Integer getDictionaryId() {
		return dictionaryId;
	}

	public void setDictionaryId(Integer dictionaryId) {
		this.dictionaryId = dictionaryId;
	}

	public ReResourceAtom getResourceAtom() {
		return resourceAtom;
	}

	public void setResourceAtom(ReResourceAtom resourceAtom) {
		this.resourceAtom = resourceAtom;
	}

	public ReResourceitemBase() {
		/* */
	}

	@PrePersist
	@PreUpdate
	protected void beforeInsertOrUpdate() {
		automodifiedon = LocalDateTime.now();
		setModifiedon(LocalDateTime.now());
	}

}
