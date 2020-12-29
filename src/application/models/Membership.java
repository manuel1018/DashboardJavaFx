package application.models;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="type-mebership")
class Membership{
	 private int id;    	
	 @Column(name = "date-begin-inscription")
	 private LocalDate beginDate;	 
	 @Column(name = "date-end-inscription")
	 private LocalDate endDate;
	 @Column(name = "hour-begin-inscription")
	 private LocalTime beginHour;
	 @Column(name = "hour-begin-inscription")
	 private LocalTime endHour;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public LocalTime getBeginHour() {
		return beginHour;
	}
	public void setBeginHour(LocalTime beginHour) {
		this.beginHour = beginHour;
	}
	public LocalTime getEndHour() {
		return endHour;
	}
	public void setEndHour(LocalTime endHour) {
		this.endHour = endHour;
	}	 
	 
}
