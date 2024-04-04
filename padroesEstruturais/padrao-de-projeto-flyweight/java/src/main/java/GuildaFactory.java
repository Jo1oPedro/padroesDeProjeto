import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuildaFactory {
    private static Map<String, Guilda> guildas = new HashMap<>();

    private GuildaFactory() {};

    public static Guilda ingressarGuilda(String nome) {
        Guilda guilda = guildas.get(nome);
        if(guilda == null) {
            guilda = new Guilda(nome);
            guildas.put(nome, guilda);
        }
        return guilda;
    }

    public static List<String> ObterGuildas() {
        List<String> dados = new ArrayList<String>();
        for(String nome : guildas.keySet()) {
            dados.add(nome);
        }

        return dados;
    }

    public static int getTotalGuildas() {
        return guildas.size();
    }
}
