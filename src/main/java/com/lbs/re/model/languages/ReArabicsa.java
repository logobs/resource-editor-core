package com.lbs.re.model.languages;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.lbs.re.model.ReLanguageTable;
import com.lbs.re.model.ReResourceitem;

@Entity
@Table(name = "RE_ARABICSA", indexes = { @Index(name = "I_ARABICSA_INFO", columnList = "INFO,ID", unique = true),
		@Index(name = "I_ARABICSA_RESITEMREF", columnList = "RESOURCEITEMREF", unique = false) })
public class ReArabicsa extends ReLanguageTable {

	private static final long serialVersionUID = 1L;

	public ReArabicsa() {
		/* */
	}

	public ReArabicsa cloneArabicsa(ReResourceitem item) {
		ReArabicsa arabicsa = new ReArabicsa();
		arabicsa = cloneLanguage(item, arabicsa);
		return arabicsa;
	}

}
