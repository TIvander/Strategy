import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentificadorTest {

    @Test
    void deveRetornarIdBiometricoVerdade() {
        Funcionario funcionario = new Funcionario();
        funcionario.AcessoIdBiometrico(true);
        assertEquals("Acesso permitido", funcionario.tipoDeAcesso);

    }

    @Test
    void deveRetornarIdFacialVerdade() {
        Funcionario funcionario = new Funcionario();
        funcionario.AcessoIdFacial(true);
        assertEquals("Acesso permitido", funcionario.tipoDeAcesso);

    }

    @Test
    void deveRetornarIdCartaoAcessoVerdade() {
        Funcionario funcionario = new Funcionario();
        funcionario.AcessoIdCartaoAcesso(true);
        assertEquals("Acesso permitido", funcionario.tipoDeAcesso);

    }
}