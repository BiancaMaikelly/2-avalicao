public class Filmeslocados{

Locacao locacao;
Filme filme;

Filmeslocados(Locacao locacao, Filme filme){
    this.locacao = locacao;
    this.filme = filme;

    this.locacao.filmesLocados.add(this);



}




}