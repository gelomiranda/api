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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author AngeloGarcia
 */
@Entity
@Table(name = "Profile")

@AttributeOverrides({
    @AttributeOverride(name="created_at", column = @Column(name = "PROFILE_CREATED_AT")),
    @AttributeOverride(name = "updated_at", column = @Column(name = "PROFILE_UPDATED_AT") )
})
public class Profile extends ModelBase implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PROFILE_ID")
    private Long id;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    
    @NotBlank
    @Column(name="PROFILE_FULLNAME")
    private String fullname;
    
    @NotBlank
    @Column(name="PROFILE_BIRTHDATE")
    private String birthdate;
    
    @NotBlank
    @Column(name="PROFILE_ADDRESS")
    private String address;
    
    @NotBlank
    @Column(name="PROFILE_EMAIL_ADDRESS")
    private String email_address;
    
    @NotBlank
    @Column(name="PROFILE_MOBILE_NO")
    private String mobile_number;
    
    @NotBlank
    @Column(name="PROFILE_JOB_TITLE")
    private String job_title;
    
    @NotBlank
    @Column(name="PROFILE_CURRENT_EMPLOYER")
    private String current_employer;
    
    @NotBlank
    @Column(name="PROFILE_NO_OF_YEARS")
    private Integer no_of_years;
    
    @NotBlank
    @Column(name="PROFILE_MONTHLY_INCOME")
    private Integer monthly_income;

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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getCurrent_employer() {
        return current_employer;
    }

    public void setCurrent_employer(String current_employer) {
        this.current_employer = current_employer;
    }

    public Integer getNo_of_years() {
        return no_of_years;
    }

    public void setNo_of_years(Integer no_of_years) {
        this.no_of_years = no_of_years;
    }

    public Integer getMonthly_income() {
        return monthly_income;
    }

    public void setMonthly_income(Integer monthly_income) {
        this.monthly_income = monthly_income;
    }
    
    
}
