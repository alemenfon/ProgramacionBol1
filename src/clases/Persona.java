package clases;

public class Persona {
	//atributos
	private String nombre="nonmbre_por_defecto";
	private String apellidos="apellidos_por_defecto";
	private int edad;
	private double altura;
	String dni;
	
	

	
	
	
	//constructor. Todos se llaman exactamente igual que la clase en MAYUSCULA.
	public Persona() {
		apellidos="apellido vacio";
		nombre="nombre vacio";
		edad=18;
		altura=1.70;
		
	
	}
	 //metodo
		public void Persona() {
			return;
		
			
		}
	
	
	

	public Persona (String name, String apellidos, int age, double height) {
		if(!name.isEmpty()) {
			this.nombre=name;
			
		}
		if(!apellidos.isEmpty()) {
			this.apellidos=apellidos;
		}
		
		edad=age;
		altura=height;
		
		
		
	}
	
	//getter y setter
	
	public void setEdad(int edad) {
		this.edad=edad;
		
	}
}
