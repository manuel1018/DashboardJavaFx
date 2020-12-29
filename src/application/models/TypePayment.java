package application.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="type-mebership")
public class TypePayment {
	private int id;
	private String name;
	@Column(name="valid")
	private boolean isValid;
	@Column(name="coin-type")
	private String typeCoin;
	
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
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	public String getTypeCoin() {
		return typeCoin;
	}
	public void setTypeCoin(String typeCoin) {
		this.typeCoin = typeCoin;
	} 
	
	
}
