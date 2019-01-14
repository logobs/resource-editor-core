package com.lbs.re.model.languages;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.lbs.re.model.ReLanguageTable;
import com.lbs.re.model.ReResourceitem;

@Entity
@Table(name = "RE_ALBANIANKV", indexes = { @Index(name = "I_ALBANIANKV_INFO", columnList = "INFO,ID", unique = true),
		@Index(name = "I_ALBANIANKV_RESITEMREF", columnList = "RESOURCEITEMREF", unique = false) })
public class ReAlbaniankv extends ReLanguageTable {

	private static final long serialVersionUID = 1L;

	public ReAlbaniankv() {
		/* */
	}

	public ReAlbaniankv cloneAlbaniankv(ReResourceitem item) {
		ReAlbaniankv albaniankv = new ReAlbaniankv();
		albaniankv = cloneLanguage(item, albaniankv);
		return albaniankv;
	}
}
