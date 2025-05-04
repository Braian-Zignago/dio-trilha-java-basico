package dio.properties_value;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SistemaMensagem implements CommandLineRunner {
    @Autowired
    Remetente remetente;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem eviada por: "
                + remetente.getNome() + "\nEmail: "
                + remetente.getEmail() + "\nCom telefones: "
                + remetente.getTelefones());
        System.out.println("Seu cadastro foi aprovado");
    }
}
