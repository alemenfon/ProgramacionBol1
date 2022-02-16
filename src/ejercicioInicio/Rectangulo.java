package ejercicioInicio;

public class Rectangulo {
	
	private Double  longitud;
	private Double ancho;
	
	
	
	
	
	
	
	public Rectangulo() {
		this.longitud=1.0;
		this.ancho=1.0;
		
	}
	
	public Rectangulo (double ancho, double longitud) {
		setAncho (ancho);
		setLongitud(longitud);
		this.ancho=ancho;
		this.longitud=longitud;
			
	}
	
	public Double calcularPerimetro() {
		Double resultado=0.0;
		resultado= 2*(this.ancho+this.longitud);
		return resultado;
	}
	
	
	public Double calcularArea() {
		return this.ancho*this.longitud;
		
	}

	
	
	
	
	private Double getLongitud() {
		return longitud;
	}

	private void setLongitud(Double longitud) {
		if(longitud>0 && longitud<20)
		this.longitud = longitud;
	}

	private Double getAncho() {
		return ancho;
	}

	private void setAncho(Double ancho) {
		if(ancho>0 && ancho<20)
		this.ancho = ancho;
	else {
		throw new RectanguloException("Los datos introducidos son incorrectos");
	}
	}
	
	
	
	
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("El ancho del rectangulo es: ");
		sb.append(getAncho());
		sb.append("\n");
		sb.append("Y su longitud es: ");
		sb.append(getLongitud());
		sb.append("\n");
		sb.append("Y su perimetro es: ");
		sb.append(calcularPerimetro());
		sb.append("\n");
		sb.append("Y su area es: ");
		sb.append(calcularArea());
		
		return sb.toString();
		
		
	}


}
