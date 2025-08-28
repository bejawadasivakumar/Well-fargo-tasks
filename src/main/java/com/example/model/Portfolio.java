package com.example.model;

import java.time.LocalDate;
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
@Table(name = "portfolio")
public class Portfolio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long portfolioId;
	
	@ManyToOne
	@JoinColumn(name = "clientId", nullable = false)
	private long clientId;
	
	@Column(nullable = false)
	private LocalDate creationDate;
	
	@OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Security> securities;
	

	public Portfolio() {
		
	}

	public Portfolio(long portfolioId, LocalDate creationDate, List<Security> securities) {
		
		this.portfolioId = portfolioId;
		this.creationDate = creationDate;
		this.securities = securities;
	}

	public long getPortfolioId() {
		return portfolioId;
	}
	
	
	public long getClientId() {
		return clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public List<Security> getSecurities() {
		return securities;
	}

	public void setSecurities(List<Security> securities) {
		this.securities = securities;
	}
	
	
}
