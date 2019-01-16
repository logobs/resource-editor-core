package com.lbs.re.model.languages;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.lbs.re.model.ReLanguageTable;
import com.lbs.re.model.ReResourceitem;

@Entity
@Table(name = "RE_PERSIANIR_ORG", indexes = { @Index(name = "I_PERSIANIR_INFO", columnList = "INFO,ID", unique = true),
		@Index(name = "I_PERSIANIR_RESITEMREF", columnList = "RESOURCEITEMREF", unique = false) })
public class RePersianir extends ReLanguageTable {

	private static final long serialVersionUID = 1L;

	public RePersianir() {
		/* */
	}

	public RePersianir clonePersianir(ReResourceitem item) {
		RePersianir persianir = new RePersianir();
		persianir = cloneLanguage(item, persianir);
		return persianir;
	}
}
