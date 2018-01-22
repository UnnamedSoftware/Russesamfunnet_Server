package no.ntnu.unnamedSoftware.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feed {
	
	@Id
	@Column(name="feed_id")
	private Integer feedID;
	
	@Column(name ="russ_id")
	
	private Integer userID;
	
	@Column(name = "zone")
	private String zone;
	
	@Column(name="school_id")
	private String schoolID;
	
	@Column(name = "message")
	private String message;
	
	public Feed()
	{
		
	}
	

	public Integer getFeedID() {
		return feedID;
	}

	public void setFeedID(Integer feedID) {
		this.feedID = feedID;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
