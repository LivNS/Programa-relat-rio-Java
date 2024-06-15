package br.com.fiap;

import java.util.List;

	public class Relatorio {
	    private int id;
	    private Aluno aluno;
	    private Treinamento treinamento;
	    private String avaliacao;
	    private List<Double> notas;
	    private String nomeInstrutor;
	    private Nivel nivel;
	    private Horas horasCumpridas;

	    public Relatorio(int id, Aluno aluno, Treinamento treinamento, String avaliacao, List<Double> notas, String nomeInstrutor, Nivel nivel, Horas horasCumpridas) {
	        this.id = id;
	        this.aluno = aluno;
	        this.treinamento = treinamento;
	        this.avaliacao = avaliacao;
	        this.notas = notas;
	        this.nomeInstrutor = nomeInstrutor;
	        this.nivel = nivel;
	        this.horasCumpridas = horasCumpridas;
	    }

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

	    public String getAvaliacao() {
	        return avaliacao;
	    }

	    public void setAvaliacao(String avaliacao) {
	        this.avaliacao = avaliacao;
	    }

	    public List<Double> getNotas() {
	        return notas;
	    }

	    public void setNotas(List<Double> notas) {
	        this.notas = notas;
	    }

	    public String getNomeInstrutor() {
	        return nomeInstrutor;
	    }

	    public void setNomeInstrutor(String nomeInstrutor) {
	        this.nomeInstrutor = nomeInstrutor;
	    }

	    public Nivel getNivel() {
	        return nivel;
	    }

	    public void setNivel(Nivel nivel) {
	        this.nivel = nivel;
	    }

	    public Horas getHorasCumpridas() {
	        return horasCumpridas;
	    }

	    public void setHorasCumpridas(Horas horasCumpridas) {
	        this.horasCumpridas = horasCumpridas;
	    }
	}