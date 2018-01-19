package com.ntnu.unnamedSoftware.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class School {

	@Id
	@Column(name="school_id")
	@ManyToOne(cascade= CascadeType.ALL)
	private Integer schoolID;
	
	
	@Column(name="chool_name")
	private String schoolName;
	
	@Column(name="school_status")
	private String schoolStatus;
	
	
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolStatus() {
		return schoolStatus;
	}

	public void setSchoolStatus(String schoolStatus) {
		this.schoolStatus = schoolStatus;
	}

	public School(Integer schoolID)
	{
		this.schoolID = schoolID;
	}

	public Integer getSchoolID() {
		return schoolID;
	}

	public void setSchoolID(Integer schoolID) {
		this.schoolID = schoolID;
	}
	
	
}
