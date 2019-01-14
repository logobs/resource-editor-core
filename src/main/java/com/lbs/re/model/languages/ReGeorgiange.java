package com.lbs.re.model.languages;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.lbs.re.model.ReLanguageTable;
import com.lbs.re.model.ReResourceitem;

@Entity
@Table(name = "RE_GEORGIANGE", indexes = { @Index(name = "I_GEORGIANGE_INFO", columnList = "INFO,ID", unique = true),
		@Index(name = "I_GEORGIANGE_RESITEMREF", columnList = "RESOURCEITEMREF", unique = false) })
public class ReGeorgiange extends ReLanguageTable {

	private static final long serialVersionUID = 1L;

	public ReGeorgiange() {
		/* */
	}

	public ReGeorgiange cloneGeorgiange(ReResourceitem item) {
		ReGeorgiange georgiange = new ReGeorgiange();
		georgiange = cloneLanguage(item, georgiange);
		return georgiange;
	}
}
