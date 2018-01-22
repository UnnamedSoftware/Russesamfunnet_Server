package no.ntnu.unnamedSoftware.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Knot {
	
	@Id
	@Column(name = "knot_id")
	private Integer knotID;
	
	@Column(name="school_id")
	@OneToMany(cascade = CascadeType.ALL,
		    fetch = FetchType.LAZY,
		    mappedBy = "schoolID")
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
