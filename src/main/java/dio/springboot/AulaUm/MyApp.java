package dio.springboot.AulaUm;

import dio.springboot.AulaUm.Calculadora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired //componete myapp, precisa do autowired para conseguir pegar o componente calculadora
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Resultado: " + calculadora.somar(1,2));
    }
}
