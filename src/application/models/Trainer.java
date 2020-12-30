package application.models;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="trainer-data")
public class Trainer{	
	private String name;
	@Column(name="last-name")
	private String lastName;
	private String password;	
    private double salary ;
	@Column(name="shift-hours")
    private int shiftHours;
	
	@ElementCollection
	@CollectionTable(
		name="classes",
		joinColumns = @JoinColumn(name="students"))
	@Column(name="file_name")
	private Set<String>classes=new HashSet<String>();	
	
	public Trainer(String name, String lastName, String password, double salary, int shiftHours) {		
		this.name = name;
		this.lastName = lastName;
		this.password = password;
		this.salary = salary;
		this.shiftHours = shiftHours;		
	}
	
	public Set<String> getClasses(){
		return classes;
	}
	
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
	
}
