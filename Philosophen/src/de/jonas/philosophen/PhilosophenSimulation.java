package de.jonas.philosophen;

import java.util.Scanner;

public class PhilosophenSimulation {

	public static void main(String[] args) {
		int anzahlPhilosophen;
		String name;	//Speichert kurz neuen Philosophennamen
		
		Scanner anzPhil = new Scanner(System.in);
		System.out.println("Wie viele Philosophen?");
		anzahlPhilosophen =anzPhil.nextInt();
		System.out.println(anzahlPhilosophen);
		
		Philosoph[] philosophen = new Philosoph[anzahlPhilosophen];
		Gabel[] gabeln = new Gabel[anzahlPhilosophen]
		
		for(int i = 0;i < anzahlPhilosophen;i++) {
			name = "P" + String.valueOf(i);
			philosophen[i] = new Philosoph(name, i);
			
		for(int i = 0;i < anzahlPhilosophen;i++) {
			gabeln[i] = new Philosoph(name, i);
		}
	}

}
