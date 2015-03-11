package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_PRODUCT_INST_OPT database table.
 * 
 */
@Entity
@Table(name="T_PRODUCT_INST_OPT")
@NamedQuery(name="TProductInstOpt.findAll", query="SELECT t FROM TProductInstOpt t")
public class TProductInstOpt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CLI_ID")
	private BigDecimal cliId;

	@Column(name="INST_ENABLED")
	private String instEnabled;

	@Column(name="OPT_COMMENT")
	private String optComment;

	@Column(name="OPT_INSTALLED")
	private String optInstalled;

	@Column(name="OPT_INUSE")
	private String optInuse;

	@Column(name="OPT_LICENCE")
	private String optLicence;

	@Column(name="OPT_NAME")
	private String optName;

	@Column(name="PROI_ID")
	private BigDecimal proiId;

	@Column(name="SER_ENABLED")
	private String serEnabled;

	@Column(name="SER_ID")
	private BigDecimal serId;

	@Temporal(TemporalType.DATE)
	@Column(name="SNAPHOT_ID")
	private Date snaphotId;

	public TProductInstOpt() {
	}

	public BigDecimal getCliId() {
		return this.cliId;
	}

	public void setCliId(BigDecimal cliId) {
		this.cliId = cliId;
	}

	public String getInstEnabled() {
		return this.instEnabled;
	}

	public void setInstEnabled(String instEnabled) {
		this.instEnabled = instEnabled;
	}

	public String getOptComment() {
		return this.optComment;
	}

	public void setOptComment(String optComment) {
		this.optComment = optComment;
	}

	public String getOptInstalled() {
		return this.optInstalled;
	}

	public void setOptInstalled(String optInstalled) {
		this.optInstalled = optInstalled;
	}

	public String getOptInuse() {
		return this.optInuse;
	}

	public void setOptInuse(String optInuse) {
		this.optInuse = optInuse;
	}

	public String getOptLicence() {
		return this.optLicence;
	}

	public void setOptLicence(String optLicence) {
		this.optLicence = optLicence;
	}

	public String getOptName() {
		return this.optName;
	}

	public void setOptName(String optName) {
		this.optName = optName;
	}

	public BigDecimal getProiId() {
		return this.proiId;
	}

	public void setProiId(BigDecimal proiId) {
		this.proiId = proiId;
	}

	public String getSerEnabled() {
		return this.serEnabled;
	}

	public void setSerEnabled(String serEnabled) {
		this.serEnabled = serEnabled;
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