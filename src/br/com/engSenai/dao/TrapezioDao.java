package br.com.engSenai.dao;

import java.util.Scanner;

import br.com.engSenai.model.Trapezio;
import br.com.engSenai.ui.Menu;

public class TrapezioDao {
	
	public static void criarTrapezio() {
		Trapezio trapezio = new Trapezio();
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Criando um objeto Trapézio...");
		
		System.out.print("Informe a base MAIOR do Trapézio: ");
		trapezio.setBaseMaior(leitor.nextDouble());
		
		System.out.print("Informe a base MENOR do Trapézio: ");
		trapezio.setBaseMenor(leitor.nextDouble());
		
		System.out.print("Informe a ALTURA do Trapézio: ");
		trapezio.setAltura(leitor.nextDouble());
		
		trapezio.mostrarDados();
		
		Menu.continuar(leitor, "Guilherme");
		
		leitor.close();
	}

}
