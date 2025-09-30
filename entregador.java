public abstract class Entregador implements Fretavel {
    protected String nome;
    public Entregador(String nome) {
        this.nome = nome;
    }
    public String getNome() { return nome; }
}
public class Funcionario extends Entregador {
    public Funcionario(String nome) {
        super(nome);
    }
    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        return 5.00;
    }
}
public class Autonomo extends Entregador {
    public Autonomo(String nome) {
        super(nome);
    }
    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        return distanciaEmKm * 0.95;
    }
}
