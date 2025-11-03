public class Main {
    public static void main(String[] args) {
        // ===== Instanciação com SOBRECARGA de construtores =====
        Mamifero onca = new Mamifero("Onça");               // idade default = 0
        Mamifero lobo  = new Mamifero("Lobo-Guará", 4);     // com idade

        Reptil jacare = new Reptil("Jacaré");
        Reptil iguana = new Reptil("Iguana", 2);

        Ave arara = new Ave("Arara");
        Ave tucano = new Ave("Tucano", 3);

        // ===== Métodos acessores (get/set) e modificadores =====
        // "digitando" alterações:
        onca.setIdade(6);
        jacare.setIdade(12);
        arara.setIdade(5);

        lobo.setNome("Tamanduá-bandeira");
        tucano.setNome("Papagaio");
        
        System.out.println("Leituras via getters:");
        System.out.println(onca.getNome() + " -> idade: " + onca.getIdade());
        System.out.println(jacare.getNome() + " -> idade: " + jacare.getIdade());
        System.out.println(arara.getNome() + " -> idade: " + arara.getIdade());
        
        System.out.println("\nObjetos (toString):");
        System.out.println(onca);
        System.out.println(lobo);
        System.out.println(jacare);
        System.out.println(iguana);
        System.out.println(arara);
        System.out.println(tucano);

        System.out.println("\nFalas (sobrescrita) e sobrecarga:");
        System.out.println("onca.falar(): " + onca.falar());
        System.out.println("jacare.falar(): " + jacare.falar());
        System.out.println("arara.falar(): " + arara.falar());
        System.out.println("arara.falar(\"piu-piu\"): " + arara.falar("piu-piu"));
        
        Veterinario vet = new Veterinario();
        vet.examinar(onca);
        vet.examinar(iguana);
        vet.examinar(tucano);
        
        onca.adicionarEntradaProntuario("Exame clínico", 120.00);
        onca.adicionarEntradaProntuario("Vacina antirrábica", 85.00);
        System.out.println("\nProntuário de " + onca.getNome() + ":");
        onca.imprimirProntuario();
        System.out.printf("Total: R$ %.2f%n", onca.totalProntuario());
        
        Zoologico zoo = new Zoologico("ZOO-01", 10);
        zoo.adicionarAnimal(onca);
        zoo.adicionarAnimal(lobo);
        zoo.adicionarAnimal(jacare);
        zoo.adicionarAnimal(iguana);
        zoo.adicionarAnimal(arara);
        zoo.adicionarAnimal(tucano);

        System.out.println("\nListagem do Zoológico:");
        zoo.listarAnimais();
        
        arara.setNome("Arara-azul");
        arara.setIdade(6);
        System.out.println("\nApós alterações em Ave:");
        System.out.println(arara);
    }
}

