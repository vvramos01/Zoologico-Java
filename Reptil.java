public class Reptil extends Animal {

    public Reptil(String nome) {
        super(nome);
    }

    public Reptil(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String falar() {
        return "(réptil sibila)";
    }

    @Override
    public String toString() {
        return "Reptil{" + infoBasica() + "}";
    }
}
