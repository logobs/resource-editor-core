package com.lbs.re.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.lbs.re.util.HasLogger;

@MappedSuperclass
public class AbstractBaseEntity implements Serializable, HasLogger {

	@Id
	@Column(name = "ID", nullable = false, updatable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id = 0;

	@LastModifiedBy
	@Column(name = "MODIFIEDBY")
	private Integer modifiedby;

	@LastModifiedDate
	@Column(name = "MODIFIEDON", columnDefinition = "datetime")
	@DateTimeFormat
	private LocalDateTime modifiedon;

	@CreatedBy
	@Column(name = "CREATEDBY")
	private Integer createdby;

	@CreatedDate
	@Column(name = "CREATEDON", columnDefinition = "datetime")
	@DateTimeFormat
	private LocalDateTime createdon;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isNew() {
		return id == 0;
	}

	public Integer getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(Integer modifiedby) {
		this.modifiedby = modifiedby;
	}

	public LocalDateTime getModifiedon() {
		return modifiedon;
	}

	public void setModifiedon(LocalDateTime modifiedon) {
		this.modifiedon = modifiedon;
	}

	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	public LocalDateTime getCreatedon() {
		return createdon;
	}

	public void setCreatedon(LocalDateTime createdon) {
		this.createdon = createdon;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractBaseEntity other = (AbstractBaseEntity) obj;
		if (getId() == 0 && other.getId() == 0) {
			if (System.identityHashCode(this) == System.identityHashCode(other)) {
				return true;
			}
			return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
