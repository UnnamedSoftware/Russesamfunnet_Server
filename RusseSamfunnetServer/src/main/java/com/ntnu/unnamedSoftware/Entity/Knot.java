package com.ntnu.unnamedSoftware.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Knot {
	
	@Id
	@Column(name = "knot_id")
	private Integer knotID;
	
	
	private Integer schoolID;
	
	public Integer getKnotID() {
		return knotID;
	}

	public void setKnotID(Integer knotID) {
		this.knotID = knotID;
	}

	public Integer getSchoolID() {
		return schoolID;
	}

	public void setSchoolID(Integer schoolID) {
		this.schoolID = schoolID;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Column(name="details")
	private String details;

}
