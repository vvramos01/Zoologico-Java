public class Prontuario {
    private String[] descricao;
    private double[] custo;
    private int qtd; 

    public Prontuario(int capacidade) {
        this.descricao = new String[capacidade];
        this.custo = new double[capacidade];
        this.qtd = 0;
    }

    public boolean adicionarEntrada(String desc, double valor) {
        if (qtd < descricao.length) {
            descricao[qtd] = desc;
            custo[qtd] = valor;
            qtd++;
            return true;
        }
        return false; 
    }

    public double total() {
        double soma = 0.0;
        for (int i = 0; i < qtd; i++) soma += custo[i];
        return soma;
    }

    public void imprimir() {
        System.out.println("=== Prontuário ===");
        for (int i = 0; i < qtd; i++) {
            System.out.printf("• %s | Custo: R$ %.2f%n", descricao[i], custo[i]);
        }
        System.out.printf("TOTAL: R$ %.2f%n", total());
    }
}

