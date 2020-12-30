package application.models;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PersonData {////Creation
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private String name;
	@Column(name = "last-name")
	private String lastName ;
	private String gender ;
	private int age ;
	@Column(name = "birth")
	private LocalDate dateOfBirth;
	@Column(name = "telephone-number")
	private int telephoneNumber ;
	@Column(name = "medical-conditions")
	private String medicalConditions;
	private String email;	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "schedule_id", referencedColumnName = "id")
	private PersonSchedule schedule;
	
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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(int telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getMedicalConditions() {
		return medicalConditions;
	}
	public void setMedicalConditions(String medicalConditions) {
		this.medicalConditions = medicalConditions;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
    
}
