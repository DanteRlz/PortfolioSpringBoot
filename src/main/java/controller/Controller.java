package controller;

import java.util.ArrayList;
import java.util.List;
import model.About;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import services.AboutService;
import services.IAboutService;

@CrossOrigin(origins = "https://portfolio-web-b6177.web.app",maxAge = 3600)
@RestController
@RequestMapping ({"/verhistory"})
public class Controller {
    
    private IAboutService aboutServ;
    
    @GetMapping ("/verhistory") 
    @ResponseBody
    public List<About> verAbout() {
       return aboutServ.verAbout();
    }
    
    @PostMapping ("/new/about")
    public void crearAbout (@RequestBody About about) {
       aboutServ.crearAbout(about);
    }
   
    @DeleteMapping ("/delete/{id}")
    public void borrarAbout (@PathVariable Long id) {
        aboutServ.borrarAbout(id);
    }
}

