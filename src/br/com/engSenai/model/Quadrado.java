package br.com.engSenai.model;

public class Quadrado {
	
	private double lado;

	public void setLado(double lado) {

	this.lado = lado;

	}

	private double calcularArea() {

	double area = Math.pow(lado, 2);

	return area;

	}

	private double calcularPerimetro() {

	double perimetro = lado * 4;

	return perimetro;

	}

	public void mostrarDados() {

	System.out.println("-------------------");

	System.out.println("DADOS DO QUADRADO");

	System.out.println("-------------------");

	System.out.println("Lado: " + lado);

	System.out.println("Área: " + calcularArea());
	
	System.out.println("Perimetro: " + calcularPerimetro());
	
	System.out.println("-------------------");

	}

}

