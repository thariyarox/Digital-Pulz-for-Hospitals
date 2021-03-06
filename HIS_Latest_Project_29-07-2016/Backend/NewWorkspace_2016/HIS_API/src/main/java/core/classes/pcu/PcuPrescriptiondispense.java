package core.classes.pcu;

// default package
// Generated Aug 20, 2014 1:40:33 PM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * PcuPrescriptiondispense generated by hbm2java
 */
public class PcuPrescriptiondispense implements java.io.Serializable {

	private PcuPrescriptiondispenseId id;
	private Date dispensedDate;
	private Integer dispensedBy;
	private Float quanity;

	public PcuPrescriptiondispense() {
	}

	public PcuPrescriptiondispense(PcuPrescriptiondispenseId id) {
		this.id = id;
	}

	public PcuPrescriptiondispense(PcuPrescriptiondispenseId id,
			Date dispensedDate, Integer dispensedBy, Float quanity) {
		this.id = id;
		this.dispensedDate = dispensedDate;
		this.dispensedBy = dispensedBy;
		this.quanity = quanity;
	}

	public PcuPrescriptiondispenseId getId() {
		return this.id;
	}

	public void setId(PcuPrescriptiondispenseId id) {
		this.id = id;
	}

	public Date getDispensedDate() {
		return this.dispensedDate;
	}

	public void setDispensedDate(Date dispensedDate) {
		this.dispensedDate = dispensedDate;
	}

	public Integer getDispensedBy() {
		return this.dispensedBy;
	}

	public void setDispensedBy(Integer dispensedBy) {
		this.dispensedBy = dispensedBy;
	}

	public Float getQuanity() {
		return this.quanity;
	}

	public void setQuanity(Float quanity) {
		this.quanity = quanity;
	}

}
