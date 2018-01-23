package com.curso.moda;

public class Abrigo extends PrendaRopa {

	public Abrigo(String color, String temporada, String tela, String nombre) {
		super(color, temporada, tela, nombre);
	}

	@Override
	public void recortar() {
	System.out.println("Recortar (clase abrigo)");
	}


	@Override
	public void coser() {
		System.out.println("Coser (clase abrigo)");
	}
	

	@Override
	public void probar() {
		System.out.println("Probar (clase abrigo)");
	}
}
