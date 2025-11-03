public class Zoologico {
    private String codigo;
    private Animal[] animais;
    private int quantidade; 

    public Zoologico(String codigo, int capacidade) {
        this.codigo = codigo;
        this.animais = new Animal[capacidade];
        this.quantidade = 0;
    }

    public boolean adicionarAnimal(Animal a) {
        if (a == null) return false;
        if (quantidade < animais.length) {
            animais[quantidade] = a;
            quantidade++;
            return true;
        }
        return false; 
    }

    public void listarAnimais() {
        System.out.println("Zoológico " + codigo + " - Animais:");
        for (int i = 0; i < quantidade; i++) {
            System.out.println("- " + animais[i]);
        }
    }
}


