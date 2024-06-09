
package MiPrimerEje.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorRest {
      
    @GetMapping("/")
    public String comiezo(){
    
    log.info("Estoy ejecutando el controlador de Rest");
    log.debug("Mas informacion");
    return "Hola mundo .wala";
    }
    
    
    
}
