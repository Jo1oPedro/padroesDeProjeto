package proxy;

public interface IEmail {
    public String enviaEmail(String dadosSender, String dadosRecipient, String subject, String body);
}
