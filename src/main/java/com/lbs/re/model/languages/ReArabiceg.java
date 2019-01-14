package com.lbs.re.model.languages;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.lbs.re.model.ReLanguageTable;
import com.lbs.re.model.ReResourceitem;

@Entity
@Table(name = "RE_ARABICEG", indexes = { @Index(name = "I_ARABICEG_INFO", columnList = "INFO,ID", unique = true),
		@Index(name = "I_ARABICEG_RESITEMREF", columnList = "RESOURCEITEMREF", unique = false) })
public class ReArabiceg extends ReLanguageTable {

	private static final long serialVersionUID = 1L;

	public ReArabiceg() {
		/* */
	}

	public ReArabiceg cloneArabiceg(ReResourceitem item) {
		ReArabiceg arabiceg = new ReArabiceg();
		arabiceg = cloneLanguage(item, arabiceg);
		return arabiceg;
	}

}
