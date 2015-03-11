package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the V_SERVER database table.
 * 
 */
@Entity
@Table(name="V_SERVER")
@NamedQuery(name="VServer.findAll", query="SELECT v FROM VServer v")
public class VServer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CLI_ID")
	private BigDecimal cliId;

	@Column(name="SER_AGENTENABLED")
	private String serAgentenabled;

	@Column(name="SER_AGENTVERSION")
	private String serAgentversion;

	@Column(name="SER_CATEGORY")
	private String serCategory;

	@Column(name="SER_CLUSTER_NAME")
	private String serClusterName;

	@Column(name="SER_COUNTRY")
	private String serCountry;

	@Column(name="SER_CRITICITY")
	private String serCriticity;

	@Column(name="SER_ENABLED")
	private String serEnabled;

	@Column(name="SER_GROUP")
	private String serGroup;

	@Column(name="SER_GROUP_TYPE")
	private String serGroupType;

	@Column(name="SER_ID")
	private BigDecimal serId;

	@Column(name="SER_LABEL")
	private String serLabel;

	@Column(name="SER_NAME")
	private String serName;

	@Column(name="SER_OSNAME")
	private String serOsname;

	@Column(name="SER_OSVERSION")
	private String serOsversion;

	@Temporal(TemporalType.DATE)
	@Column(name="SNAPHOT_ID")
	private Date snaphotId;

	public VServer() {
	}

	public BigDecimal getCliId() {
		return this.cliId;
	}

	public void setCliId(BigDecimal cliId) {
		this.cliId = cliId;
	}

	public String getSerAgentenabled() {
		return this.serAgentenabled;
	}

	public void setSerAgentenabled(String serAgentenabled) {
		this.serAgentenabled = serAgentenabled;
	}

	public String getSerAgentversion() {
		return this.serAgentversion;
	}

	public void setSerAgentversion(String serAgentversion) {
		this.serAgentversion = serAgentversion;
	}

	public String getSerCategory() {
		return this.serCategory;
	}

	public void setSerCategory(String serCategory) {
		this.serCategory = serCategory;
	}

	public String getSerClusterName() {
		return this.serClusterName;
	}

	public void setSerClusterName(String serClusterName) {
		this.serClusterName = serClusterName;
	}

	public String getSerCountry() {
		return this.serCountry;
	}

	public void setSerCountry(String serCountry) {
		this.serCountry = serCountry;
	}

	public String getSerCriticity() {
		return this.serCriticity;
	}

	public void setSerCriticity(String serCriticity) {
		this.serCriticity = serCriticity;
	}

	public String getSerEnabled() {
		return this.serEnabled;
	}

	public void setSerEnabled(String serEnabled) {
		this.serEnabled = serEnabled;
	}

	public String getSerGroup() {
		return this.serGroup;
	}

	public void setSerGroup(String serGroup) {
		this.serGroup = serGroup;
	}

	public String getSerGroupType() {
		return this.serGroupType;
	}

	public void setSerGroupType(String serGroupType) {
		this.serGroupType = serGroupType;
	}

	public BigDecimal getSerId() {
		return this.serId;
	}

	public void setSerId(BigDecimal serId) {
		this.serId = serId;
	}

	public String getSerLabel() {
		return this.serLabel;
	}

	public void setSerLabel(String serLabel) {
		this.serLabel = serLabel;
	}

	public String getSerName() {
		return this.serName;
	}

	public void setSerName(String serName) {
		this.serName = serName;
	}

	public String getSerOsname() {
		return this.serOsname;
	}

	public void setSerOsname(String serOsname) {
		this.serOsname = serOsname;
	}

	public String getSerOsversion() {
		return this.serOsversion;
	}

	public void setSerOsversion(String serOsversion) {
		this.serOsversion = serOsversion;
	}

	public Date getSnaphotId() {
		return this.snaphotId;
	}

	public void setSnaphotId(Date snaphotId) {
		this.snaphotId = snaphotId;
	}

}