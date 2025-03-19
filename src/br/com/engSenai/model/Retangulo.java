package br.com.engSenai.model;

public class Retangulo {
	
	private double lado;

	public void setLado(double lado) {

	this.lado = lado;
	}
	
	
	private double base;

	public void setBase(double base) {

	this.base = base;

	}

	public double calcularArea() {

	double area = lado * base;

	return area;

	}

	public double calcularPerimetro() {

	double perimetro = lado + lado + base + base;

	return perimetro;

	}

	public void mostrarDados() {

	System.out.println("-------------------");

	System.out.println("DADOS DO RETANGULO");

	System.out.println("-------------------");

	System.out.println("Lado: " + lado);
	
	System.out.println("Base: " + base);

	System.out.println("Área: " + calcularArea());
	
	System.out.println("Perimetro: " + calcularPerimetro());
	
	System.out.println("-------------------");

	}

}
