package com.abc.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class CustomerEntity {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	@Column(name = "name")

	private String name;

	@Column(name = "email")

	private String email;

	@Column(name = "phone")

	private String phone;

	@Column(name = "gender")

	private String gender;

	@Column(name = "last_four_ssn")

	private String lastFourSsn;

	@Column(name = "dateOfBirth")

	private Date date;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)

	@JoinColumn(name = "customer_id")

	private List<AddressEntity> addresses;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastFourSsn() {
		return lastFourSsn;
	}

	public void setLastFourSsn(String lastFourSsn) {
		this.lastFourSsn = lastFourSsn;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<AddressEntity> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressEntity> addresses) {
		this.addresses = addresses;
	}

}
