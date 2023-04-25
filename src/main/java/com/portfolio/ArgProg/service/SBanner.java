
package com.portfolio.ArgProg.service;

import com.portfolio.ArgProg.entity.Banner;
import com.portfolio.ArgProg.repository.RBanner;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SBanner {
    @Autowired
    public RBanner banRepo;
    

    public List<Banner> verBanners() {
       List<Banner> listaBanners = banRepo.findAll();
       return listaBanners;
    }
    
     public Banner buscarBanner(int id) {
        Banner ban = banRepo.findById(id).orElse(null);
         return ban;
    }
    
    public void crearBanner(Banner ban){
        banRepo.save(ban);
    }
    
    public void borrarBanner(int id) {
        banRepo.deleteById(id);
}
    public void editarBanner(Banner ban){
        banRepo.save(ban);
    }
}

