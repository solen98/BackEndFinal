
package com.portfolio.ArgProg.repository;

import com.portfolio.ArgProg.entity.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RBanner extends JpaRepository <Banner, Integer>{

}
    
