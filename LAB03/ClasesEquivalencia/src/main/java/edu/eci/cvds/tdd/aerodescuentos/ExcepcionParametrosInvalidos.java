package edu.eci.cvds.tdd.aerodescuentos;


public class ExcepcionParametrosInvalidos extends Exception{
	public final static String tarifaBase = "tarifa base negativa";
	public final static String diasDeAntelacion = "dias te antelacion negativo";
	public final static String Edad = "edad invalida :(";
	
	public ExcepcionParametrosInvalidos(String mmsg) {
			super(mmsg);
		
	}
	
	
}
