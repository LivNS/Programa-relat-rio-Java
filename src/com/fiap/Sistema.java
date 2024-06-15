package com.fiap;

import br.com.fiap.*;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Treinamento> treinamentos;
    private List<Relatorio> relatorios;

    public Sistema() {
        this.treinamentos = new ArrayList<>();
        this.relatorios = new ArrayList<>();
    }

    public void adicionarTreinamento(Treinamento treinamento) {
        treinamentos.add(treinamento);
    }

    public void adicionarRelatorio(Relatorio relatorio) {
        relatorios.add(relatorio);
    }

    public List<Relatorio> listarRelatoriosPorAluno(Aluno aluno) {
        List<Relatorio> relatoriosAluno = new ArrayList<>();
        for (Relatorio relatorio : relatorios) {
            if (relatorio.getAluno().equals(aluno)) {
                relatoriosAluno.add(relatorio);
            }
        }
        return relatoriosAluno;
    }
}