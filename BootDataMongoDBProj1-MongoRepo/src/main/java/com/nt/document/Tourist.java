package com.nt.document;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tourist implements Serializable {
	@Id
	private String  id;  //fixed name
	private  String touristName;
	private  String nativePlace;
	private  Float  age;
	private  String  passportNo;
	private  Long contactNo;
	private  Boolean isVaccinated;
	private  Integer visaDuration;
	private  LocalDateTime  visaExpirtyTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTouristName() {
		return touristName;
	}
	public void setTouristName(String touristName) {
		this.touristName = touristName;
	}
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	public Float getAge() {
		return age;
	}
	public void setAge(Float age) {
		this.age = age;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public Boolean getIsVaccinated() {
		return isVaccinated;
	}
	public void setIsVaccinated(Boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}
	public Integer getVisaDuration() {
		return visaDuration;
	}
	public void setVisaDuration(Integer visaDuration) {
		this.visaDuration = visaDuration;
	}
	public LocalDateTime getVisaExpirtyTime() {
		return visaExpirtyTime;
	}
	public void setVisaExpirtyTime(LocalDateTime visaExpirtyTime) {
		this.visaExpirtyTime = visaExpirtyTime;
	}
	
	
	
	

}
