package jp.co.employeemybatis.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Employee {

	private Integer id;
	
	@NotEmpty(message="省略することはできません")
	private String name;
	
	@NotEmpty(message="省略することはできません")
	@Email(message="Emailの形式ではありません")
	private String email;
	
	@NotEmpty(message="省略することはできません")
	private String gender;
	
	@NotEmpty(message="省略することはできません")
	private String hobbies;
	
	@NotEmpty(message="省略することはできません")
	private String country;
	
	@NotEmpty(message="省略することはできません")
	private String address;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", hobbies="
				+ hobbies + ", country=" + country + ", address=" + address + "]";
	}
	
}
