package com.antonioferreira.primeiraentrega;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.spi.ConsoleTarget;
import com.antonioferreira.primeiraentrega.repositorios.ContatoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PrimeiraEntregaApplication implements CommandLineRunner {
    @Autowired
    private ContatoRepositorio contatoRepositorio;

    public static void main(String[] args) {
        SpringApplication.run(PrimeiraEntregaApplication.class, args);
    }

    @java.lang.Override
    public void run(java.lang.String... args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        while(true){

            System.out.println("Oii, bem vindo a Biblioteca virtual OBJETIVA");
            System.out.println("O que deseja fazer?");
            System.out.println("Cadastrar Livros (1)");
            System.out.println("Excluir Livros (2)");
            System.out.println("Pesquisar livro (3)");
            System.out.println("Reservar Livros (4)");
            System.out.println("Sair (5)");

             int opcao = teclado.nextInt();

            if(opcao == 1){

                System.out.println("Nome do livro");
                String nome = teclado.nextLine();
                System.out.println("Nome do Autor");
                String autor = teclado.nextLine();
                System.out.println("Ano de publicação");
                int ano = teclado.nextInt();
                System.out.println("Qual categoria?");
                String categoria = teclado.nextLine();

                Livros l = new Livros(nome,autor,ano,categoria);
                contatoRepositorio.save(l);

            }
            else if(opcao == 2){

            }
            else if(opcao == 3){

            }
            else if(opcao == 4){

            }
            else if(opcao == 5){
                break;
            }
            else{
                System.out.println("Opção não reconhecida");
            }
        }
    }
}
