package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_ORG_LICENCE database table.
 * 
 */
@Entity
@Table(name="T_ORG_LICENCE")
@NamedQuery(name="TOrgLicence.findAll", query="SELECT t FROM TOrgLicence t")
public class TOrgLicence implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CLI_ID")
	private BigDecimal cliId;

	@Column(name="LICENCE_ID")
	private BigDecimal licenceId;

	@Column(name="ORG_ID")
	private BigDecimal orgId;

	@Temporal(TemporalType.DATE)
	@Column(name="SNAPSHOT_ID")
	private Date snapshotId;

	public TOrgLicence() {
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

	public Date getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(Date snapshotId) {
		this.snapshotId = snapshotId;
	}

}