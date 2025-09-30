package br.com.EXERCICIO_30SET_2;

public class Ornitorrinco extends Animal {
    private double tamanhoCauda;

    public Ornitorrinco(String nome, int idade, int tamanhoCauda) {
        super(nome, idade);
        this.tamanhoCauda = tamanhoCauda;
    }

    public Ornitorrinco(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Krrr!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("tamanhoCauda: " + tamanhoCauda);
    }

    @Override
    public void mover() {
        System.out.println(nome + " está nadando!");
    }

    public void combatendoDoutorDoofenshmirtz() {
        System.out.println(nome + " está combatendo o doutor Doofenshmirtz!");
    }
}
