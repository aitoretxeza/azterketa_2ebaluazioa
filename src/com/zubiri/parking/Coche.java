package com.zubiri.parking;

import java.util.Scanner;

public class Coche extends Vehiculo {

	boolean automatico = false;
	int consumo100km = 0;
	
	//Constructores
	
		public Coche (int numRuedasIntroducido, boolean motorIntroducido, String marcaIntroducido, boolean automaticoIntroducido, int consumo100kmIntroducido) {
			super(numRuedasIntroducido, motorIntroducido, marcaIntroducido);
			this.automatico = automaticoIntroducido;
			this.consumo100km = consumo100kmIntroducido;
		}
		
		public Coche (Scanner sc){
			super(sc);
			System.out.println("¿Es el coche automatico (true/false)? ");
			this.setAutomatico(sc.nextBoolean());
			System.out.println("¿Consumo en 100Km del coche? ");
			this.setConsumo100km(sc.nextInt());
		}
	
	//Métodos getter y setter
	
		public boolean getAutomatico() {
			return automatico;
		}
		
		public void setAutomatico(boolean automaticoIntroducido) {
			this.automatico = automaticoIntroducido;
		}
		
		public int getConsumo100km() {
			return consumo100km;
		}
		
		public void setConsumo100km (int consumo100kmIntroducido) {
			this.consumo100km = consumo100kmIntroducido;
		}
	
	//Otros métodos
		
		public String formatted() {
			String formatted = null;
			
			formatted = super.formatted() + " - Datos del coche: - \n"
			+"\tEs automatico el coche: " + getAutomatico() + "\n"
			+"\tConsumo en 100Km de el coche: " + getConsumo100km() + "\n";
			
			return formatted;
		}
		
	    double calcConsumo() {
	    	
	    	double consumo = 0;
	    		    	
	    	return consumo;
	    }	    
}
