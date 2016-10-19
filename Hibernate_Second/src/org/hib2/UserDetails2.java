package org.hib2;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
/*
 *  This is Model class
 */


@Entity (name="User_Details2")
public class UserDetails2 {
    

	 @Id
	private int userId;
	
	 @Lob
	 private String userName;
	
	@Temporal(TemporalType.DATE)
	private Date joinedDate;
	
	@Embedded
    private Address address;
	
	
	
	
	public Date getDate() {
		return joinedDate;
	}
	public void setDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	 
	
	
	
}
