public class Ave extends Animal {

    public Ave(String nome) {
        super(nome);
    }

    public Ave(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String falar() {
        return "(pio de ave)";
    }

    @Override
    public String toString() {
        return "Ave{" + infoBasica() + "}";
    }
}

