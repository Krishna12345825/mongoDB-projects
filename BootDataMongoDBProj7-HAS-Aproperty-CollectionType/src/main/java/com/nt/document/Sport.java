//child1 class
package com.nt.document;

import java.util.Arrays;

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
public class Sport {
	@Id
	private Integer sid;
	private String sname;
	private  String[] kitItems;
	
	
	
	
	
	public Integer getSid() {
		return sid;
	}





	public void setSid(Integer sid) {
		this.sid = sid;
	}





	public String getSname() {
		return sname;
	}





	public void setSname(String sname) {
		this.sname = sname;
	}





	public String[] getKitItems() {
		return kitItems;
	}





	public void setKitItems(String[] kitItems) {
		this.kitItems = kitItems;
	}





	public Sport() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Sport(Integer sid, String sname, String[] kitItems) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.kitItems = kitItems;
	}





	@Override
	public String toString() {
		return "Sport [sid=" + sid + ", sname=" + sname + ", kitItems=" + Arrays.toString(kitItems) + "]";
	}
	

}
