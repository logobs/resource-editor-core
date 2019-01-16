package com.lbs.re.model.languages;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.lbs.re.model.ReLanguageTable;
import com.lbs.re.model.ReResourceitem;

@Entity
@Table(name = "RE_GERMANDE_ORG", indexes = { @Index(name = "I_GERMANDE_INFO", columnList = "INFO,ID", unique = true),
		@Index(name = "I_GERMANDE_RESITEMREF", columnList = "RESOURCEITEMREF", unique = false) })
public class ReGermande extends ReLanguageTable {

	private static final long serialVersionUID = 1L;

	public ReGermande() {
		/* */
	}

	public ReGermande cloneGermande(ReResourceitem item) {
		ReGermande germande = new ReGermande();
		germande = cloneLanguage(item, germande);
		return germande;
	}

}
