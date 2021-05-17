package com.slokam.healthcare.entity; 
 import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne; 
@Entity 
public class Visiting implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private Date  dateAndTime;
@OneToOne 
@JoinColumn(name="fkid19") 
  private Appointment  appointment;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public Date getDateAndTime() {
		return dateAndTime;
	}
public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
public Appointment getAppointment() {
		return appointment;
	}
public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
}