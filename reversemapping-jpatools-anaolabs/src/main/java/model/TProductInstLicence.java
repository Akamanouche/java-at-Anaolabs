package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_PRODUCT_INST_LICENCE database table.
 * 
 */
@Entity
@Table(name="T_PRODUCT_INST_LICENCE")
@NamedQuery(name="TProductInstLicence.findAll", query="SELECT t FROM TProductInstLicence t")
public class TProductInstLicence implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CLI_ID")
	private BigDecimal cliId;

	@Column(name="PRO_ID")
	private BigDecimal proId;

	@Column(name="PROI_ID")
	private BigDecimal proiId;

	@Column(name="SER_ID")
	private BigDecimal serId;

	@Temporal(TemporalType.DATE)
	@Column(name="SNAPSHOT_ID")
	private Date snapshotId;

	public TProductInstLicence() {
	}

	public BigDecimal getCliId() {
		return this.cliId;
	}

	public void setCliId(BigDecimal cliId) {
		this.cliId = cliId;
	}

	public BigDecimal getProId() {
		return this.proId;
	}

	public void setProId(BigDecimal proId) {
		this.proId = proId;
	}

	public BigDecimal getProiId() {
		return this.proiId;
	}

	public void setProiId(BigDecimal proiId) {
		this.proiId = proiId;
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