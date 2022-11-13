package com.nt.document;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Document
@Setter
@Getter
public class DrivingLicense {
	@NonNull
	@Id
	private Long licenseNo;
	@NonNull
	private String type;
	@NonNull
	private LocalDate expiryTime;
	private  Person personDetails;
	
	
	
	
	
	public Long getLicenseNo() {
		return licenseNo;
	}





	public void setLicenseNo(Long licenseNo) {
		this.licenseNo = licenseNo;
	}





	public String getType() {
		return type;
	}





	public void setType(String type) {
		this.type = type;
	}





	public LocalDate getExpiryTime() {
		return expiryTime;
	}





	public void setExpiryTime(LocalDate expiryTime) {
		this.expiryTime = expiryTime;
	}





	public Person getPersonDetails() {
		return personDetails;
	}





	public void setPersonDetails(Person personDetails) {
		this.personDetails = personDetails;
	}





	@Override
	public String toString() {
		return "DrivingLicense [ licenseNo=" + licenseNo + ", type=" + type + ", expiryTime=" + expiryTime + "]";
	}
	
	
	
	
	
	
	

}
