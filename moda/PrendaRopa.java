package com.curso.moda;

public class PrendaRopa implements IPrenda {

	private String color;
	private String temporada;
	private String tela;
	private String nombre;
	
	public PrendaRopa(String color, String temporada, String tela, String nombre) {
		this.setColor(color);
		this.setTemporada(temporada);
		this.setTela(tela);
		this.setNombre(nombre);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public String getTela() {
		return tela;
	}

	public void setTela(String tela) {
		this.tela = tela;
	}
	
	public void recortar() {
		System.out.println("Recortar (clase padre)");
	}

	public void coser() {
		System.out.println("Coser (clase padre)");
	}

	public void probar() {
		System.out.println("Probar (clase padre)");
	}

	@Override
	public void ajustar() {
		System.out.println("Ajustar (clase padre)");
	}

}
