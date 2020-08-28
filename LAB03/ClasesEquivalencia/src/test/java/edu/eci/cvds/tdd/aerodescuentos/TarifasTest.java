package edu.eci.cvds.tdd.aerodescuentos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TarifasTest {
	CalculadorDescuentos tarifa = new CalculadorDescuentos();
	
	@Test
	public void validartarifainvalida() {
			try {double tarifaAnciano = tarifa.calculoTarifa(-55, 12 ,16);}catch (Exception e) {}		
	}
	
	@Test
	public void validartarDiaAntelacionNegativo() {
			try {double tarifaAnciano = tarifa.calculoTarifa(200, -4,44);}catch (Exception e) {}		
	}
	
	@Test
	public void validaTarifaAnciano() {
			double tarifaAnciano = tarifa.calculoTarifa(200	, 4 , 69);
			double res = 184.0;
			assertEquals(res, tarifaAnciano, 0);
	}
	
	@Test
	public void validartarEdadNegativo() {
			try {double tarifaAnciano = tarifa.calculoTarifa(120, 8,-12);}catch (Exception e) {}		
	}
	
	@Test
	public void validaTarifaMenorEdad() {
			double tarifaMenor = tarifa.calculoTarifa(120, 11,16);
			double res = 114.0;
			assertEquals(res, tarifaMenor, 0);
	}
	
	@Test
	public void validaTarifaAncianoConDiasAntelacion() {
			double tarifaAnciano = tarifa.calculoTarifa(120, 44,72);
			double res = 92.4;
			assertEquals(res, tarifaAnciano, 0);
	}

}