package services;

import model.About;
import repository.AboutRepository;



public class AboutService implements IAboutService {

    public AboutRepository aboutRepo;
    
    @Override
    public void verHistory(About history) {
        aboutRepo.findAll();                
    }

    @Override
    public void crearHistory(About history) {
        aboutRepo.saveAndFlush(history);
    }

    @Override
    public void borrarHistory(About history) {
        aboutRepo.delete(history);
    }

    @Override
    public void buscarHistory(About history) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
