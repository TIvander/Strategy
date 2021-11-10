public class Identificador{
    public boolean liberar;

    public Identificador(boolean liberar){
        this.liberar = liberar;
    }
    public String validar(Usuario usuario){
        if (usuario.validar(true)){
            this.liberar = true;
            return "Acesso permitido";
        }else{
            this.liberar = false;
            return "Acesso negado";
        }

    }

}
