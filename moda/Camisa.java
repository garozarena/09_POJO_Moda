package com.curso.moda;

public class Camisa extends PrendaRopa {
	
	public Camisa(String color, String temporada, String tela, String nombre) {
		super(color, temporada, tela, nombre);
	}

	@Override
	public void recortar() {
	System.out.println("Recortar (clase camisa)");
	}


	@Override
	public void probar() {
		System.out.println("Probar (clase camisa)");
	}
}
