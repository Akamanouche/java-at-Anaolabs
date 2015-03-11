package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the V_ORG_LICENCE database table.
 * 
 */
@Entity
@Table(name="V_ORG_LICENCE")
@NamedQuery(name="VOrgLicence.findAll", query="SELECT v FROM VOrgLicence v")
public class VOrgLicence implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CLI_ID")
	private BigDecimal cliId;

	@Column(name="LICENCE_ID")
	private BigDecimal licenceId;

	@Column(name="ORG_ID")
	private BigDecimal orgId;

	@Temporal(TemporalType.DATE)
	@Column(name="SNAPHOT_ID")
	private Date snaphotId;

	public VOrgLicence() {
	}

	public BigDecimal getCliId() {
		return this.cliId;
	}

	public void setCliId(BigDecimal cliId) {
		this.cliId = cliId;
	}

	public BigDecimal getLicenceId() {
		return this.licenceId;
	}

	public void setLicenceId(BigDecimal licenceId) {
		this.licenceId = licenceId;
	}

	public BigDecimal getOrgId() {
		return this.orgId;
	}

	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}

	public Date getSnaphotId() {
		return this.snaphotId;
	}

	public void setSnaphotId(Date snaphotId) {
		this.snaphotId = snaphotId;
	}

}