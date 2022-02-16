package ejercicioInicio;

import java.util.Scanner;

public class Aeropuerto {

	public static void main(String[] args) {
		
		
		Avion nuevoAvion=new Avion("id33333", 120);
		nuevoAvion.setCompania("Iberia");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Cuantos viajeros");
		int numViajeros=Integer.valueOf(sc.nextLine());
		
		System.out.println("Kilometros recorridos?");
		int kmRecorridos=Integer.valueOf(sc.nextLine());
		
		nuevoAvion.asignarVuelo(numViajeros,kmRecorridos);
		
		crearAvionConMenu();
		
		nuevoAvion.asignarVuelo(100, 100);
		nuevoAvion.asignarVuelo(120, 1000);
		nuevoAvion.asignarVuelo(150, 6000);
		
		Scanner scannner =new Scanner (System.in);
		System.out.println("Selecciona una opción");
		System.out.println("A.asignar vuelo");
		System.out.println("B.Obtener numero de vuelo");
		System.out.println("c.Obtener total kilometros volados");
		System.out.println("D.Obtener media kilometros volados");
		
		
		
		String opcion =sc.nextLine();
		
		if(opcion.equalsIgnoreCase("a")) {
			
		}else if (opcion.equalsIgnoreCase("b")) {
			System.out.println(nuevoAvion.getNumVuelos());
			
			
		}else if(opcion.equalsIgnoreCase("c")) {
			System.out.println(nuevoAvion.getKmVolados());
			
		}else if (opcion.equalsIgnoreCase("d")) {
			System.out.println(nuevoAvion.getMediakms());
		}
		
		System.out.println(nuevoAvion);
		
		

	}
	
	
	
	public static Avion crearAvionConMenu() {
		System.out.println("1. Crear avión sólo con el identificador.\r\n"
				+ "2. Crear avión con el identificador y la compañía.\n" 
				+ "--------------------------------------------------");
		
		
		int capacidad=0;
		Avion avionCreado=null;
		
		System.out.println("Introduzca una opción");
		
		Scanner sc=new Scanner(System.in);
		int op=Integer.valueOf(sc.nextLine());
		
		if (op==1) {
			System.out.println("Introduzca el identificador del avion");
			String identificador=sc.nextLine();
			System.out.println("Introduzca la capacidad del avion ");
			capacidad=Integer.valueOf(sc.nextLine());
			
			avionCreado=new Avion (identificador, capacidad);
			
		}else if (op==2) {
			System.out.println("Introduzca el identificador del avion");
			String identificador=sc.nextLine();
			System.out.println("Introduzca la compañia del avion ");
			String compania=sc.nextLine();
			System.out.println("Introduzca la capacidad del avion");
			capacidad=Integer.valueOf(sc.nextLine());
			
			avionCreado=new Avion (identificador, compania, capacidad);
			
		}else {
			System.out.println("La opción no es correcta");
		}
		
		
		
		return avionCreado;
	}

}
