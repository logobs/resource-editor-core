package com.lbs.re.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Table(name = "RE_PROJECTVERSION")
@Entity
public class ReProjectVersion extends AbstractBaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "VERSIONNR", nullable = false, unique = true)
	@Size(min = 2, max = 50)
	@NotNull
	private String versionnr;

	public String getVersionnr() {
		return versionnr;
	}

	public void setVersionnr(String versionnr) {
		this.versionnr = versionnr;
	}

	public boolean isPersisted() {
		return getId() != null;
	}

	public ReProjectVersion() {
		/* */
	}
}
