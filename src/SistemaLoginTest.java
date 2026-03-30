package Login;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SistemaLoginTest {
            // Baby step
        @Test
        public void deveAutenticarUtilizadorValido() {
            Login.SistemaLogin login = new Login.SistemaLogin();

            // Teste 1: Utilizador e palavra-passe corretos
            boolean resultado = login.autenticar("admin", "1234");
            assertTrue(resultado);
        }

        @Test
        public void deveRejeitarUtilizadorInvalido() {
            Login.SistemaLogin login = new Login.SistemaLogin();

            // Teste 2: Utilizador ou password errados
            boolean resultado = login.autenticar("user", "0000");
            assertFalse(resultado);
        }
    }

