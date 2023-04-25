
package com.portfolio.ArgProg.repository;

import com.portfolio.ArgProg.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository <Experiencia, Integer> {
     public void deleteById(Long id);

    public Object findById(Long id);
}
