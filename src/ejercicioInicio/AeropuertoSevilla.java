package ejercicioInicio;

import java.util.Scanner;

public class AeropuertoSevilla {

	public static void main(String[] args) {
		crearAeropuerto();
		
	

	}
	
	public static void crearAeropuerto() {
		
		Avion[] aeropuerto=new Avion[50];
		System.out.println("Aeropuerto creado");
		
		Scanner sc=new Scanner(System.in);
		String nombreAvion;
		int capacidad;
		int contador;
		for (contador=0; contador<50;contador++) {
			System.out.println("Nombre avión");
			nombreAvion=sc.nextLine();
			System.out.println("Capacidad avión");
			capacidad=Integer.valueOf(sc.nextLine());
			aeropuerto[contador]=new Avion(nombreAvion,capacidad);
		
		
	}

}
}
