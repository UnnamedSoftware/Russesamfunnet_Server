package com.ntnu.unnamedSoftware.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Scoreboard {

	@Id
	@Column(name="scoreboard_id")
	private Integer scoreboardID;
	
	@Column(name="russ_id")
	private Integer userID;
	
	@Column(name="points")
	private Integer points;
	
	public Scoreboard() {
		
	}

	public Integer getScoreboardID() {
		return scoreboardID;
	}

	public void setScoreboardID(Integer scoreboardID) {
		this.scoreboardID = scoreboardID;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}
	
}
