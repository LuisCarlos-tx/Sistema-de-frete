import java.util.ArrayList;
import java.util.List;

public class ServicoDeEntrega {
    private List<Fretavel> itensFretaveis;
    
    public ServicoDeEntrega() {
        this.itensFretaveis = new ArrayList<>();
    }
    public void adicionarItem(Fretavel item) {
        itensFretaveis.add(item);
    }
    
    public double calcularCustoTotal(double distanciaEmKm) {
        double custoTotal = 0.0;
        for (Fretavel item : itensFretaveis) {
            custoTotal += item.calcularCustoFrete(distanciaEmKm);
        }
        return custoTotal;
    }
    public void limparItens() {
        itensFretaveis.clear();
    }
}
