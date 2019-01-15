package com.lbs.re.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "RE_OPERATION")
@EntityListeners(AuditingEntityListener.class)
public class ReOperation extends AbstractBaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "OPERATION_NAME", nullable = false, unique = true)
	private String operationName;

	@Column(name = "OPERATION_DESCRIPTION")
	private String operationDescription;

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public String getOperationDescription() {
		return operationDescription;
	}

	public void setOperationDescription(String operationDescription) {
		this.operationDescription = operationDescription;
	}

}
