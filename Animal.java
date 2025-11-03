public class Animal {

    private String nome;
    private int idade;


    private Prontuario prontuario;


    public Animal(String nome) {
        this.nome = nome;
        this.idade = 0;
        this.prontuario = new Prontuario(10);
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        if (idade >= 0) this.idade = idade;
        this.prontuario = new Prontuario(10);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) {
        if (idade >= 0) this.idade = idade;
    }

    protected String infoBasica() {
        return "nome='" + nome + "', idade=" + idade;
    }

    public String falar() { return "(animal em silêncio)"; }
    public String falar(String som) { return som; }

    @Override
    public String toString() {
        return "Animal{" + infoBasica() + "}";
    }
    
    public boolean adicionarEntradaProntuario(String descricao, double custo) {
        return prontuario.adicionarEntrada(descricao, custo);
    }

    public void imprimirProntuario() {
        prontuario.imprimir();
    }

    public double totalProntuario() {
        return prontuario.total();
    }
}


