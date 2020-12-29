package application.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="instructor-data")
public class Instructor extends PersonData {	

	public String password;	
    private double salary ;
	@Column(name="shift-hours")
    private int shiftHours;
	@OneToOne
    @JoinColumn(name = "person-check-state")	
	private Schedule schedule;
	@OneToOne
    @JoinColumn(name = "person-check-state")
	private PersonCheck attendance;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getShiftHours() {
		return shiftHours;
	}
	public void setShiftHours(int shiftHours) {
		this.shiftHours = shiftHours;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public PersonCheck getAttendance() {
		return attendance;
	}
	public void setAttendance(PersonCheck attendance) {
		this.attendance = attendance;
	}
	
	
	
}
