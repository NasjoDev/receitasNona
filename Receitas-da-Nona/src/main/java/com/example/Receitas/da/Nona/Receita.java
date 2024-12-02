package com.example.Receitas.da.Nona;

public class Receita {
    private String nome;
    private String ingredientes;
    private String instrucoes;

    public Receita(String nome, String ingredientes, String instrucoes){
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.instrucoes = instrucoes;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString(){
        return "Nome da Receita: " + nome + "\n" +
                "Ingredientes: " + ingredientes + "\n" +
                "Instruções: " + instrucoes;
    }
}
