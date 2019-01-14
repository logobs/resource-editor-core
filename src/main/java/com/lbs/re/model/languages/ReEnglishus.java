package com.lbs.re.model.languages;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.lbs.re.model.ReLanguageTable;
import com.lbs.re.model.ReResourceitem;

@Entity
@Table(name = "RE_ENGLISHUS", indexes = { @Index(name = "I_ENGLISHUS_INFO", columnList = "INFO,ID", unique = true),
		@Index(name = "I_ENGLISHUS_RESITEMREF", columnList = "RESOURCEITEMREF", unique = false) })
public class ReEnglishus extends ReLanguageTable {

	private static final long serialVersionUID = 1L;

	public ReEnglishus() {
		/* */
	}

	public ReEnglishus cloneEnglishus(ReResourceitem item) {
		ReEnglishus englishus = new ReEnglishus();
		englishus = cloneLanguage(item, englishus);
		return englishus;
	}

}
