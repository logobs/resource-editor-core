package com.lbs.re.model;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class ReLanguageTable extends AbstractBaseEntity{

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
