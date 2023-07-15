public class Administrador extends Pessoa {
    // Variáveis

    private int idAdministrador;

    // Métodos
    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    @Override
    public String toString() {
        return "Administrador [idAdministrador=" + idAdministrador + "]";
    }
}
