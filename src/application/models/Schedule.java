package application.models;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="schedule")
public class Schedule {
	private int id;
	@Column(name="hour-start")
	private LocalTime hourStart;
	@Column(name="hour-end")
	private LocalTime hourEnd;
	@Column(name="start-start")
	private LocalDate startDate;
	@Column(name="state")
	private boolean isActive;
	@OneToMany(mappedBy = "trainer-data")
	private PersonSchedule personId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalTime getHourStart() {
		return hourStart;
	}
	public void setHourStart(LocalTime hourStart) {
		this.hourStart = hourStart;
	}
	public LocalTime getHourEnd() {
		return hourEnd;
	}
	public void setHourEnd(LocalTime hourEnd) {
		this.hourEnd = hourEnd;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
		
}
