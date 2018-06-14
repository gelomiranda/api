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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author AngeloGarcia
 */
@Entity
@Table(name = "Document")
@AttributeOverrides({
    @AttributeOverride(name="created_at", column = @Column(name = "DOCUMENT_CREATED_AT")),
    @AttributeOverride(name = "updated_at", column = @Column(name = "DOCUMENT_UPDATED_AT") )
})
public class Document extends ModelBase implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="DOCUMENT_ID")
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;
    
    @NotBlank
    @Column(name="DOCUMENT_DESCRIPTION")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }
    
    @NotBlank
    @Column(name="DOCUMENT_TYPE", columnDefinition = "TINYINT(1)")
    private boolean type;
    
}
