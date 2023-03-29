package dio.springboot.AulaCinco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {
    @Autowired
    private Remetente remetente;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " +remetente.getNome() + "\nE-mail: "+ remetente.getEmail() + "\nCom telefone: " + remetente.getTelefone() );
        System.out.println("Seu cadastro foi aprovado");
    }
}
