public abstract class Veiculo implements Fretavel {
    protected String placa;
    protected int ano;
    
    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }
    
    public String getPlaca() { return placa; }
    public int getAno() { return ano; }
}

public class Carro extends Veiculo {
    public Carro(String placa, int ano) {
        super(placa, ano);
    }
    
    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        return distanciaEmKm * 1.25;
    }
}

public class Motocicleta extends Veiculo {
    public Motocicleta(String placa, int ano) {
        super(placa, ano);
    }
    
    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        return distanciaEmKm * 0.45;
    }
}
