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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author AngeloGarcia
 */
@Entity
@Table(name = "Loan")
@AttributeOverrides({
    @AttributeOverride(name="created_at", column = @Column(name = "LOAN_CREATED_AT")),
    @AttributeOverride(name = "updated_at", column = @Column(name = "LOAN_UPDATED_AT") )
})
public class Loan extends ModelBase implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="LOAN_ID")
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;
    
    @NotBlank
    @Column(name="LOAN_INTEREST")
    private double interest;
    
    @NotBlank
    @Column(name="LOAN_AMOUNT")
    private Integer amount;
    
    @NotBlank
    @Column(name="LOAN_TERMS")
    private Integer terms;
    
    @NotBlank
    @Column(name="LOAN_STATUS",columnDefinition = "TINYINT(1)")
    private Integer status;
    
}
