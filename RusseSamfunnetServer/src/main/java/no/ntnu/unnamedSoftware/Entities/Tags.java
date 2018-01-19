package no.ntnu.unnamedSoftware.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tags {

	@Id
	@Column(name="tag_id")
	private Integer tagID;
	
	@Column(name="feed_id")
	private Integer feedID;
	
	@Column(name="russ_id")
	private Integer userID;
	
	public Tags() {
		
	}
	

	public Integer getTagID() {
		return tagID;
	}

	public void setTagID(Integer tagID) {
		this.tagID = tagID;
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
	
	
}
