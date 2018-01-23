package com.curso.moda;

public class Main {

	public static void main(String[] args) {
		
		
		
		PrendaRopa vaquero = new Pantalon("Rojo", "Invierno", "Algodón", "Vaquero");
		PrendaRopa hawaiana = new Camisa("Azul", "Verano", "Poliester", "Hawaiana");
		PrendaRopa plumas = new Abrigo("Negro", "Invierno", "Lana", "Plumas");
		PrendaRopa chandal = new Pantalon("Amarillo", "Verano", "Poliester", "Chandal");
		PrendaRopa parka = new Abrigo("Negro", "Primavera", "Lana", "Parka");
		PrendaRopa lenador = new Camisa("Rojo", "Invierno", "seda", "Lenador");
		
		PrendaRopa [] armario = {vaquero, hawaiana, plumas, chandal, parka, lenador};
		
		System.out.println("DATOS DE LAS PRENDAS");
		
		for(PrendaRopa prenda : armario) {
			System.out.println("Nombre: "+prenda.getNombre());
			System.out.println("Color:"+prenda.getColor());
			System.out.println("Temporada: "+prenda.getTemporada());
			System.out.println("Tela: "+prenda.getTela());
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("AJUSTAR");
		System.out.println("-----------");
		
		for(PrendaRopa prenda : armario) {
			System.out.println(prenda.getNombre());
			prenda.ajustar();
			System.out.println("--------------------");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("RECORTAR");
		System.out.println("-----------");
		
		for(PrendaRopa prenda : armario) {
			System.out.println(prenda.getNombre());
			prenda.recortar();
			System.out.println("--------------------");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("COSER");
		System.out.println("-----------");
		
		for(PrendaRopa prenda : armario) {
			System.out.println(prenda.getNombre());
			prenda.coser();
			System.out.println("--------------------");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("PROBAR");
		System.out.println("-----------");
		
		for(PrendaRopa prenda : armario) {
			System.out.println(prenda.getNombre());
			prenda.probar();
			System.out.println("--------------------");
		}

	}

}
