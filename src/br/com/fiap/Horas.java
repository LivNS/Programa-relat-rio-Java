package br.com.fiap;

//Horas se refere a quantidade de horas que um aluno fez o treinamento

public class Horas {
    private int horas;

    public Horas(int horas) {
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void adicionarHoras(int horas) {
        this.horas += horas;
    }
}