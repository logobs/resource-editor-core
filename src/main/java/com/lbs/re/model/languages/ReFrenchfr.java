package com.lbs.re.model.languages;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.lbs.re.model.ReLanguageTable;
import com.lbs.re.model.ReResourceitem;

@Entity
@Table(name = "RE_FRENCHFR_ORG", indexes = { @Index(name = "I_FRENCHFR_INFO", columnList = "INFO,ID", unique = true),
		@Index(name = "I_FRENCHFR_RESITEMREF", columnList = "RESOURCEITEMREF", unique = false) })
public class ReFrenchfr extends ReLanguageTable {

	private static final long serialVersionUID = 1L;

	public ReFrenchfr() {
		/* */
	}

	public ReFrenchfr cloneFrench(ReResourceitem item) {
		ReFrenchfr french = new ReFrenchfr();
		french = cloneLanguage(item, french);
		return french;
	}

}
