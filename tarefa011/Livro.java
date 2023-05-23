public class Livro extends Produto{
    private String autor;

    public Livro(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    @Override
    public String getDescricao(){
        return "Livro - Autor: " + this.autor;
    }
}
