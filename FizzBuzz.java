package org.booleancareer;

import java.util.Random;

//Scrivi un programma che stampi i numeri da 1 a 100, ma per i multipli di 3 stampi “Fizz” al posto del
//numero e per i multipli di 5 stampi Buzz. Per i numeri che sono sia multipli di 3 che di 5 stampi FizzBuzz.

public class FizzBuzz {
	public static void main(String[] args) {
		
		// VALORI RANDOM
		
		// PRENDO IL METODO PER GENERARE NUMERI RANDOM
		Random rand = new Random(100);
		
		// CREUN ARRAY DOVE INSERIRE I NUMERI
		int[] numbers = new int[100];
		
		// CREIAMO UN CICLO FOR PER CICLARE 100 VOLTE
		for(int i = 0 ; i < 100; i++) {
			
			// AD OGNI CICLO PRENDIAMO UN NUMERO COMPRESO DA 1 A 100
			int Nrand = rand.nextInt(100) +1;
			
			// ASSEGNO I VALORI OTTENUTI ALL' ARRAY
				// PER OGNI I ASSEGNO IL VALORE CORRENTE
			numbers[i] = Nrand;
			
			// SE E' UN MULTIPLO DI 3 E 5 
			if((Nrand %3 == 0) && (Nrand %5 == 0)) {
				System.out.println("FizzBuzz " + Nrand);
				// SE E' UN MULTIPLO DI 3 
			}else if (Nrand %3 == 0) {
				System.out.println("Fizz " + Nrand);
				// SE E' UN MULTIPLO DI 5 
			}else if (Nrand %5 == 0) {
				System.out.println("Buzz " + Nrand);
			}else {
				System.out.println(Nrand);
			}
			
		}
		
	//	-------------------------------------------------------------
		
		System.out.println("----------------------------");
		
		// VALORI SEQUENZIALI
		
		// CREIAMO UN CICLO FOR PER CICLARE 100 VOLTE
				for(int i = 0 ; i <= 100; i++) {
					
					// SE E' UN MULTIPLO DI 3 E 5 
					if((i %3 == 0) && ( i %5 == 0)) {
						System.out.println("FizzBuzz " + i);
						// SE E' UN MULTIPLO DI 3 
					}else if (i %3 == 0) {
						System.out.println("Fizz " + i);
						// SE E' UN MULTIPLO DI 5 
					}else if (i %5 == 0) {
						System.out.println("Buzz " + i);
					}else {
						System.out.println(i);
					}
					
				}
	}
}
