
package com.portfolio.ArgProg.repository;

import com.portfolio.ArgProg.entity.Hardskill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHardskill extends JpaRepository <Hardskill, Integer> {
   
}
