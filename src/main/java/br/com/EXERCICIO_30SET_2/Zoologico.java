package br.com.EXERCICIO_30SET_2;

public class Zoologico {
    public static void main(String[] args) {
        Animal[] animais = {
                new Cachorro("Rex", 3, "Labrador"),
                new Gato("Mimi", 2, true),
                new Passaro("Piu", 1, 15.5),
                new Ornitorrinco("Perry", 9000, 20)
        };

        System.out.println("=== SOM DOS ANIMAIS ===");
        for (Animal animal : animais) {
            animal.emitirSom(); // Polimorfismo em ação
        }

        System.out.println("\n=== MOVIMENTO ===");
        for (Animal animal : animais) {
            animal.mover();
        }

        System.out.println("\n=== INFORMACOES DETALHADAS ===");
        for (Animal animal : animais) {
            animal.exibirInfo();

            // Downcasting seguro
            if (animal instanceof Ornitorrinco) {
                ((Ornitorrinco) animal).combatendoDoutorDoofenshmirtz();
            }
            System.out.println("---");
        }
    }
}
