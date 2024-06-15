package br.com.fiap;

public class Feedback {
    private int id;
    private Aluno aluno;
    private Treinamento treinamento;
    private String comentario;
    private double nota;

    public Feedback(int id, Aluno aluno, Treinamento treinamento, String comentario, double nota) {
        this.id = id;
        this.aluno = aluno;
        this.treinamento = treinamento;
        this.comentario = comentario;
        this.nota = nota;
    }
// Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Treinamento getTreinamento() {
        return treinamento;
    }

    public void setTreinamento(Treinamento treinamento) {
        this.treinamento = treinamento;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
