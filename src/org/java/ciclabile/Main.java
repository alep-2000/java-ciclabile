package org.java.ciclabile;

public class Main {
	public static void main(String[] args) {
		
//		CREAZIONE ARRAY DI INTERI E CREAZIONE NUOVA ISTANZA
		int[] arrayInteri = {1, 2, 3, 4, 5};
        IteratoreElementi i = new IteratoreElementi(arrayInteri);

//        CICLO WHILE CHE CONTROLLA SE CI SONO ANCORA ELEMENTI E GLI STAMPA IN CONSOLE
        while (i.hasAncoraElementi()) {
            int elemento = i.getElementoSuccessivo();
            System.out.println("Elemento: " + elemento);
        }
		
        
// 		EXTRA
		
 		System.out.println("\n---------------\n");
 		
 		IteratoreElementi c1 = new IteratoreElementi();
 		
 		c1.addElemento(6);
 		c1.addElemento(7);
 		c1.addElemento(8);
 		c1.addElemento(9);
 		c1.addElemento(10);
 		
 		while (c1.hasAncoraElementi()) {
 			System.out.println(c1.getElementoSuccessivo());
 		}
	}
}
