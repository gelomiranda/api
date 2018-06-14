/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.fcp.fcp.repository;
import java.util.Date;
import javax.persistence.*;
/**
 *
 * @author AngeloGarcia
 */
@MappedSuperclass
@EntityListeners({ModelListener.class})
public abstract class ModelBase {
    
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)     
    private Date dateCreated;
    
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date dateUpdated;

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
    
    
}
