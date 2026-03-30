package Login;

public class SistemaLogin {


    public boolean autenticar(String utilizador, String senha) {
        // Proteção: se algum campo for nulo, retorna falso
        if (utilizador == null || senha == null) {
            return false;
        }

        // Verifica se as credenciais correspondem aos valores esperados
        return utilizador.equals("admin") && senha.equals("1234");
    }
}

