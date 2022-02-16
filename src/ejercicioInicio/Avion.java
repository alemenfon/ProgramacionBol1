package ejercicioInicio;

public class Avion {
	
	//Atributos
	private  String idAvion;
	private  Integer capacidad;
	private  Integer numVuelos=0;
	private  double kmVolados=0.0;
	private String compania;
	
	
	//Constructores
	
	public Avion(String id, Integer capacidad) {
		this.idAvion=id;
		this.capacidad=capacidad;
	}
	
	public Avion (String id, String compania,Integer capacidad) {
		this.idAvion=id;
		this.compania=compania;
		this.capacidad=capacidad;
	}
	
	//metodos
	public boolean asignarVuelo(int viajeros, double km) {
		boolean posibleAsignarVuelo=false;
		
		if (viajeros<= this.capacidad) {
			this.kmVolados+=km;
			this.numVuelos++;
			posibleAsignarVuelo=true;
			
		}
		return posibleAsignarVuelo;
		
		}
	
	public Double getMediakms() {
		double resultado=0;
		if (numVuelos>0) {
		resultado= kmVolados/numVuelos;
		
	}
		return resultado;
	}
	
	
	
	
	//Setter y getter

	private String getIdAvion() {
		return idAvion;
	}

	private void setIdAvion(String idAvion) {
		this.idAvion = idAvion;
	}
	
	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	
	
	private Integer getCapacidad() {
		return capacidad;
	}

	
	public Integer getNumVuelos() {
		return numVuelos;
	}

	private void setNumVuelos(Integer numVuelos) {
		this.numVuelos = numVuelos;
	}

	public double getKmVolados() {
		return kmVolados;
	}

	private void setKmVolados(double kmVolados) {
		this.kmVolados = kmVolados;
	}

	private String getCompania() {
		return compania;
	}

	
	
	

	
	

	






}



	

	


