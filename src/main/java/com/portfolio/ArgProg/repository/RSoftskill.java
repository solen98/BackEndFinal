
package com.portfolio.ArgProg.repository;

import com.portfolio.ArgProg.entity.Softskill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSoftskill extends JpaRepository <Softskill, Integer> {
     public void deleteById(Long id);

    public Object findById(Long id);
}
