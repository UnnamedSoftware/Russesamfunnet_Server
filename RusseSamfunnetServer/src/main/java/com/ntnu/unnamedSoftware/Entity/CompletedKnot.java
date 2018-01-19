package com.ntnu.unnamedSoftware.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompletedKnot {
	
	@Id
	@Column(name = "completed_id")
	private Integer completedID;
	
	
	private Integer knotID;
	
	@Column(name = "russ_id")
	private Integer userID;
	
	@Column(name="witness_id1")
	private Integer witnessId1;
	
	@Column(name="witness_id2")
	private Integer witnessId2;
	
	public CompletedKnot() {
		
	}

	public Integer getCompletedID() {
		return completedID;
	}

	public void setCompletedID(Integer completedID) {
		this.completedID = completedID;
	}

	public Integer getKnotID() {
		return knotID;
	}

	public void setKnotID(Integer knotID) {
		this.knotID = knotID;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Integer getWitnessId1() {
		return witnessId1;
	}

	public void setWitnessId1(Integer witnessId1) {
		this.witnessId1 = witnessId1;
	}

	public Integer getWitnessId2() {
		return witnessId2;
	}

	public void setWitnessId2(Integer witnessId2) {
		this.witnessId2 = witnessId2;
	}

}
