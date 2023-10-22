package me.dio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_account")
public class Account {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
    private String number;
	
    private String agency;
    
    @Column(precision = 2, scale = 13) 
    //precisão de 2 algaritmos de depois da virgula. escala de 13 algaritmos no total
    private BigDecimal balance;
    
    @Column(name = "addictional_Limit",precision = 2, scale = 13) 
    private BigDecimal limit;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    
    public String getNumber() {return number;}
    public void setNumber(String number) {this.number = number;}
    
    public String getAgency() {return agency;}
    public void setAgency(String agency) {this.agency = agency;}
    
    public BigDecimal getBalance() {return balance;}
    public void setBalance(BigDecimal balance) {this.balance = balance;}
    
    public BigDecimal getLimit() {return limit;}
    public void setLimit(BigDecimal limit) {this.limit = limit;}
}