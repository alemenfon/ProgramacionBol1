package clases;

public class principal {

	public static void main(String[] args) {
		Persona antonio= new Persona("Antonio","sevillano");
		Persona maria=new Persona();
		
		
		antonio.altura=2;
		antonio.edad=18;
		antonio.nombre="Antonio";
		antonio.apellidos="sevillano";
		
		
		maria.altura=2;
		maria.edad=18;
		maria.nombre="Antonio";
		antonio.apellidos="sevillano";
		
		System.out.println(antonio.getNombre());

	}

}
