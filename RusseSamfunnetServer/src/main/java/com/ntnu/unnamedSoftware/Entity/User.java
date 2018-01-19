package com.ntnu.unnamedSoftware.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "russ")
public class User {
	
	@Id
	@Column(name="user_id")
	private Integer userID;
	
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="school",cascade = CascadeType.ALL)
	private Integer schoolID;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="zone",cascade = CascadeType.ALL)
	private String zoneID;
	
	@Column(name="email")
	private String email;
	@Column(name="first_name")
	private String name;
	@Column(name="last_name")
	private String surname;
	@Column(name="password")
	private String password;
	@Column(name="profile_picture")
	private String profilePicture; 
	@Column(name="russ_card")
	private String russeCard;
	@Column(name="role")
	private String role;
	@Column(name="year")
	private Integer year;
	
	
	public User()
	{
		
	}
	
	
	
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public Integer getSchoolID() {
		return schoolID;
	}
	public void setSchoolID(Integer schoolID) {
		this.schoolID = schoolID;
	}
	public String getZoneID() {
		return zoneID;
	}
	public void setZoneID(String zoneID) {
		this.zoneID = zoneID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	public String getRusseCard() {
		return russeCard;
	}
	public void setRusseCard(String russeCard) {
		this.russeCard = russeCard;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	
}
