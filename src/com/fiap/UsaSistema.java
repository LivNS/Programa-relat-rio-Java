package com.fiap;

import br.com.fiap.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsaSistema {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Scanner scanner = new Scanner(System.in);

        // Criação do instrutor
        System.out.println("Informe o nome do instrutor:");
        String nomeInstrutor = scanner.nextLine();
        System.out.println("Informe a especialidade do instrutor:");
        String especialidade = scanner.nextLine();
        Instrutor instrutor = new Instrutor(1, nomeInstrutor, especialidade);

        // Criação do treinamento
        System.out.println("Informe o título do treinamento:");
        String tituloTreinamento = scanner.nextLine();
        System.out.println("Informe a descrição do treinamento:");
        String descricaoTreinamento = scanner.nextLine();
        System.out.println("Informe a data do treinamento (Formato YYYY-MM-DD):");
        LocalDate dataTreinamento = LocalDate.parse(scanner.nextLine());
        System.out.println("Informe a duração do treinamento em horas:");
        int duracaoTreinamento = Integer.parseInt(scanner.nextLine());
        Treinamento treinamento = new Treinamento(1, tituloTreinamento, descricaoTreinamento, dataTreinamento, duracaoTreinamento, instrutor);

        sistema.adicionarTreinamento(treinamento);

        // Adição de alunos ao treinamento
        List<Aluno> alunosTreinamento = adicionarAlunos(scanner, sistema, treinamento);

        // Adição de relatórios para os alunos
        for (Aluno aluno : alunosTreinamento) {
            adicionarRelatorio(scanner, sistema, aluno, treinamento);
        }

        // Listar relatórios
        for (Aluno aluno : alunosTreinamento) {
            listarRelatoriosPorAluno(sistema, aluno);
        }

        scanner.close();
    }

    private static List<Aluno> adicionarAlunos(Scanner scanner, Sistema sistema, Treinamento treinamento) {
        List<Aluno> alunos = new ArrayList<>();
        while (true) {
            System.out.println("Deseja adicionar um aluno? (s/n)");
            if (scanner.nextLine().equalsIgnoreCase("n")) {
                break;
            }
            System.out.println("Informe o nome do aluno:");
            String nomeAluno = scanner.nextLine();
            System.out.println("Informe o ID do aluno:");
            int idAluno = Integer.parseInt(scanner.nextLine());
            Aluno aluno = new Aluno(idAluno, nomeAluno);
            alunos.add(aluno);
        }
        return alunos;
    }

    private static void adicionarRelatorio(Scanner scanner, Sistema sistema, Aluno aluno, Treinamento treinamento) {
        System.out.println("Informe o ID do relatório:");
        int idRelatorio = Integer.parseInt(scanner.nextLine());

        System.out.println("Informe a avaliação:");
        String avaliacao = scanner.nextLine();

        System.out.println("Informe o nível do aluno:");
        Nivel nivel = new Nivel(scanner.nextLine());

        System.out.println("Informe as horas cumpridas:");
        Horas horasCumpridas = new Horas(Integer.parseInt(scanner.nextLine()));

        System.out.println("Informe as notas do aluno (digite uma nota por vez e '.' para parar):");
        List<Double> notas = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase(".")) {
                break;
            }
            notas.add(Double.parseDouble(input));
        }

        Relatorio relatorio = new Relatorio(idRelatorio, aluno, treinamento, avaliacao, notas, treinamento.getInstrutor().getNome(), nivel, horasCumpridas);
        sistema.adicionarRelatorio(relatorio);
    }

    private static void listarRelatoriosPorAluno(Sistema sistema, Aluno aluno) {
        List<Relatorio> relatoriosAluno = sistema.listarRelatoriosPorAluno(aluno);
        System.out.println("Relatórios para " + aluno.getNome() + ":");
        for (Relatorio relatorio : relatoriosAluno) {
            System.out.println(aluno);
            System.out.println("Nível: " + relatorio.getNivel().getDescricao());
            System.out.println("Horas Cumpridas: " + relatorio.getHorasCumpridas().getHoras());
            System.out.println("Instrutor: " + relatorio.getNomeInstrutor());
            System.out.println("Avaliação: " + relatorio.getAvaliacao());
            System.out.println("Notas: " + relatorio.getNotas());
        }
    }
}