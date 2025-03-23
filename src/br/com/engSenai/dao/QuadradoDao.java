package br.com.engSenai.dao;

import java.util.Scanner;

import br.com.engSenai.model.Quadrado;

public class QuadradoDao {
	
	public static void criarQuadrado() {
		Quadrado quadrado = new Quadrado();
		
		System.out.println();
		System.out.println("Criando um objeto Quadrado...");
		System.out.print("Informe o lado do Quadrado:");
		
		
		// Criar um objeto scanner
		Scanner leitor = new Scanner(System.in);
		
		quadrado.setLado(leitor.nextDouble());
		
		quadrado.mostrarDados();
		
		// Fechar o objeto scanner, remover da memória
		leitor.close();
	}

}
