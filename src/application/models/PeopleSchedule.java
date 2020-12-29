package application.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="people-schedule")
public class PeopleSchedule {
	
	private int id;
	@Column(name = "start-hour")
	private LocalDate startHour;
	@Column(name = "end-name")
	private LocalDate endHour;
	@Column(name = "number-people-allowed")
	private int numberOfPersonsAllowed;
	@ManyToOne(cascade=CascadeType.PERSIST)    
	@JoinColumn(name = "list-users")
	private List<PersonData> listUsers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getStartHour() {
		return startHour;
	}
	public void setStartHour(LocalDate startHour) {
		this.startHour = startHour;
	}
	public LocalDate getEndHour() {
		return endHour;
	}
	public void setEndHour(LocalDate endHour) {
		this.endHour = endHour;
	}
	public int getNumberOfPersonsAllowed() {
		return numberOfPersonsAllowed;
	}
	public void setNumberOfPersonsAllowed(int numberOfPersonsAllowed) {
		this.numberOfPersonsAllowed = numberOfPersonsAllowed;
	}
	public List<PersonData> getListUsers() {
		return listUsers;
	}
	public void setListUsers(List<PersonData> listUsers) {
		this.listUsers = listUsers;
	}
	
	
}
