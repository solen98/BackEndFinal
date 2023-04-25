
package com.portfolio.ArgProg.repository;

import com.portfolio.ArgProg.entity.Redes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RRedes extends JpaRepository <Redes, Integer> {
    
}
