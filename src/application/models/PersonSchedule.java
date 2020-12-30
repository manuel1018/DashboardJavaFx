package application.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="people-schedule")
public class PersonSchedule {
	
	private int id;	
	@ManyToOne
	@JoinColumn(name ="id_schedule",referencedColumnName ="id")
	private Schedule idSchedule;
	
	@OneToOne(mappedBy ="id_person")
	private PersonData idPerson;
	
	
	public Schedule getIdSchedule() {
		return idSchedule;
	}
	public void setIdSchedule(Schedule idSchedule) {
		this.idSchedule = idSchedule;
	}
	public PersonData getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(PersonData idPerson) {
		this.idPerson = idPerson;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
