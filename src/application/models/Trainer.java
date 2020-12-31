package application.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="`trainer-data`")
public class Trainer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)*/
	
	@Id
	@Column(name="`id`")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="`name-trainer`")
	private String name;
	
	@Column(name="`last-name`")   
	private String lastName;
	
	@Column(name="`password-trainer`")
	private String password;
	
	@Column(name = "`salary-trainer`")
    private int salary ;
	
	@Column(name="`shift-hours`")
    private int shiftHours;
	/*
	@ElementCollection
	@CollectionTable(
		name="classes",
		joinColumns = @JoinColumn(name="trainer-data"))
	@Column(name="file_name")
	private Set<String>classes=new HashSet<String>();	
	*/
	public Trainer(String lastName,String name, String password, int salary, int shiftHours) {		
		this.name = name;
		this.lastName = lastName;
		this.password = password;
		this.salary = salary;
		this.shiftHours = shiftHours;		
	}
	/*
	public Set<String> getClasses(){
		return classes;
	}*/
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public String getLastName() {
		return lastName;
	}		
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getShiftHours() {
		return shiftHours;
	}
	public void setShiftHours(int shiftHours) {
		this.shiftHours = shiftHours;
	}	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+name+" "+lastName+"\n/Password: "+password+"\n/Salary"+salary;
	}
}
