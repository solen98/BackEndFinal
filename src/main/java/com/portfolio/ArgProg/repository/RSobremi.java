

package com.portfolio.ArgProg.repository;

import com.portfolio.ArgProg.entity.Sobremi;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSobremi extends JpaRepository <Sobremi, Integer> {
  public List<Sobremi> findByCorreoAndContrasena(String correo, String contrasena);  
}
