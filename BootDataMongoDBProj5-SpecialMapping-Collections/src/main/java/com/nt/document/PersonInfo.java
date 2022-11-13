package com.nt.document;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Person_Info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonInfo implements Serializable {
	@Id
	private Integer pid;
	private String pname;
	private String paddrs;
	private String[] favColors;
	private  List<String> friends;
	private  Set<Long> contactNumbers;
	private Map<String,Long>  bankAccountDetails;
	private Properties  idDetails;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddrs() {
		return paddrs;
	}
	public void setPaddrs(String paddrs) {
		this.paddrs = paddrs;
	}
	public String[] getFavColors() {
		return favColors;
	}
	public void setFavColors(String[] favColors) {
		this.favColors = favColors;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Set<Long> getContactNumbers() {
		return contactNumbers;
	}
	public void setContactNumbers(Set<Long> contactNumbers) {
		this.contactNumbers = contactNumbers;
	}
	public Map<String, Long> getBankAccountDetails() {
		return bankAccountDetails;
	}
	public void setBankAccountDetails(Map<String, Long> bankAccountDetails) {
		this.bankAccountDetails = bankAccountDetails;
	}
	public Properties getIdDetails() {
		return idDetails;
	}
	public void setIdDetails(Properties idDetails) {
		this.idDetails = idDetails;
	}
	
	
	

}
