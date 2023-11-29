package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Produto;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    public void executarMenu() throws SQLException {
        boolean continuar = true;
        while (continuar){

            System.out.println(".____________________________.");
            System.out.println("|  Sistema de Gerenciamento  |");
            System.out.println("|   de Produtos em Estoque   |");
            System.out.println("|____________________________|");
            System.out.println(" [1] - Cadastrar produto");
            System.out.println(" [2] - Cadastrar cliente");
            System.out.println(" [3] - Pesquisar produto");
            System.out.println(" [4] - Pesquisar Cliente");
            System.out.println(" [5] - Deletar produto");
            System.out.println(" [6] - Deletar Cliente");
            System.out.println(" [7] - Sair");

            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            scanner.nextLine();

            Cliente cliente = new Cliente();
            Produto produto = new Produto();
            ClienteController clienteController = new ClienteController();

            if(opcao == 1){
                produto.cadastrarProduto();
            }else if(opcao == 2) {
                cliente.cadastrarCliente();
                clienteController.cadastrarClientes(cliente);
            }else if(opcao == 3){

            }else if(opcao == 4){
                System.out.print("Informe o CPF do cliente: ");
                String cpfPesquisa = scanner.nextLine();
                clienteController.pesquisarClientes(cpfPesquisa);
            }else if(opcao == 5){
                System.out.print("Digite o CPF do usuario:");
                String cpfDeletar = scanner.nextLine();
                clienteController.deletarClientes(cpfDeletar);
            }else if(opcao == 6){
                continuar = false;
            }
        }
    }
}
