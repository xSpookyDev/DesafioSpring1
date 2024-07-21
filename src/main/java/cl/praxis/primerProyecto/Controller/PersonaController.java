package cl.praxis.primerProyecto.Controller;

import cl.praxis.primerProyecto.model.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @GetMapping("/")
    public Persona getUsuario() {
        return new Persona("Montecinos", "Ricardo", 24);
    }
}
