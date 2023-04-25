
package com.portfolio.ArgProg.repository;

import com.portfolio.ArgProg.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface REducacion extends JpaRepository <Educacion, Integer>{
    
     public void deleteById(Long id);

    public Object findById(Long id);
}
