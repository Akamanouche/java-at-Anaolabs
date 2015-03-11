package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the V_ORG database table.
 * 
 */
@Entity
@Table(name="V_ORG")
@NamedQuery(name="VOrg.findAll", query="SELECT v FROM VOrg v")
public class VOrg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CLI_ID")
	private BigDecimal cliId;

	@Column(name="ORG_ID")
	private BigDecimal orgId;

	@Column(name="ORG_NAME")
	private String orgName;

	@Column(name="ORG_PATH")
	private String orgPath;

	@Column(name="ORG_TYPE")
	private String orgType;

	@Temporal(TemporalType.DATE)
	@Column(name="SNAPSHOT_ID")
	private Date snapshotId;

	public VOrg() {
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

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgPath() {
		return this.orgPath;
	}

	public void setOrgPath(String orgPath) {
		this.orgPath = orgPath;
	}

	public String getOrgType() {
		return this.orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public Date getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(Date snapshotId) {
		this.snapshotId = snapshotId;
	}

}