public class Funcionario {
    public String tipoDeAcesso;

    public void AcessoIdBiometrico(boolean acesso){
        Identificador identificador = new Identificador(acesso);
        Usuario usuario = new IdBiometrico(true);
        this.tipoDeAcesso = identificador.validar(usuario);
    }

    public void AcessoIdCartaoAcesso(boolean acesso){
        Identificador identificador = new Identificador(acesso);
        Usuario usuario = new IdCartaoAcesso(true);
        this.tipoDeAcesso = identificador.validar(usuario);
    }

    public void AcessoIdFacial(boolean acesso){
        Identificador identificador = new Identificador(acesso);
        Usuario usuario = new IdFacial(true);
        this.tipoDeAcesso = identificador.validar(usuario);
    }
}
