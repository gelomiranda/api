/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.fcp.fcp.repository;

import com.example.fcp.fcp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author AngeloGarcia
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{
    
}
