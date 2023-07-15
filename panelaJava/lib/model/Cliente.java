public class Cliente extends Pessoa {
    // Variáveis

    private int idCliente;
    private String nivelCliente;

    // Métodos

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNivelCliente() {
        return nivelCliente;
    }

    public void setNivelCliente(String nivelCliente) {
        this.nivelCliente = nivelCliente;
    }

    @Override
    public String toString() {
        return "Cliente [idCliente=" + idCliente + ", nivelCliente=" + nivelCliente + "]";
    }
}
