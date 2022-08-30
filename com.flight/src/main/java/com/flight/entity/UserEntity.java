package com.flight.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
//	@NotBlank(message = "Name cannot be blank#######")
	private String userName;
	
	private String userEmail;
	
	private String gender;
	//@Min(value = 1, message = "age cannot be less than 1")
	private int age;
	@Override
	public String toString() {
		return "userEntity [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", gender="
				+ gender + ", age=" + age + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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
	
	
}





//
//Name and Email ID
//Number of seats to book.
//Details of each passenger (NAME, GENDER, AGE) 
