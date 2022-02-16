package ejercicioInicio;

import java.util.Scanner;

public class PrincipalRectangulo {

	public static void main(String[] args) {
		
			
			Rectangulo r1=null;
			
			Scanner sc=new Scanner(System.in);
			while(r1==null) {
				System.out.println("Introduce el ancho ");
				double ancho =Double.valueOf(sc.nextLine());
				System.out.println("Introduce el largo ");
				double largo=Double.valueOf(sc.nextLine());
			
			
		try {
			r1=new Rectangulo(ancho, largo);
		}catch (Exception e) {
			System.out.println("La excepcion no se esperaba");
			}
			}
	}
}
			

			
		// exception es el padre de todos, por debajo no se ejecuta 	
		
			
		
		
		
		
		
		

