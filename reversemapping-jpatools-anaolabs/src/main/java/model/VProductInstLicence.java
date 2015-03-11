package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the V_PRODUCT_INST_LICENCE database table.
 * 
 */
@Entity
@Table(name="V_PRODUCT_INST_LICENCE")
@NamedQuery(name="VProductInstLicence.findAll", query="SELECT v FROM VProductInstLicence v")
public class VProductInstLicence implements Serializable {
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
	@Column(name="SNAPHOT_ID")
	private Date snaphotId;

	public VProductInstLicence() {
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

	public Date getSnaphotId() {
		return this.snaphotId;
	}

	public void setSnaphotId(Date snaphotId) {
		this.snaphotId = snaphotId;
	}

}