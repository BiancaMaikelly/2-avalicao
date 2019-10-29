public class Filme{
 
    String id;
    String nome;
    String datadelancamento;
    String sinopse;
    double valorparalocacao;
    String estoque;
    List<filmes> filmes = ArrayList();

    Filme(String id, String nome, String datadelancamento, String sinopse,String valorparalocacao,String estoque){

        this.id = id;
        this.nome = nome;
        this.datadelancamento= datadelancamento;
        this.sinopse = sinopse;
        this.valorparalocacao = valorparalocacao;
        this.estoque = estoque;
        this.filmes.add(this);

     
    }







}