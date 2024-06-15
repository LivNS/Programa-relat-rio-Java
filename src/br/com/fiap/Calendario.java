package br.com.fiap;

import java.util.ArrayList;
import java.util.List;

public class Calendario {
	private List<Treinamento> treinamentos;

    public Calendario() {
        this.treinamentos = new ArrayList<>();
}

    public void adicionarTreinamento(Treinamento treinamento) {
        this.treinamentos.add(treinamento);
    }
    
        public void removerTreinamento(Treinamento treinamento) {
            this.treinamentos.remove(treinamento);
    }
        
        public List<Treinamento> getTreinamentos() {
            return treinamentos;
        }
}
    