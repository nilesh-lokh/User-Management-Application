package com.inno.userManagementApp.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name="USER_ACCOUNT")
public class CountryMasterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private int uId;
	@Column(name="FIRST_NAME")
	private String fName;
	@Column(name="LAST_NAME")
	private String lName;
	@Column(name="USER_PASSWORD")
	private String password;
	@Column(name="MOBILE")
	private long mobileNo;
	@Column(name="USERS_EMAIL")
	private String eMail;
	@Column(name="DOB")
	private LocalDate dob;
	@Column(name="GENDER")
	private String gender;
	@Column(name="CONTRY_ID")
	private Integer countryId;
	@Column(name="STATE_ID")
	private Integer stateId;
	@Column(name="CITY_ID")
	private Integer CityId;
	@CreationTimestamp
	@Column(name="CREATED_DATE", updatable =false)
	private LocalDate createdDate;
	@UpdateTimestamp
	@Column(name="UPDATED_DATE",insertable = false)
	private LocalDate updatedDate;
	
	

}
