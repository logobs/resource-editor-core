package com.lbs.re.model.languages;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.lbs.re.model.ReLanguageTable;
import com.lbs.re.model.ReResourceitem;

@Entity
@Table(name = "RE_TURKMENTM", indexes = { @Index(name = "I_TURKMENTM_INFO", columnList = "INFO,ID", unique = true),
		@Index(name = "I_TURKMENTM_RESITEMREF", columnList = "RESOURCEITEMREF", unique = false) })
public class ReTurkmentm extends ReLanguageTable {

	private static final long serialVersionUID = 1L;

	public ReTurkmentm() {
		/* */
	}

	public ReTurkmentm cloneTurkmentm(ReResourceitem item) {
		ReTurkmentm turkmentm = new ReTurkmentm();
		turkmentm = cloneLanguage(item, turkmentm);
		return turkmentm;
	}

}
