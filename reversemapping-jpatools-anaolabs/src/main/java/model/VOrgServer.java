package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the V_ORG_SERVER database table.
 * 
 */
@Entity
@Table(name="V_ORG_SERVER")
@NamedQuery(name="VOrgServer.findAll", query="SELECT v FROM VOrgServer v")
public class VOrgServer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CLI_ID")
	private BigDecimal cliId;

	@Column(name="ORG_ID")
	private BigDecimal orgId;

	@Column(name="SER_ID")
	private BigDecimal serId;

	@Temporal(TemporalType.DATE)
	@Column(name="SNAPHOT_ID")
	private Date snaphotId;

	public VOrgServer() {
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

	public Date getSnaphotId() {
		return this.snaphotId;
	}

	public void setSnaphotId(Date snaphotId) {
		this.snaphotId = snaphotId;
	}

}