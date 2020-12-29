package application.models;

import javax.persistence.*;

@Entity
@Table(name="user-member")
public class UserMember extends PersonData {
		
	public String password;	
    public float weight;
    public float height;    
    @ManyToOne
    @JoinColumn(name = "type-mebership")
    public Membership typeMembership;    
    @ManyToOne
    @JoinColumn(name = "type-payment")
    public TypePayment typePayment;    
    public String notes;
    @OneToOne
    @JoinColumn(name = "person-check-state")
	private PersonCheck attendance;
    
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
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
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
   

}
