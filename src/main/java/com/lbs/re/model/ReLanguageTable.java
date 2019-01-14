package com.lbs.re.model;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
// @EntityListeners(AuditingEntityListener.class)
public class ReLanguageTable extends AbstractBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "INFO", columnDefinition = "nvarchar(20)")
	private String info;

	@Column(name = "RESOURCEITEMREF")
	private Integer resourceitemref;

	@Column(name = "RESOURCESTR", columnDefinition = "nvarchar(900)")
	private String resourcestr;

	@Column(name = "TRKEY", columnDefinition = "nvarchar(40)")
	private String trkey;

	@Column(name = "[VERSION]")
	private Integer version;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RESOURCEREF", insertable = false, updatable = false)
	private ReResource resource;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RESOURCEITEMREF", referencedColumnName = "ID", insertable = false, updatable = false)
	public ReResourceitem reResourceitem;

	@Column(name = "RESOURCEREF")
	private Integer resourceref;

	public final String getInfo() {
		return info;
	}

	public final void setInfo(String info) {
		this.info = info;
	}

	public final Integer getResourceitemref() {
		return resourceitemref;
	}

	public final void setResourceitemref(Integer resourceitemref) {
		this.resourceitemref = resourceitemref;
	}

	public final String getResourcestr() {
		return resourcestr;
	}

	public final void setResourcestr(String resourcestr) {
		this.resourcestr = resourcestr;
	}

	public final String getTrkey() {
		return trkey;
	}

	public final void setTrkey(String trkey) {
		this.trkey = trkey;
	}

	public final Integer getVersion() {
		return version;
	}

	public final void setVersion(Integer version) {
		this.version = version;
	}

	public ReResource getResource() {
		return resource;
	}

	public void setResource(ReResource resource) {
		this.resource = resource;
	}

	public Integer getResourceref() {
		return resourceref;
	}

	public void setResourceref(Integer resourceref) {
		this.resourceref = resourceref;
	}

	public ReResourceitem getReResourceitem() {
		return reResourceitem;
	}

	public void setReResourceitem(ReResourceitem reResourceitem) {
		this.reResourceitem = reResourceitem;
	}

	public ReLanguageTable() {
		/* */
	}

	public <T extends ReLanguageTable> T cloneLanguage(ReResourceitem item, T language) {
		language.setInfo(info);
		language.setResourcestr(resourcestr);
		language.setTrkey(trkey);
		language.setVersion(version);
		language.setResourceitemref(item.getId());
		return language;
	}

}
