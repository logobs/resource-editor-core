package com.lbs.re.model;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Index;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.lbs.re.util.EnumsV2.DocType;
import com.lbs.re.util.converter.DocTypeConverter;

@Entity
@Table(name = "RE_HELPDOCS", indexes = {
		@Index(name = "I_HELPDOCS_01", columnList = "DOCNAME,DOCTITLE,DOCTYPE", unique = true) })
@EntityListeners(AuditingEntityListener.class)
public class ReHelpDocs extends AbstractBaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "DOCNAME", columnDefinition = "nvarchar(200)", nullable = false)
	private String docname;

	@Column(name = "DOCTITLE", columnDefinition = "nvarchar(200)", nullable = false)
	private String doctitle;

	@Convert(converter = DocTypeConverter.class)
	@Column(name = "DOCTYPE", nullable = false)
	private DocType doctype;

	@Column(name = "DOCBODY", columnDefinition = "varchar(8000)", nullable = false)
	private String docbody;

	@Column(name = "VERSION")
	private int version;

	public final String getDocname() {
		return docname;
	}

	public final void setDocname(String docname) {
		this.docname = docname;
	}

	public final String getDoctitle() {
		return doctitle;
	}

	public final void setDoctitle(String doctitle) {
		this.doctitle = doctitle;
	}

	public final DocType getDoctype() {
		return doctype;
	}

	public final void setDoctype(DocType doctype) {
		this.doctype = doctype;
	}

	public final String getDocbody() {
		return docbody;
	}

	public final void setDocbody(String docbody) {
		this.docbody = docbody;
	}

	public final int getVersion() {
		return version;
	}

	public final void setVersion(int version) {
		this.version = version;
	}

	public final boolean isPersisted() {
		return getId() != null;
	}

	public ReHelpDocs() {
		/**
		 * */
	}

}
