/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.fcp.fcp.model;
import com.example.fcp.fcp.repository.ModelBase;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.io.Serializable;
/**
 *
 * @author AngeloGarcia
 */
@Entity
@Table(name = "User")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)

@AttributeOverrides({
    @AttributeOverride(name="created_at", column = @Column(name = "USER_CREATED_AT")),
    @AttributeOverride(name = "updated_at", column = @Column(name = "USER_UPDATED_AT") )
})
public class User extends ModelBase implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="USER_ID")
    private Long id;
    
    @NotBlank
    @Column(name="USER_PASSWORD")
    private String password;

    @NotBlank
    @Column(name="USER_TYPE")
    private String user_type;
    
    @Column(name="USER_LINK_VALIDATED")
    private boolean link_validated = false;
    
    @Column(name="USER_LINK_EXPIRATION", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date link_expiration;
    
    @Column(name="USER_IS_BLOCKED")
    private boolean is_blocked;
    
    @Column(name="USER_IS_VALIDATED")
    private boolean is_validated;
    
    
    @Column(name="USER_IS_VALIDATED_BY")
    private Long is_validated_by;
    
    @Column(name="USER_IS_VALIDATED_AT")
    private Date is_validated_at;
    

}
