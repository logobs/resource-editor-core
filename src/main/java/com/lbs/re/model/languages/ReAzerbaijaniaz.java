package com.lbs.re.model.languages;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.lbs.re.model.ReLanguageTable;
import com.lbs.re.model.ReResourceitem;

@Entity
@Table(name = "RE_AZERBAIJANIAZ", indexes = {
		@Index(name = "I_AZERBAIJANIAZ_INFO", columnList = "INFO,ID", unique = true),
		@Index(name = "I_AZERBAIJANIAZ_RESITEMREF", columnList = "RESOURCEITEMREF", unique = false) })
public class ReAzerbaijaniaz extends ReLanguageTable {

	private static final long serialVersionUID = 1L;

	public ReAzerbaijaniaz() {
		/* */
	}

	public ReAzerbaijaniaz cloneAzerbaijaniaz(ReResourceitem item) {
		ReAzerbaijaniaz azerbaijaniaz = new ReAzerbaijaniaz();
		azerbaijaniaz = cloneLanguage(item, azerbaijaniaz);
		return azerbaijaniaz;
	}
}
