package br.com.engSenai.ui;

import java.util.Scanner;

import br.com.engSenai.dao.CircunferenciaDao;
import br.com.engSenai.dao.QuadradoDao;
import br.com.engSenai.dao.RetanguloDao;
import br.com.engSenai.dao.TrapezioDao;
import br.com.engSenai.dao.TrianguloDao;

public class Menu {
	
	public static void mostrarMenu() {
		
		System.out.println("----------------------------");
		System.out.println("CALCULADORA DE POLÍGONOS");
		System.out.println("----------------------------");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retângulo");
		System.out.println("3 - Trapézio");
		System.out.println("4 - Circunferência");
		System.out.println("5 - Triângulo");
		System.out.println("----------------------------");
		System.out.print("Escolha uma opção (1 - 5): ");
		
		Scanner leitor = new Scanner(System.in);
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			QuadradoDao.criarQuadrado();
		} else if(opcao == 2) {
			RetanguloDao.criarRetangulo();
		} else if(opcao == 3) {
			TrapezioDao.criarTrapezio();
		} else if(opcao == 4) {
			CircunferenciaDao.criarCircuferencia();
		} else if(opcao == 5)
			TrianguloDao.criarTriangulo();
		 else {
			System.out.println("Esta opção ainda não foi adicionada.");
		}
		leitor.close();
	}
	
	public static void continuar(Scanner leitor, String nome) {
		
		String resposta = "";
		
		while (!resposta.equals("c") || !resposta.equals("s")) {
			System.out.print(nome + ", Digite C para continuar, ou S para sair... ");
			resposta = leitor.next();
			
		}
		
		if (resposta.equalsIgnoreCase("s")) {
			Menu.mostrarMenu();
		}
	}

}
