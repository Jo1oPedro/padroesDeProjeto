package singleton;

public class Email {

    private static Email email = null;
    private Email() {}

    public static Email getInstance() {
        if(email == null) {
            email = new Email();
        }
        return email;
    }

    public String send(String subject, String body, Aluno aluno_recipient, Aluno aluno_sender) {
        return "...realiza a lógica de enviar os dados a partir de alguma biblioteca de envio de email";
    }

}
