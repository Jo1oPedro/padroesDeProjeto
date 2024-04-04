import org.junit.jupiter.api.Test;
import singleton.Aluno;
import singleton.Email;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class EmailTest {
    @Test
    void deveRetornarUmaInstanciaDeEmail() {
        Email email = Email.getInstance();
        if(email == null) {
            fail();
        }
    }

    @Test
    void deveRetornarOMesmoObjetoEmailSempre() {
        Email email1 = Email.getInstance();
        Email email2 = Email.getInstance();
        if(email1 != email2) {
            fail();
        }
    }

    @Test
    void deveLancarUmEmailComSucesso() {
        Email email = Email.getInstance();
        assertEquals(
                "...realiza a lógica de enviar os dados a partir de alguma biblioteca de envio de email",
                email.send(
                        "matricula",
                        "matricula aprovada",
                        (new Aluno()),
                        (new Aluno())
                )
        );
    }
}
