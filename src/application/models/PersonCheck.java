package application.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="person-check")
public class PersonCheck {
	@Column(name = "active")
    private boolean isUserActive;
	@Column(name = "present")
    private boolean isUserPresent;
	@Column(name = "check-in")
    private LocalDate checkInHour;
	@Column(name = "departure-hour")
    private LocalDate departureHour;
	
	public boolean isUserActive() {
		return isUserActive;
	}
	public void setUserActive(boolean isUserActive) {
		this.isUserActive = isUserActive;
	}
	public boolean isUserPresent() {
		return isUserPresent;
	}
	public void setUserPresent(boolean isUserPresent) {
		this.isUserPresent = isUserPresent;
	}
	public LocalDate getCheckInHour() {
		return checkInHour;
	}
	public void setCheckInHour(LocalDate checkInHour) {
		this.checkInHour = checkInHour;
	}
	public LocalDate getDepartureHour() {
		return departureHour;
	}
	public void setDepartureHour(LocalDate departureHour) {
		this.departureHour = departureHour;
	}
	
}
