package application.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="class-intructor")
public class ClassTrainer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="id_instructor",referencedColumnName ="id")
	private Trainer idInstructor; 
	@OneToOne
	@JoinColumn(name="id_instructor",referencedColumnName ="id")
	private ClassForTraining idClass;	
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
	public Trainer getIdInstructor() {
		return idInstructor;
	}
	public void setIdInstructor(Trainer idInstructor) {
		this.idInstructor = idInstructor;
	}
	public ClassForTraining getIdClass() {
		return idClass;
	}
	public void setIdClass(ClassForTraining idClass) {
		this.idClass = idClass;
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
