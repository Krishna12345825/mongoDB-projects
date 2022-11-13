package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Person {
	@Id
	@NonNull
	private Integer pid;
	@NonNull
	private String name;
	@NonNull
	private String addrs;
	private DrivingLicense licenseDetails;
	
	
	
	
	public Integer getPid() {
		return pid;
	}




	public void setPid(Integer pid) {
		this.pid = pid;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getAddrs() {
		return addrs;
	}




	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}




	public DrivingLicense getLicenseDetails() {
		return licenseDetails;
	}




	public void setLicenseDetails(DrivingLicense licenseDetails) {
		this.licenseDetails = licenseDetails;
	}




	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", addrs=" + addrs + "]";
	}

}
