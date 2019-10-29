public class Locacao{
    String id;
    Cliente cliente;
    String datadelocacao;
    String datadedevolucao;
    List<filmesLocados> filmesLocados = ArrayList();

    Locacao(String id, Cliente cliente, String datadelocacao, String datadevolucao) {
        this.id = id;
        this.cliente = cliente;
        this.datadedevolucao = datadelocacao;
        this.datadelocacao = datadelocacao;

        this.cliente.locacoes.add(this);
    }

}