package no.ntnu.unnamedSoftware.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Tags {

	@Id
	@Column(name="tag_id")
	private Integer tagID;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "feedID_id", nullable = false)
	private Integer feedID;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userID_id", nullable = false)
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
