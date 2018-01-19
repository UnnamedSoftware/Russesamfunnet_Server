package no.ntnu.unnamedSoftware.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Zone {

	@Id
	@Column(name="zone_id")
	private String zoneID;
	
	public Zone(String zoneID)
	{
		this.zoneID = zoneID;
 	}

	public String getZoneID() {
		return zoneID;
	}

	public void setZoneID(String zoneID) {
		this.zoneID = zoneID;
	}
}
