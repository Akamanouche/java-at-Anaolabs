package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_ORG_SERVER database table.
 * 
 */
@Entity
@Table(name="T_ORG_SERVER")
@NamedQuery(name="TOrgServer.findAll", query="SELECT t FROM TOrgServer t")
public class TOrgServer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CLI_ID")
	private BigDecimal cliId;

	@Column(name="ORG_ID")
	private BigDecimal orgId;

	@Column(name="SER_ID")
	private BigDecimal serId;

	@Temporal(TemporalType.DATE)
	@Column(name="SNAPSHOT_ID")
	private Date snapshotId;

	public TOrgServer() {
	}

	public BigDecimal getCliId() {
		return this.cliId;
	}

	public void setCliId(BigDecimal cliId) {
		this.cliId = cliId;
	}

	public BigDecimal getOrgId() {
		return this.orgId;
	}

	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}

	public BigDecimal getSerId() {
		return this.serId;
	}

	public void setSerId(BigDecimal serId) {
		this.serId = serId;
	}

	public Date getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(Date snapshotId) {
		this.snapshotId = snapshotId;
	}

}