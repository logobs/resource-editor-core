package com.lbs.re.model.languages;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.lbs.re.model.ReLanguageTable;
import com.lbs.re.model.ReResourceitem;

@Entity
@Table(name = "RE_ROMANIANRO", indexes = { @Index(name = "I_ROMANIANRO_INFO", columnList = "INFO,ID", unique = true),
		@Index(name = "I_ROMANIANRO_RESITEMREF", columnList = "RESOURCEITEMREF", unique = false) })
public class ReRomanianro extends ReLanguageTable {

	private static final long serialVersionUID = 1L;

	public ReRomanianro() {
		/* */
	}

	public ReRomanianro cloneRomanianro(ReResourceitem item) {
		ReRomanianro romanianro = new ReRomanianro();
		romanianro = cloneLanguage(item, romanianro);
		return romanianro;
	}
}
