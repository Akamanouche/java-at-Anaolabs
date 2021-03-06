package org.anaolabs.jpa.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
@Entity
@Table(name="DOMAIN")
public class Domain {
	@Basic
	@Column(nullable=false)
	private Date created;

	@Id
	@Column(name="ID_DOMAIN")
	private long idDomain;

	@Basic
	@Column(length=100)
	private String name;


	public Domain() {
	}

	public Domain(long idDomain) {
		this.idDomain = idDomain;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public long getIdDomain() {
		return idDomain;
	}

	public void setIdDomain(long idDomain) {
		this.idDomain = idDomain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}