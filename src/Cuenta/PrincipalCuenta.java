package Cuenta;

import java.util.Scanner;

public class PrincipalCuenta {
	
	private static Scanner sc=new Scanner(System.in);
	

	public static void main(String[] args) {
		
		Cuenta cuenta1=null;
		System.out.println("Con qué saldo quieres abrir la cuenta");
		Double saldoInicial =Double.valueOf(sc.nextLine());
		
		cuenta1=new Cuenta(saldoInicial);
		System.out.println(cuenta1);
		
		

}
}