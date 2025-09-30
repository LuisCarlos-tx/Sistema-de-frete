public class Main {
    public static void main(String[] args) {
        ServicoDeEntrega servico = new ServicoDeEntrega();
        
        System.out.println("=== SISTEMA DE CÁLCULO DE FRETE ===\n");
        
        System.out.println("ENTREGA 1 - 10km");
        ServicoDeEntrega entrega1 = new ServicoDeEntrega();
        
        Funcionario funcionario = new Funcionario("João Silva");
        Carro carro = new Carro("ABC-1234", 2020);
        
        entrega1.adicionarItem(funcionario);
        entrega1.adicionarItem(carro);
        
        double custoEntrega1 = entrega1.calcularCustoTotal(10.0);
        System.out.println("• Funcionário: " + funcionario.getNome());
        System.out.println("• Veículo: Carro - Placa " + carro.getPlaca());
        System.out.println("• Custo total: R$ " + String.format("%.2f", custoEntrega1));
        
        // Detalhamento dos custos
        System.out.println("\n  Detalhamento:");
        System.out.println("  - Custo do funcionário: R$ " + String.format("%.2f", funcionario.calcularCustoFrete(10)));
        System.out.println("  - Custo do carro: R$ " + String.format("%.2f", carro.calcularCustoFrete(10)));
        
        System.out.println("\nENTREGA 2 - 25km");
        ServicoDeEntrega entrega2 = new ServicoDeEntrega();
        
        Autonomo autonomo = new Autonomo("Maria Santos");
        Motocicleta moto = new Motocicleta("XYZ-5678", 2022);
        
        entrega2.adicionarItem(autonomo);
        entrega2.adicionarItem(moto);
        
        double custoEntrega2 = entrega2.calcularCustoTotal(25.0);
        System.out.println("• Entregador: " + autonomo.getNome() + " (Autônomo)");
        System.out.println("• Veículo: Motocicleta - Placa " + moto.getPlaca());
        System.out.println("• Custo total: R$ " + String.format("%.2f", custoEntrega2));
        
        System.out.println("\n  Detalhamento:");
        System.out.println("  - Custo do autônomo: R$ " + String.format("%.2f", autonomo.calcularCustoFrete(25)));
        System.out.println("  - Custo da motocicleta: R$ " + String.format("%.2f", moto.calcularCustoFrete(25)));
        
        System.out.println("\n=== RESUMO ===");
        System.out.println("Entrega 1 (10km): R$ " + String.format("%.2f", custoEntrega1));
        System.out.println("Entrega 2 (25km): R$ " + String.format("%.2f", custoEntrega2));
    }
}
