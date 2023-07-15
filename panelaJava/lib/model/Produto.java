public class Produto {
    // Variávies

    private int idProduto;
    private String nomeProduto;
    private int estoque;
    private double valor;

    // Métodos
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", estoque=" + estoque + ", valor="
                + valor + "]";
    }
}
