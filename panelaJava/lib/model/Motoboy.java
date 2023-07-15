public class Motoboy extends Pessoa {
    // Variáveis

    private int idMotoboy;
    private String placaVeiculo;

    // Métodos
    public int getIdMotoboy() {
        return idMotoboy;
    }

    public void setIdMotoboy(int idMotoboy) {
        this.idMotoboy = idMotoboy;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    @Override
    public String toString() {
        return "Motoboy [idMotoboy=" + idMotoboy + ", placaVeiculo=" + placaVeiculo + "]";
    }
}
