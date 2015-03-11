package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the V_PRODUCT_INST database table.
 * 
 */
@Entity
@Table(name="V_PRODUCT_INST")
@NamedQuery(name="VProductInst.findAll", query="SELECT v FROM VProductInst v")
public class VProductInst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CLI_ID")
	private BigDecimal cliId;

	@Column(name="PRO_ID")
	private BigDecimal proId;

	@Temporal(TemporalType.DATE)
	@Column(name="PROI_DATE")
	private Date proiDate;

	@Column(name="PROI_DB_ARCLOG")
	private String proiDbArclog;

	@Column(name="PROI_DB_CAT")
	private String proiDbCat;

	@Column(name="PROI_DB_GLOBAL_NAME")
	private String proiDbGlobalName;

	@Column(name="PROI_DB_NAME")
	private String proiDbName;

	@Column(name="PROI_DB_ROLE")
	private String proiDbRole;

	@Column(name="PROI_DB_TYPE")
	private String proiDbType;

	@Column(name="PROI_EDITION")
	private String proiEdition;

	@Column(name="PROI_HOST_NAME")
	private String proiHostName;

	@Column(name="PROI_ID")
	private BigDecimal proiId;

	@Column(name="PROI_INST_ENABLED")
	private String proiInstEnabled;

	@Column(name="PROI_INST_NAME")
	private String proiInstName;

	@Column(name="PROI_INSTANCE_STATUS")
	private String proiInstanceStatus;

	@Column(name="PROI_IS_DOWNGRD")
	private String proiIsDowngrd;

	@Column(name="PROI_NAME")
	private String proiName;

	@Column(name="PROI_VERSION")
	private String proiVersion;

	@Column(name="SER_ID")
	private BigDecimal serId;

	@Temporal(TemporalType.DATE)
	@Column(name="SNAPHOT_ID")
	private Date snaphotId;

	public VProductInst() {
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

	public Date getProiDate() {
		return this.proiDate;
	}

	public void setProiDate(Date proiDate) {
		this.proiDate = proiDate;
	}

	public String getProiDbArclog() {
		return this.proiDbArclog;
	}

	public void setProiDbArclog(String proiDbArclog) {
		this.proiDbArclog = proiDbArclog;
	}

	public String getProiDbCat() {
		return this.proiDbCat;
	}

	public void setProiDbCat(String proiDbCat) {
		this.proiDbCat = proiDbCat;
	}

	public String getProiDbGlobalName() {
		return this.proiDbGlobalName;
	}

	public void setProiDbGlobalName(String proiDbGlobalName) {
		this.proiDbGlobalName = proiDbGlobalName;
	}

	public String getProiDbName() {
		return this.proiDbName;
	}

	public void setProiDbName(String proiDbName) {
		this.proiDbName = proiDbName;
	}

	public String getProiDbRole() {
		return this.proiDbRole;
	}

	public void setProiDbRole(String proiDbRole) {
		this.proiDbRole = proiDbRole;
	}

	public String getProiDbType() {
		return this.proiDbType;
	}

	public void setProiDbType(String proiDbType) {
		this.proiDbType = proiDbType;
	}

	public String getProiEdition() {
		return this.proiEdition;
	}

	public void setProiEdition(String proiEdition) {
		this.proiEdition = proiEdition;
	}

	public String getProiHostName() {
		return this.proiHostName;
	}

	public void setProiHostName(String proiHostName) {
		this.proiHostName = proiHostName;
	}

	public BigDecimal getProiId() {
		return this.proiId;
	}

	public void setProiId(BigDecimal proiId) {
		this.proiId = proiId;
	}

	public String getProiInstEnabled() {
		return this.proiInstEnabled;
	}

	public void setProiInstEnabled(String proiInstEnabled) {
		this.proiInstEnabled = proiInstEnabled;
	}

	public String getProiInstName() {
		return this.proiInstName;
	}

	public void setProiInstName(String proiInstName) {
		this.proiInstName = proiInstName;
	}

	public String getProiInstanceStatus() {
		return this.proiInstanceStatus;
	}

	public void setProiInstanceStatus(String proiInstanceStatus) {
		this.proiInstanceStatus = proiInstanceStatus;
	}

	public String getProiIsDowngrd() {
		return this.proiIsDowngrd;
	}

	public void setProiIsDowngrd(String proiIsDowngrd) {
		this.proiIsDowngrd = proiIsDowngrd;
	}

	public String getProiName() {
		return this.proiName;
	}

	public void setProiName(String proiName) {
		this.proiName = proiName;
	}

	public String getProiVersion() {
		return this.proiVersion;
	}

	public void setProiVersion(String proiVersion) {
		this.proiVersion = proiVersion;
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