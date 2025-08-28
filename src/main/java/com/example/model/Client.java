package com.example.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long clientId;
	
	@Column(nullable = false)
	private long advisorId;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false)
	private String phone;
	
	@Column(nullable = false)
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "advisorId", nullable = false)
	private Advisor advisor;
	
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Portfolio> portfolios;

	
	public Client() {
	}

	public Client(long advisorId, String firstName, String lastName, String address, String phone, String email,
			Advisor advisor, List<Portfolio> portfolios) {
		
		this.advisorId = advisorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.advisor = advisor;
		this.portfolios = portfolios;
	}

	public long getClientId() {
		return clientId;
	}

	public long getAdvisorId() {
		return advisorId;
	}

	public void setAdvisorId(long advisorId) {
		this.advisorId = advisorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Advisor getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Advisor advisor) {
		this.advisor = advisor;
	}

	public List<Portfolio> getPortfolios() {
		return portfolios;
	}

	public void setPortfolios(List<Portfolio> portfolios) {
		this.portfolios = portfolios;
	}
	
	
	
}
