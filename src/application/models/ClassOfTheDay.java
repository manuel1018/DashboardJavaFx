package application.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="class-of-day")
public class ClassOfTheDay {
	
	private int id;
	private String name;
	@Column(name="begin-hour")
	private LocalDate beginHour;
	@Column(name="begin-hour")
	private LocalDate endHour;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBeginHour() {
		return beginHour;
	}
	public void setBeginHour(LocalDate beginHour) {
		this.beginHour = beginHour;
	}
	public LocalDate getEndHour() {
		return endHour;
	}
	public void setEndHour(LocalDate endHour) {
		this.endHour = endHour;
	}

}
