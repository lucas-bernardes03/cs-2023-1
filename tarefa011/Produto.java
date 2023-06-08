public class Produto{
    private String nomeLoja;
    private Double preco;

    public String getNomeLoja(){
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja){
        this.nomeLoja = nomeLoja;
    }

    public Double getPreco(){
        return preco;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public String getDescricao(){
        return "Produto de Informática";
    }

}