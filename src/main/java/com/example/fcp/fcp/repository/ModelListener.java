/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.fcp.fcp.repository;

import java.util.Date;
import javax.persistence.PrePersist;

/**
 *
 * @author AngeloGarcia
 */
public class ModelListener {
    @PrePersist
    public void setDatesAndUser(ModelBase modelBase) {
    // set dateCreated and dateUpdated fields
         Date now = new Date();
         if (modelBase.getDateCreated() == null) {
             modelBase.setDateCreated(now);
         }
         modelBase.setDateUpdated(now);
    }
}
