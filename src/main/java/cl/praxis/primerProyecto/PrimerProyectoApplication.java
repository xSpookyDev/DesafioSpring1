package cl.praxis.primerProyecto;

import cl.praxis.primerProyecto.model.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimerProyectoApplication {

	public static void main(String[] args) {
		Persona u = new Persona("Montecinos", "Ricardo", 24);
		System.out.println(u.toString());
		SpringApplication.run(PrimerProyectoApplication.class, args);
	}
}
