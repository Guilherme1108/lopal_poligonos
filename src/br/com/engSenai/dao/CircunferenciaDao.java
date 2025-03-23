package br.com.engSenai.dao;

import java.util.Scanner;

import br.com.engSenai.model.Circunferencia;

public class CircunferenciaDao {
	
	public static void criarCircuferencia() {
		Circunferencia circunferencia = new Circunferencia();
		
		System.out.println();
		System.out.println("Criando um objeto Circunferico...");
		System.out.print("Informe o raio da Circunferência: ");
		
		//criar um objeto scanner
		Scanner leitor = new Scanner(System.in);
		circunferencia.setRaio(leitor.nextDouble());
		circunferencia.mostrarDados();
		

		leitor.close();
		
	}

}
