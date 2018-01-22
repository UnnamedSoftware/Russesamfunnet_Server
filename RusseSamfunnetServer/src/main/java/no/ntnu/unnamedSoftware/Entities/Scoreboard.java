package no.ntnu.unnamedSoftware.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Scoreboard {

	@Id
	@Column(name="scoreboard_id")
	private Integer scoreboardID;
	
	@Column(name="russ_id")
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userID_id", nullable = false)
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
