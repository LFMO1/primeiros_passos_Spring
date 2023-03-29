package dio.springboot.AulaTres;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableMBeanExport;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {

		SpringApplication.run(PrimeirosPassosApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(SistemaMensagem sistema) throws Exception{
		return  args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
		};
	}

}
