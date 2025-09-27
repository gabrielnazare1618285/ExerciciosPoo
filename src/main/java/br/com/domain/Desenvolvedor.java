package br.com.domain;

public class Desenvolvedor extends Funcionario {

    private int horasExtra;
    private Double valorHoraExtra;

    public Desenvolvedor(String nome, String matricula, double salarioBase, int horasExtra, Double valorHoraExtra) {
        super(nome, matricula, salarioBase);
        this.horasExtra = horasExtra;
        this.valorHoraExtra = valorHoraExtra;

    }


    @Override
    public double calcularSalario() {
        //Escopo de variável
        double teste = 1.5;

        return salarioBase +(horasExtra * valorHoraExtra);
    }
    public void registrarHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
}
