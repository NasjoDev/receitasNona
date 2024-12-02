package com.example.Receitas.da.Nona;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeReceitas {
    private static ArrayList<Receita> receitas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n--- Gerenciador de Receitas ---");
            System.out.println("1. Adicionar receitas");
            System.out.println("2. Listar todas as receitas");
            System.out.println("3. Buscar receita por nome");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    adicionarReceita(scanner);
                    break;
                case  2:
                    listarReceitas();
                    break;
                case 3:
                    buscarReceita(scanner);
                    break;
                case 4:
                    System.out.println("Encerrando o programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção Invalida. Tente novamente.");
            }
        } while(opcao != 4);
        scanner.close();
    }

    private static void adicionarReceita(Scanner scanner){
        System.out.println("\nDigite o nome da receita: ");
        String nome = scanner.nextLine();
        System.out.println("Digite os ingredientes (separados por vírgula): ");
        String ingredientes = scanner.nextLine();
        System.out.println("Digite as instruções de preparo: ");
        String instrucoes = scanner.nextLine();

        receitas.add(new Receita(nome, ingredientes, instrucoes));
        System.out.println("Receita adicionada com sucesso!");
    }

    private static void listarReceitas(){
        if (receitas.isEmpty()){
            System.out.println("\nNenhuma receita cadastrada.");
        } else {
            System.out.println("\n--- Lista de Receitas ---");
            for (Receita receita : receitas){
                System.out.println(receita);
                System.out.println("-----------------------");
            }
        }
    }
    private static void buscarReceita(Scanner scanner){
        System.out.println("\nDigite o nome da receita que deseja buscar: ");
        String nome = scanner.nextLine();
        boolean encontrada = false;

        for (Receita receita: receitas){
            if (receita.getNome().equalsIgnoreCase(nome)){
                System.out.println("\n--- Receita Encontrada ---");
                System.out.println(receita);
                encontrada = true;
                break;
            }
        }
        if (!encontrada){
            System.out.println("Receita não encontrada");
        }
    }
}
