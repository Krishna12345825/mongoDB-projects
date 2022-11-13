//Player
package com.nt.document;

import java.util.Map;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Player {
	@Id
	private  Integer pid;
	private String pname;
	private  String paddrs;
	private  Set<Sport>  sports;
	private  Map<String,Medal> medals;
	
	
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Player(Integer pid, String pname, String paddrs, Set<Sport> sports, Map<String, Medal> medals) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.paddrs = paddrs;
		this.sports = sports;
		this.medals = medals;
	}



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



	public Set<Sport> getSports() {
		return sports;
	}



	public void setSports(Set<Sport> sports) {
		this.sports = sports;
	}



	public Map<String, Medal> getMedals() {
		return medals;
	}



	public void setMedals(Map<String, Medal> medals) {
		this.medals = medals;
	}



	@Override
	public String toString() {
		return "Player [pid=" + pid + ", pname=" + pname + ", paddrs=" + paddrs + "]";
	}

}
