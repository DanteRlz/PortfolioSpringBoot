package services;

import java.util.List;
import java.util.Optional;
import model.About;
import org.springframework.stereotype.Service;
import repository.AboutRepository;


@Service
public class AboutService implements IAboutService {
    
    public AboutRepository aboutRepo;

    @Override
    public List<About> verAbout() {
       return aboutRepo.findAll();
    }

    @Override
    public void crearAbout(About about) {
         aboutRepo.save(about);
    }

    @Override
    public void borrarAbout(Long id) {
        aboutRepo.deleteById(id);
    }

    @Override
    public About buscarAbout(Long id) {
       return aboutRepo.findById(id).orElse(null);
    }
}