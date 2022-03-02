package com.training.api.centermodel;

import java.time.LocalTime;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = {"contactEmail"}) } )
public class TrainingCenter {
	
	@NotBlank(message="Center Name can't be empty")
	@Size(max=40, message="Center Name should be Under  40 characters.")
	String centerName ;
	
	@NotBlank(message="Center Code can't be empty")
	@Size(max=12,min=12, message="Center Code should be 12 characters long.")
	String centerCode ;
	
	@NotNull(message="Address can't be empty")
	AddressObj address;
	
	int studentCapacity ;
	
	@ElementCollection
	List<String> coursesOffered;
 	
	LocalTime createdOn ;
 	
	@Id
	@Email(message="Invalid Email")
 	String contactEmail ;
	
	@Size(min = 12, max = 12, message = "12 Digit number required")
	@Pattern(regexp="(^$|[0-9]{12})" ,message="Invalid Number")
 	String contactPhone ;
	public String getCenterName() {
		return centerName;
	}	
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getCenterCode() {
		return centerCode;
	}
	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}
	public AddressObj getAddress() {
		return address;
	}
	public void setAddress(AddressObj address) {
		this.address = address;
	}
	public int getStudentCapacity() {
		return studentCapacity;
	}
	public void setStudentCapacity(int studentCapacity) {
		this.studentCapacity = studentCapacity;
	}
	public String getCreatedOn() {
		return createdOn.toString();
	}
	public void setCreatedOn(LocalTime createdOn) {
		this.createdOn = createdOn;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public List<String> getCoursesOffered() {
		return coursesOffered;
	}
	public void setCoursesOffered(List<String> coursesOffered) {
		this.coursesOffered = coursesOffered;
	}
}
