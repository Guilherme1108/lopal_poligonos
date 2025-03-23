package br.com.engSenai.model;

public class Trapezio {

	private double baseMaior;
	private double baseMenor;
	private double altura;
	
	public void setBaseMaior (double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	public void setBaseMenor (double baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public double area;
	
	public double calcularArea() {
		double area = (baseMaior + baseMenor) * altura / 2;
		return area;
	}
	public void mostrarDados() {
		System.out.println("===================");
		
		System.out.println("Resultados do Trapézio");
		
		System.out.println("===================");
		
		System.out.println("Base Maior: " + baseMaior );
		
		System.out.println("Base Menor: " + baseMenor);
		
		System.out.println("Altura: " + altura);
		
		System.out.println("Área: " + calcularArea());
		
		System.out.println("===================");
}
	
}
