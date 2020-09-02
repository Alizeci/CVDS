package hagman.model;

import static org.junit.Assert.*;

import org.junit.Test;

import hangman.model.OriginalScore;


public class GameScoreTest {
	
	OriginalScore modelo1 = new OriginalScore();
	int puntajeFinal = 100;
	/**
	 * Clase de Equivalencia OriginalScore
	 * válida: El puntaje final debe ser mayor o igual a 0 && menor o igual a 100.
	 * negativo: El puntaje es menor a 0.
	 * inválido: Los parámetros son negativos.
	 * Condición de frontera: El 0 que es el puntaje mínimo && el 100 que es el puntaje máximo.
	 */
	@Test
	public void validateValidOriginalScore() {
		//válido
		puntajeFinal = modelo1.calculateScore(0,80);
		assertEquals(puntajeFinal, 20);
		
		//negativo
		puntajeFinal = modelo1.calculateScore(0,110);
		assertEquals(puntajeFinal, 0);
		
		//inválido
		try {puntajeFinal = modelo1.calculateScore(-5, -20);}catch (Exception e) {}
		
		//frontera
		puntajeFinal = modelo1.calculateScore(0,0);
		assertEquals(puntajeFinal, 100);
		
		puntajeFinal = modelo1.calculateScore(0,100);
		assertEquals(puntajeFinal, 0);
		
	}
	
	/**
	 * Clase de Equivalencia BonusScore
	 * válida: El puntaje final debe ser mayor o igual a 0.
	 * negativo: El puntaje es menor a 0.
	 * inválido: Los parámetros son negativos.
	 * Condición de frontera: El 0 que es el puntaje mínimo.
	 */
	@Test
	public void validateValidBonusScore() {
		fail("Not yet implemented");
	}
	
	/**
	 * Clase de Equivalencia PowerScore
	 * válida: El puntaje final debe ser mayor o igual a 0 && menor o igual a 500.
	 * puntaje negativo: El puntaje final es menor a 0.
	 * inválido: Los parámetros son negativos.
	 * sobrepasa puntaje: El puntaje final es mayor a 500.
	 * Condición de frontera: El 0 que es el puntaje mínimo && el 500 que es el puntaje máximo.
	 */
	@Test
	public void validateValidPowerScore() {
		fail("Not yet implemented");
	}

}
