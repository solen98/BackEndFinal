
package com.portfolio.ArgProg.repository;

import com.portfolio.ArgProg.entity.Login;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;



public interface RLogin extends JpaRepository <Login, Integer> {
    public List<Login> findByEmailAndClave(String email, String clave);
}

