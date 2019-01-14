package com.lbs.re.model.languages;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.lbs.re.model.ReLanguageTable;
import com.lbs.re.model.ReResourceitem;

@Entity
@Table(name = "RE_TURKISHTR", indexes = { @Index(name = "I_TURKISHTR_INFO", columnList = "INFO,ID", unique = true),
		@Index(name = "I_TURKISHTR_RESITEMREF", columnList = "RESOURCEITEMREF", unique = false) })
public class ReTurkishtr extends ReLanguageTable {

	private static final long serialVersionUID = 1L;

	public ReTurkishtr() {
		/* */
	}

	public ReTurkishtr cloneTurkish(ReResourceitem item) {
		ReTurkishtr turkish = new ReTurkishtr();
		turkish = cloneLanguage(item, turkish);
		return turkish;
	}

}
