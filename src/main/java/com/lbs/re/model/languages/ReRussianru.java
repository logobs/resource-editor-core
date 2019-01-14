package com.lbs.re.model.languages;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.lbs.re.model.ReLanguageTable;
import com.lbs.re.model.ReResourceitem;

@Entity
@Table(name = "RE_RUSSIANRU", indexes = { @Index(name = "I_RUSSIANRU_INFO", columnList = "INFO,ID", unique = true),
		@Index(name = "I_RUSSIANRU_RESITEMREF", columnList = "RESOURCEITEMREF", unique = false) })
public class ReRussianru extends ReLanguageTable {

	private static final long serialVersionUID = 1L;

	public ReRussianru() {
		/* */
	}

	public ReRussianru cloneRussianru(ReResourceitem item) {
		ReRussianru russianru = new ReRussianru();
		russianru = cloneLanguage(item, russianru);
		return russianru;
	}

}
