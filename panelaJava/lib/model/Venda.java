import java.util.List;

import javax.xml.crypto.Data;

public class Venda {
    // Variáveis

    private int idVenda;
    private List<Cliente> cliente;
    private List<Produto> produto;
    private float valorTotal;
    private int quantidade;
    private Data dataVenda;

    // Métodos
    
    public int getIdVenda() {
        return idVenda;
    }
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }
    public List<Cliente> getCliente() {
        return cliente;
    }
    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }
    public List<Produto> getProduto() {
        return produto;
    }
    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
    public float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Data getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(Data dataVenda) {
        this.dataVenda = dataVenda;
    }
    @Override
    public String toString() {
        return "Venda [idVenda=" + idVenda + ", cliente=" + cliente + ", produto=" + produto + ", valorTotal="
                + valorTotal + ", quantidade=" + quantidade + ", dataVenda=" + dataVenda + "]";
    }
    
}
