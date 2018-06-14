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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author AngeloGarcia
 */
@Entity
@Table(name = "Category")
@AttributeOverrides({
    @AttributeOverride(name="created_at", column = @Column(name = "CATEGORY_CREATED_AT")),
    @AttributeOverride(name = "updated_at", column = @Column(name = "CATEGORY_UPDATED_AT") )
})
public class Category extends ModelBase implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CATEGORY_ID")
    private Long id;
    
    @NotBlank
    @Column(name="CATEGORY_DESCRIPTION")
    private String description;
    
    @NotBlank
    @Column(name="CATEGORY_INTEREST")
    private double interest;
    
    @NotBlank
    @Column(name="CATEGORY_MIN_TERMS")
    private Integer min_terms;
    
    @NotBlank
    @Column(name="CATEGORY_MAX_TERMS")
    private Integer max_terms;
    
    @NotBlank
    @Column(name="CATEGORY_MIN_AMOUNT")
    private Integer min_amount;
    
    @NotBlank
    @Column(name="CATEGORY_MAX_AMOUNT")
    private Integer max_amount;
    
}
