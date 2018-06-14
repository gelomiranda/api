/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.fcp.fcp.model;

import com.example.fcp.fcp.repository.ModelBase;
import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author AngeloGarcia
 */
@Entity
@Table(name = "Transaction")
@AttributeOverrides({
    @AttributeOverride(name="created_at", column = @Column(name = "LOAN_CREATED_AT")),
    @AttributeOverride(name = "updated_at", column = @Column(name = "LOAN_UPDATED_AT") )
})
public class Transaction extends ModelBase implements Serializable{ 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="TRANSACTION_ID")
  private Long id;  
  
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "USER_ID")
  private User user;
  
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "LOAN_ID")
  private Loan loan;
  
  @NotBlank
  @Column(name="TRANSACTION_AMOUNT")
  private Integer amount;
  
  
  
  
  
  
}
