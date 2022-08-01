package services;

import java.util.List;
import model.About;

public interface IAboutService {
    
    public List<About> verAbout ();
    
    public void crearAbout (About about);
    
    public void borrarAbout (Long id);
    
    public About buscarAbout (Long id);
    
}
