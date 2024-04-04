package proxy;

public class Email implements IEmail {

    @Override
    public String enviaEmail(String dadosSender, String dadosRecipient, String subject, String body) {
        return "email enviado com sucesso";
    }
}
