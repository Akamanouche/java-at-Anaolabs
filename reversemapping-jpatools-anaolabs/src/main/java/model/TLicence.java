package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the T_LICENCE database table.
 * 
 */
@Entity
@Table(name="T_LICENCE")
@NamedQuery(name="TLicence.findAll", query="SELECT t FROM TLicence t")
public class TLicence implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CLI_ID")
	private BigDecimal cliId;

	@Column(name="CURRENCY_NAME")
	private String currencyName;

	@Column(name="CURRENCY_SYMBOL")
	private String currencySymbol;

	@Temporal(TemporalType.DATE)
	@Column(name="LICENCE_END")
	private Date licenceEnd;

	@Column(name="LICENCE_ID")
	private BigDecimal licenceId;

	@Column(name="LICENCE_IS_TEMPORARY")
	private BigDecimal licenceIsTemporary;

	@Column(name="LICENCE_MACHINE_TYPE")
	private String licenceMachineType;

	@Column(name="LICENCE_MACHINE_TYPE_QTY")
	private BigDecimal licenceMachineTypeQty;

	@Column(name="LICENCE_METRIC")
	private String licenceMetric;

	@Temporal(TemporalType.DATE)
	@Column(name="LICENCE_ORDER_DATE")
	private Date licenceOrderDate;

	@Column(name="LICENCE_ORDER_PRICE")
	private BigDecimal licenceOrderPrice;

	@Column(name="LICENCE_QTY")
	private BigDecimal licenceQty;

	@Column(name="LICENCE_REF")
	private String licenceRef;

	@Column(name="LICENCE_SPECIFIC_RULE")
	private BigDecimal licenceSpecificRule;

	@Column(name="LICENCE_TYPE")
	private String licenceType;

	@Column(name="LICENCE_USER_MIN_QTY")
	private BigDecimal licenceUserMinQty;

	@Column(name="OPTION_NAME")
	private String optionName;

	@Column(name="OPTION_PRICE")
	private BigDecimal optionPrice;

	@Column(name="OPTION_SHORTCUT")
	private String optionShortcut;

	@Column(name="PRODUCT_EDITION")
	private String productEdition;

	@Column(name="PRODUCT_FAMILY")
	private String productFamily;

	@Column(name="PRODUCT_NAME")
	private String productName;

	@Column(name="PRODUCT_SHORT_NAME")
	private String productShortName;

	@Temporal(TemporalType.DATE)
	@Column(name="SNAPSHOT_ID")
	private Date snapshotId;

	@Temporal(TemporalType.DATE)
	@Column(name="SUPPORT_END")
	private Date supportEnd;

	public TLicence() {
	}

	public BigDecimal getCliId() {
		return this.cliId;
	}

	public void setCliId(BigDecimal cliId) {
		this.cliId = cliId;
	}

	public String getCurrencyName() {
		return this.currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getCurrencySymbol() {
		return this.currencySymbol;
	}

	public void setCurrencySymbol(String currencySymbol) {
		this.currencySymbol = currencySymbol;
	}

	public Date getLicenceEnd() {
		return this.licenceEnd;
	}

	public void setLicenceEnd(Date licenceEnd) {
		this.licenceEnd = licenceEnd;
	}

	public BigDecimal getLicenceId() {
		return this.licenceId;
	}

	public void setLicenceId(BigDecimal licenceId) {
		this.licenceId = licenceId;
	}

	public BigDecimal getLicenceIsTemporary() {
		return this.licenceIsTemporary;
	}

	public void setLicenceIsTemporary(BigDecimal licenceIsTemporary) {
		this.licenceIsTemporary = licenceIsTemporary;
	}

	public String getLicenceMachineType() {
		return this.licenceMachineType;
	}

	public void setLicenceMachineType(String licenceMachineType) {
		this.licenceMachineType = licenceMachineType;
	}

	public BigDecimal getLicenceMachineTypeQty() {
		return this.licenceMachineTypeQty;
	}

	public void setLicenceMachineTypeQty(BigDecimal licenceMachineTypeQty) {
		this.licenceMachineTypeQty = licenceMachineTypeQty;
	}

	public String getLicenceMetric() {
		return this.licenceMetric;
	}

	public void setLicenceMetric(String licenceMetric) {
		this.licenceMetric = licenceMetric;
	}

	public Date getLicenceOrderDate() {
		return this.licenceOrderDate;
	}

	public void setLicenceOrderDate(Date licenceOrderDate) {
		this.licenceOrderDate = licenceOrderDate;
	}

	public BigDecimal getLicenceOrderPrice() {
		return this.licenceOrderPrice;
	}

	public void setLicenceOrderPrice(BigDecimal licenceOrderPrice) {
		this.licenceOrderPrice = licenceOrderPrice;
	}

	public BigDecimal getLicenceQty() {
		return this.licenceQty;
	}

	public void setLicenceQty(BigDecimal licenceQty) {
		this.licenceQty = licenceQty;
	}

	public String getLicenceRef() {
		return this.licenceRef;
	}

	public void setLicenceRef(String licenceRef) {
		this.licenceRef = licenceRef;
	}

	public BigDecimal getLicenceSpecificRule() {
		return this.licenceSpecificRule;
	}

	public void setLicenceSpecificRule(BigDecimal licenceSpecificRule) {
		this.licenceSpecificRule = licenceSpecificRule;
	}

	public String getLicenceType() {
		return this.licenceType;
	}

	public void setLicenceType(String licenceType) {
		this.licenceType = licenceType;
	}

	public BigDecimal getLicenceUserMinQty() {
		return this.licenceUserMinQty;
	}

	public void setLicenceUserMinQty(BigDecimal licenceUserMinQty) {
		this.licenceUserMinQty = licenceUserMinQty;
	}

	public String getOptionName() {
		return this.optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public BigDecimal getOptionPrice() {
		return this.optionPrice;
	}

	public void setOptionPrice(BigDecimal optionPrice) {
		this.optionPrice = optionPrice;
	}

	public String getOptionShortcut() {
		return this.optionShortcut;
	}

	public void setOptionShortcut(String optionShortcut) {
		this.optionShortcut = optionShortcut;
	}

	public String getProductEdition() {
		return this.productEdition;
	}

	public void setProductEdition(String productEdition) {
		this.productEdition = productEdition;
	}

	public String getProductFamily() {
		return this.productFamily;
	}

	public void setProductFamily(String productFamily) {
		this.productFamily = productFamily;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductShortName() {
		return this.productShortName;
	}

	public void setProductShortName(String productShortName) {
		this.productShortName = productShortName;
	}

	public Date getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(Date snapshotId) {
		this.snapshotId = snapshotId;
	}

	public Date getSupportEnd() {
		return this.supportEnd;
	}

	public void setSupportEnd(Date supportEnd) {
		this.supportEnd = supportEnd;
	}

}