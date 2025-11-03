public class Mamifero extends Animal {

    public Mamifero(String nome) {
        super(nome);      
    }

    public Mamifero(String nome, int idade) {
        super(nome, idade); 
    }

    @Override
    public String falar() {
        return "(som de mamífero)";
    }

    @Override
    public String toString() {
        return "Mamifero{} " + super.toString();
    }
}

