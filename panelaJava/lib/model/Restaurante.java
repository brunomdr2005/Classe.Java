import java.util.List;

public class Restaurante {
    // Variáveis

    private int unidade;
    private List<Endereco> endereco;
    private List<Administrador> administrador;

    // Métodos
    public int getUnidade() {
        return unidade;
    }
    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }
    public List<Endereco> getEndereco() {
        return endereco;
    }
    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }
    public List<Administrador> getAdministrador() {
        return administrador;
    }
    public void setAdministrador(List<Administrador> administrador) {
        this.administrador = administrador;
    }
    @Override
    public String toString() {
        return "Restaurante [unidade=" + unidade + ", endereco=" + endereco + ", administrador=" + administrador + "]";
    }
}
