package dio.springboot.AulaQuatro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {
    @Value("${nome}") //só funciona se no application.properties estiver com esse "nome"
    private String nome = "luis";
    @Value("${emails: felipe@email.com}") //assim ele procura-ra esse properties e se não achar tem esse email defautl
    private String email = "luis@email.com";
    @Value("${telefone}")
    private List<Long> telefone = new ArrayList<>(Arrays.asList(new Long[]{1165156161L}));

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " +nome + "\nE-mail: "+ email + "\nCom telefone: " + telefone );
        System.out.println("Seu cadastro foi aprovado");
    }
}
