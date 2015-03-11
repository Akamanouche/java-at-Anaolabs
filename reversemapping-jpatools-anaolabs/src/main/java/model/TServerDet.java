package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_SERVER_DET database table.
 * 
 */
@Entity
@Table(name="T_SERVER_DET")
@NamedQuery(name="TServerDet.findAll", query="SELECT t FROM TServerDet t")
public class TServerDet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CLI_ID")
	private BigDecimal cliId;

	@Column(name="SER_CORENB")
	private BigDecimal serCorenb;

	@Column(name="SER_DUTY")
	private String serDuty;

	@Column(name="SER_ID")
	private BigDecimal serId;

	@Column(name="SER_ISLM")
	private String serIslm;

	@Column(name="SER_LCFREQ")
	private BigDecimal serLcfreq;

	@Column(name="SER_LMPROCNB")
	private BigDecimal serLmprocnb;

	@Column(name="SER_LMPROCTYPE")
	private String serLmproctype;

	@Column(name="SER_MANUFACTURER")
	private String serManufacturer;

	@Column(name="SER_MAXSOCKET")
	private BigDecimal serMaxsocket;

	@Column(name="SER_MODEL")
	private String serModel;

	@Column(name="SER_OSNAME_DETAIL")
	private String serOsnameDetail;

	@Column(name="SER_PARTITION_CPU_COUNT")
	private String serPartitionCpuCount;

	@Column(name="SER_PARTITION_CPU_MAX")
	private String serPartitionCpuMax;

	@Column(name="SER_PARTITION_INFO")
	private String serPartitionInfo;

	@Column(name="SER_PARTITION_MODE")
	private String serPartitionMode;

	@Column(name="SER_PARTITION_POOL_NAME")
	private String serPartitionPoolName;

	@Column(name="SER_PARTITION_TYPE")
	private String serPartitionType;

	@Column(name="SER_POOL_CPU_ACTIVE")
	private String serPoolCpuActive;

	@Column(name="SER_POOL_CPU_CAPACITY")
	private String serPoolCpuCapacity;

	@Column(name="SER_POOL_CPU_MAX")
	private String serPoolCpuMax;

	@Column(name="SER_PROCFREQUENCY")
	private String serProcfrequency;

	@Column(name="SER_PROCNB")
	private BigDecimal serProcnb;

	@Column(name="SER_PROCSMT")
	private String serProcsmt;

	@Column(name="SER_PROCTYPE")
	private String serProctype;

	@Temporal(TemporalType.DATE)
	@Column(name="SER_PURCHASE_DATE")
	private Date serPurchaseDate;

	@Column(name="SER_RAMSIZE")
	private String serRamsize;

	@Column(name="SER_THREADPERCORE")
	private BigDecimal serThreadpercore;

	@Column(name="SER_TYPE")
	private String serType;

	@Column(name="SER_VIRTUALISATION")
	private String serVirtualisation;

	@Column(name="SER_VIRTUALIZED")
	private String serVirtualized;

	@Temporal(TemporalType.DATE)
	@Column(name="SNAPHOT_ID")
	private Date snaphotId;

	public TServerDet() {
	}

	public BigDecimal getCliId() {
		return this.cliId;
	}

	public void setCliId(BigDecimal cliId) {
		this.cliId = cliId;
	}

	public BigDecimal getSerCorenb() {
		return this.serCorenb;
	}

	public void setSerCorenb(BigDecimal serCorenb) {
		this.serCorenb = serCorenb;
	}

	public String getSerDuty() {
		return this.serDuty;
	}

	public void setSerDuty(String serDuty) {
		this.serDuty = serDuty;
	}

	public BigDecimal getSerId() {
		return this.serId;
	}

	public void setSerId(BigDecimal serId) {
		this.serId = serId;
	}

	public String getSerIslm() {
		return this.serIslm;
	}

	public void setSerIslm(String serIslm) {
		this.serIslm = serIslm;
	}

	public BigDecimal getSerLcfreq() {
		return this.serLcfreq;
	}

	public void setSerLcfreq(BigDecimal serLcfreq) {
		this.serLcfreq = serLcfreq;
	}

	public BigDecimal getSerLmprocnb() {
		return this.serLmprocnb;
	}

	public void setSerLmprocnb(BigDecimal serLmprocnb) {
		this.serLmprocnb = serLmprocnb;
	}

	public String getSerLmproctype() {
		return this.serLmproctype;
	}

	public void setSerLmproctype(String serLmproctype) {
		this.serLmproctype = serLmproctype;
	}

	public String getSerManufacturer() {
		return this.serManufacturer;
	}

	public void setSerManufacturer(String serManufacturer) {
		this.serManufacturer = serManufacturer;
	}

	public BigDecimal getSerMaxsocket() {
		return this.serMaxsocket;
	}

	public void setSerMaxsocket(BigDecimal serMaxsocket) {
		this.serMaxsocket = serMaxsocket;
	}

	public String getSerModel() {
		return this.serModel;
	}

	public void setSerModel(String serModel) {
		this.serModel = serModel;
	}

	public String getSerOsnameDetail() {
		return this.serOsnameDetail;
	}

	public void setSerOsnameDetail(String serOsnameDetail) {
		this.serOsnameDetail = serOsnameDetail;
	}

	public String getSerPartitionCpuCount() {
		return this.serPartitionCpuCount;
	}

	public void setSerPartitionCpuCount(String serPartitionCpuCount) {
		this.serPartitionCpuCount = serPartitionCpuCount;
	}

	public String getSerPartitionCpuMax() {
		return this.serPartitionCpuMax;
	}

	public void setSerPartitionCpuMax(String serPartitionCpuMax) {
		this.serPartitionCpuMax = serPartitionCpuMax;
	}

	public String getSerPartitionInfo() {
		return this.serPartitionInfo;
	}

	public void setSerPartitionInfo(String serPartitionInfo) {
		this.serPartitionInfo = serPartitionInfo;
	}

	public String getSerPartitionMode() {
		return this.serPartitionMode;
	}

	public void setSerPartitionMode(String serPartitionMode) {
		this.serPartitionMode = serPartitionMode;
	}

	public String getSerPartitionPoolName() {
		return this.serPartitionPoolName;
	}

	public void setSerPartitionPoolName(String serPartitionPoolName) {
		this.serPartitionPoolName = serPartitionPoolName;
	}

	public String getSerPartitionType() {
		return this.serPartitionType;
	}

	public void setSerPartitionType(String serPartitionType) {
		this.serPartitionType = serPartitionType;
	}

	public String getSerPoolCpuActive() {
		return this.serPoolCpuActive;
	}

	public void setSerPoolCpuActive(String serPoolCpuActive) {
		this.serPoolCpuActive = serPoolCpuActive;
	}

	public String getSerPoolCpuCapacity() {
		return this.serPoolCpuCapacity;
	}

	public void setSerPoolCpuCapacity(String serPoolCpuCapacity) {
		this.serPoolCpuCapacity = serPoolCpuCapacity;
	}

	public String getSerPoolCpuMax() {
		return this.serPoolCpuMax;
	}

	public void setSerPoolCpuMax(String serPoolCpuMax) {
		this.serPoolCpuMax = serPoolCpuMax;
	}

	public String getSerProcfrequency() {
		return this.serProcfrequency;
	}

	public void setSerProcfrequency(String serProcfrequency) {
		this.serProcfrequency = serProcfrequency;
	}

	public BigDecimal getSerProcnb() {
		return this.serProcnb;
	}

	public void setSerProcnb(BigDecimal serProcnb) {
		this.serProcnb = serProcnb;
	}

	public String getSerProcsmt() {
		return this.serProcsmt;
	}

	public void setSerProcsmt(String serProcsmt) {
		this.serProcsmt = serProcsmt;
	}

	public String getSerProctype() {
		return this.serProctype;
	}

	public void setSerProctype(String serProctype) {
		this.serProctype = serProctype;
	}

	public Date getSerPurchaseDate() {
		return this.serPurchaseDate;
	}

	public void setSerPurchaseDate(Date serPurchaseDate) {
		this.serPurchaseDate = serPurchaseDate;
	}

	public String getSerRamsize() {
		return this.serRamsize;
	}

	public void setSerRamsize(String serRamsize) {
		this.serRamsize = serRamsize;
	}

	public BigDecimal getSerThreadpercore() {
		return this.serThreadpercore;
	}

	public void setSerThreadpercore(BigDecimal serThreadpercore) {
		this.serThreadpercore = serThreadpercore;
	}

	public String getSerType() {
		return this.serType;
	}

	public void setSerType(String serType) {
		this.serType = serType;
	}

	public String getSerVirtualisation() {
		return this.serVirtualisation;
	}

	public void setSerVirtualisation(String serVirtualisation) {
		this.serVirtualisation = serVirtualisation;
	}

	public String getSerVirtualized() {
		return this.serVirtualized;
	}

	public void setSerVirtualized(String serVirtualized) {
		this.serVirtualized = serVirtualized;
	}

	public Date getSnaphotId() {
		return this.snaphotId;
	}

	public void setSnaphotId(Date snaphotId) {
		this.snaphotId = snaphotId;
	}

}