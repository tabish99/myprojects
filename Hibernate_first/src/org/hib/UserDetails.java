package org.hib;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


/*
 * 
 *  This is Model class
 */


@Entity (name="User_Details")
//@Table
public class UserDetails {
    
	 @Id
	private int userId;
	
	 @Lob
	 private String userName;
	
	@Temporal(TemporalType.DATE)
	private Date joinedDate;
	
	@Transient
    private String address;
	
	
	
	public Date getDate() {
		return joinedDate;
	}
	public void setDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
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
