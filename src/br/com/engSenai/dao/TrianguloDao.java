package br.com.engSenai.dao;

import java.util.Scanner;

import br.com.engSenai.model.Triangulo;

public class TrianguloDao {
	
	public static void criarTriangulo() {
		Triangulo triangulo = new Triangulo();
		
		System.out.println();
		System.out.println("Criando um Triangulo...");
		System.out.print("Informe a base do Triângulo: ");
		Scanner leitor = new Scanner(System.in);
		triangulo.setBase(leitor.nextDouble());
		
		System.out.print("informe a altura do Triângulo: ");
		triangulo.setAltura(leitor.nextDouble());
		
		triangulo.mostrarDados();
		
		leitor.close();
		
	}

}
