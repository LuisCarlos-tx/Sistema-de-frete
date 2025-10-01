public class Main {
    public static void main(String[] args) {

        ServicoDeEntrega entrega1 = new ServicoDeEntrega(10);
        entrega1.adicionarItem(new Carro("ABC-1234", 2020));
        entrega1.adicionarItem(new Funcionario());
        System.out.println("Custo total da entrega 1: R$ " + entrega1.calcularCustoTotal());

        ServicoDeEntrega entrega2 = new ServicoDeEntrega(25);
        entrega2.adicionarItem(new Motocicleta("XYZ-9876", 2022));
        entrega2.adicionarItem(new Autonomo());
        System.out.println("Custo total da entrega 2: R$ " + entrega2.calcularCustoTotal());
    }
}
