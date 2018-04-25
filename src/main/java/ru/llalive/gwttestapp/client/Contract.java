package ru.llalive.gwttestapp.client;

import java.util.Date;

import com.ibm.icu.text.SimpleDateFormat;

public class Contract {

	private int id;
	private Date createdAt;
	private Insurant insurant;
	private Realty realty;
	private double bounty;
	private Date dateStart;
	private Date dateEnd;
	private double insuranceSum;
	private Date calculatedAt;
	private String comment;

	public Contract() {
	}

	public Contract(int id, Date date, Insurant insurant, Realty realty) {
		this.id = id;
		this.createdAt = date;
		this.insurant = insurant;
		this.realty = realty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public double getBounty() {
		return bounty;
	}

	public void setBounty(double bounty) {
		this.bounty = bounty;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Insurant getInsurant() {
		return insurant;
	}

	public void setInsurant(Insurant insurant) {
		this.insurant = insurant;
	}

	public double getInsuranceSum() {
		return insuranceSum;
	}

	public void setInsuranceSum(double insuranceSum) {
		this.insuranceSum = insuranceSum;
	}

	public Date getCalculatedAt() {
		return calculatedAt;
	}

	public void setCalculatedAt(Date calculatedAt) {
		this.calculatedAt = calculatedAt;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Realty getRealty() {
		return realty;
	}

	public void setRealty(Realty realty) {
		this.realty = realty;
	}

	public void setDatePeriod(Date startDate, Date endDate) {
		this.dateStart = startDate;
		this.dateEnd = endDate;
	}

	public String getDatePeriod() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return sdf.format(dateStart + " - " + sdf.format(dateEnd));
	}
}
