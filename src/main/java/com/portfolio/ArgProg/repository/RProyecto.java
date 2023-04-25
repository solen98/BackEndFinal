
package com.portfolio.ArgProg.repository;

import com.portfolio.ArgProg.entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository <Proyectos, Integer> {
     
}
