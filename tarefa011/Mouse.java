public class Mouse extends Produto{
    private String tipo;

    public Mouse(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String getDescricao(){
        return "Mouse - Tipo: " + this.tipo;
    }
}
