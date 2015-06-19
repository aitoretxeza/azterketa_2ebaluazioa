package com.zubiri.parking;

import java.util.ArrayList;

public class ParkingVehiculos {
	
	private static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private static ArrayList<Vehiculo> vehiculosMarca = new ArrayList<Vehiculo>();
	
	//Constructores
		
		public ParkingVehiculos (ArrayList<Vehiculo> vehiculosIntroducido){
			this.vehiculos = vehiculosIntroducido;
		}
	
	//Métodos getter y setter
		
		public static ArrayList<Vehiculo> getVehiculos() {			
			return vehiculos;
		}

		public void setVehiculos (ArrayList<Vehiculo> vehiculosIntroducidos) {			
			this.vehiculos = vehiculosIntroducidos;
		}
	
	//Otros métodos
		//Añadir vehículo

		public static void añadirVehiculo(Vehiculo vehiculo){
			vehiculos.add(vehiculo);
		}
		
		
		//Buscar vehiculo por marca
		
		public static ArrayList<Vehiculo> buscarVehiculoMarca(String marca){
			Vehiculo vehiculo = null;
			for (int i = 0; i < vehiculos.size(); i++) {
				if (vehiculos.get(i).getMarca().equalsIgnoreCase(marca)) {
					vehiculo = vehiculos.get(i);
					vehiculosMarca.add(vehiculo);
				}
			}
			return vehiculosMarca;
		}
		
		//Borrar vehiculo
		
		public static void borrarVehiculoMarca(String marca){
			vehiculos.remove(buscarVehiculoMarca(marca));
		}
		
		//Formatted
		
		public String formatted (ArrayList<Vehiculo> vehiculos){
			String formatted = null;
			
			for (int x = 0; x < vehiculos.size(); x++) {
				
				formatted = vehiculos.get(x).formatted();
			}

			return formatted;	
		}
}
