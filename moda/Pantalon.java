package com.curso.moda;

public class Pantalon extends PrendaRopa {
	
	public Pantalon(String color, String temporada, String tela, String nombre) {
		super(color, temporada, tela, nombre);
	}

	@Override
	public void recortar() {
	System.out.println("Recortar (clase pantalon)");
	}

	@Override
	public void coser() {
		System.out.println("Coser (clase pantalon)");
	}
	

	@Override
	public void probar() {
		System.out.println("Probar (clase pantalon)");
	}
	
}
