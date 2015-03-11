package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the V_PRODUCT database table.
 * 
 */
@Entity
@Table(name="V_PRODUCT")
@NamedQuery(name="VProduct.findAll", query="SELECT v FROM VProduct v")
public class VProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CLI_ID")
	private BigDecimal cliId;

	@Temporal(TemporalType.DATE)
	@Column(name="PRO_CREATION_DATE")
	private Date proCreationDate;

	@Column(name="PRO_FAMILY")
	private String proFamily;

	@Column(name="PRO_ID")
	private BigDecimal proId;

	@Column(name="PRO_NAME")
	private String proName;

	@Column(name="PRO_SHORT_NAME")
	private String proShortName;

	@Column(name="SER_ID")
	private BigDecimal serId;

	@Temporal(TemporalType.DATE)
	@Column(name="SNAPHOT_ID")
	private Date snaphotId;

	public VProduct() {
	}

	public BigDecimal getCliId() {
		return this.cliId;
	}

	public void setCliId(BigDecimal cliId) {
		this.cliId = cliId;
	}

	public Date getProCreationDate() {
		return this.proCreationDate;
	}

	public void setProCreationDate(Date proCreationDate) {
		this.proCreationDate = proCreationDate;
	}

	public String getProFamily() {
		return this.proFamily;
	}

	public void setProFamily(String proFamily) {
		this.proFamily = proFamily;
	}

	public BigDecimal getProId() {
		return this.proId;
	}

	public void setProId(BigDecimal proId) {
		this.proId = proId;
	}

	public String getProName() {
		return this.proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProShortName() {
		return this.proShortName;
	}

	public void setProShortName(String proShortName) {
		this.proShortName = proShortName;
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