package br.com.engSenai.dao;

import br.com.engSenai.ui.Menu;
import java.util.Scanner;
import br.com.engSenai.model.Retangulo;

public class RetanguloDao {
	
	public static void criarRetangulo() {
		Retangulo retangulo = new Retangulo();
		
		System.out.println();
		System.out.println("Criando um objeto Retângulo...");
		System.out.print("Informe o lado do Retângulo:");
		
		
		// Criar um objeto scanner
		Scanner leitor = new Scanner(System.in);
		
		retangulo.setLado(leitor.nextDouble());
		
		System.out.print("Informe a base do retângulo:");
		
		retangulo.setBase(leitor.nextDouble());
		
		retangulo.mostrarDados();
		
		Menu.continuar(leitor, "Guilherme");
		
		// Fechar o objeto scanner, remover da memória
		leitor.close();
	

    }
}
