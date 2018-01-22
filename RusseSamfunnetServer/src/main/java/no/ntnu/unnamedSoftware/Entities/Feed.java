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
public class Feed {
	
	@Id
	@Column(name="feed_id")
	@OneToMany(cascade = CascadeType.ALL,
    fetch = FetchType.LAZY,
    mappedBy = "feedID")
	private Integer feedID;
	
	@Column(name ="russ_id")
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userID_id", nullable = false)
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
