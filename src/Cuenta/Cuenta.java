package Cuenta;

public class Cuenta {
	private Integer saldo=0;
	private Integer ingresos=0;
	private Integer reintegros=0;
	
	
	public void reintegro(int reintegro) {
		if (reintegro > 0 && reintegro <= this.saldo) {	
			this.reintegros  ++;
			this.saldo -= reintegro;
		}
		else if (reintegros > this.saldo) {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void ingreso(int ingreso) {	
		if (ingreso > 0) {
			this.ingresos ++;
			this.saldo += ingreso;
		}
		
	}
	
	
	
	public void consultaSaldo() {
		System.out.println("Saldo: " + this.saldo + " euros. \n"
						+"Ingresos: " + this.ingresos 
						+"Reintegros: " + this.reintegros);
	}
	
	
	
	
	public Integer getSaldo() {
		return saldo;
	}
	public Integer getintegros() {
		return reintegros;
	}
	public Integer getingresos() {
		return ingresos;
	}
	
	
	public void setSaldo(Integer saldoInicial) {
		this.saldo = saldoInicial;
	}
}

	
	
	
	
	
	
	
	
	
	
	
	

	