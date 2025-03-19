package br.com.engSenai.dao;

import java.util.Scanner;

import br.com.engSenai.model.Retangulo;

public class RetanguloDao {
	
	public static void criarRetangulo() {
		Retangulo retangulo = new Retangulo();
		
		System.out.println();
		System.out.println("Criando um objeto retângulo...");
		System.out.print("Informe o lado do retângulo:");
		
		
		// Criar um objeto scanner
		Scanner leitor = new Scanner(System.in);
		
		retangulo.setLado(leitor.nextDouble());
		
		System.out.print("Informe a base do retângulo:");
		Scanner leitor2 = new Scanner(System.in);
		
		retangulo.setBase(leitor2.nextDouble());
		
		retangulo.mostrarDados();
		
		// Fechar o objeto scanner, remover da memória
		leitor.close();
		leitor2.close();

    }
}
