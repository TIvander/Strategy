public class IdFacial implements Usuario{
    public boolean id;

    public IdFacial(boolean id){

    }
    @Override
    public boolean validar(boolean id) {
        if(id){
            this.id=true;
            return true;
        } else {
            this.id=false;
            return false;
        }

    }
}
