package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the V_TRANSLATION database table.
 * 
 */
@Entity
@Table(name="V_TRANSLATION")
@NamedQuery(name="VTranslation.findAll", query="SELECT v FROM VTranslation v")
public class VTranslation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="LANG_ID")
	private BigDecimal langId;

	@Column(name="TRANS_ID")
	private String transId;

	@Column(name="TRANS_VALUE")
	private String transValue;

	public VTranslation() {
	}

	public BigDecimal getLangId() {
		return this.langId;
	}

	public void setLangId(BigDecimal langId) {
		this.langId = langId;
	}

	public String getTransId() {
		return this.transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getTransValue() {
		return this.transValue;
	}

	public void setTransValue(String transValue) {
		this.transValue = transValue;
	}

}