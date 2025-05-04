package dio.scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente noreplay;
    @Autowired
    private Remetente techTeam;

    public void enviarConfirmacaoCadastro(){
        System.out.println(noreplay);
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarMensagemBoasVindas(){
        techTeam.setEmail("tech@dio.com.br");
        System.out.println(techTeam);
        System.out.println("Bem-Vindo á Tech Elite");
    }
}
