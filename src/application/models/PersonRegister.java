package application.models;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person-register")
public class PersonRegister {/////It's call twice, once it is created and everymt the uset update the memebership
	@Column(name = "date-register")
    public LocalDate dateRegister;
	@Column(name = "hour-register")
	public LocalTime hourRegister;

    @OneToOne
    @JoinColumn(name = "type-mebership")
    public Membership typeMembership;
    
    @OneToOne
    @JoinColumn(name = "type-payment")
    public TypePayment typePayment;

	public LocalDate getDateRegister() {
		return dateRegister;
	}

	public void setDateRegister(LocalDate dateRegister) {
		this.dateRegister = dateRegister;
	}

	public LocalTime getHourRegister() {
		return hourRegister;
	}

	public void setHourRegister(LocalTime hourRegister) {
		this.hourRegister = hourRegister;
	}

	public Membership getTypeMembership() {
		return typeMembership;
	}

	public void setTypeMembership(Membership typeMembership) {
		this.typeMembership = typeMembership;
	}

	public TypePayment getTypePayment() {
		return typePayment;
	}

	public void setTypePayment(TypePayment typePayment) {
		this.typePayment = typePayment;
	}
 
    
    
}
