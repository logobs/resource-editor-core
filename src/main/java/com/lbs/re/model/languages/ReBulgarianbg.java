package com.lbs.re.model.languages;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.lbs.re.model.ReLanguageTable;
import com.lbs.re.model.ReResourceitem;

@Entity
@Table(name = "RE_BULGARIANBG_ORG", indexes = { @Index(name = "I_BULGARIANBG_INFO", columnList = "INFO,ID", unique = true),
		@Index(name = "I_BULGARIANBG_RESITEMREF", columnList = "RESOURCEITEMREF", unique = false) })
public class ReBulgarianbg extends ReLanguageTable {

	private static final long serialVersionUID = 1L;

	public ReBulgarianbg() {
		/* */
	}

	public ReBulgarianbg cloneBulgarianbg(ReResourceitem item) {
		ReBulgarianbg bulgarianbg = new ReBulgarianbg();
		bulgarianbg = cloneLanguage(item, bulgarianbg);
		return bulgarianbg;
	}
}
