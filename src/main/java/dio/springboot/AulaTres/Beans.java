package dio.springboot.AulaTres;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope("prototype") //faz o objeto ser criado toda vez que é chamado
    public Remetente remetente(){
        System.out.println("CRIANDO UM REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setNome("Digital Inoovation One");
        remetente.setEmail("noreplay@dio.com.br");
        return remetente;
    }

}
