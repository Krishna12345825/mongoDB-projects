package com.nt.document;

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
public class Medal {
	public Medal() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Medal(String mid, String mname, String event, String place) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.event = event;
		this.place = place;
	}


	@Id
	private  String mid;
	private  String mname;
	private  String event;
	private  String place;
	
	
	@Override
	public String toString() {
		return "Medal [mid=" + mid + ", mname=" + mname + ", event=" + event + ", place=" + place + "]";
	}

}
