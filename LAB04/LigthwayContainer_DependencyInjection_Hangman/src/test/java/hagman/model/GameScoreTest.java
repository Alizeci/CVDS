package hagman.model;

import static org.junit.Assert.*;

import org.junit.Test;

import hangman.model.BonusScore;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;


public class GameScoreTest {
	
	OriginalScore originalScore = new OriginalScore();
	BonusScore bonusScore = new BonusScore();
	PowerScore powerScore = new PowerScore();	
	int puntajeFinal;
	
	/**
	 * Clase de Equivalencia OriginalScore #1
	 * válida: El puntaje final y parámetro incorrectCount son mayores o iguales a 0 && menores o iguales a 100.
	 * Condición de frontera: El 0 que es el puntaje mínimo && 100 que es el puntaje máximo.
	 */
	@Test
	public void validateValidOriginalScore() {
		puntajeFinal = originalScore.calculateScore(0,0);
		assertEquals(puntajeFinal, 0);
		
		puntajeFinal = originalScore.calculateScore(0,100);
		assertEquals(puntajeFinal, 100);
		
		puntajeFinal = originalScore.calculateScore(0,80);
		assertEquals(puntajeFinal, 20);
	}
	
	/**
	 * Clase de Equivalencia OriginalScore #2
	 * negativo: El puntaje final es menor a 0.
	 * inválido: El parametro incorrectCount es negativo y el parámetro correctCount ≠ 0.
	 * Condición de frontera: El 0 que es el puntaje mínimo && 100 que es el puntaje máximo.
	 */
	@Test
	public void validateInvalidOriginalScore() {

		//parámetros negativos
		try{
			puntajeFinal = originalScore.calculateScore(-1,-1);
		} catch(Exception e) {}
		try{
			puntajeFinal = originalScore.calculateScore(0,-100);
		} catch(Exception e) {}
		try{
			puntajeFinal = originalScore.calculateScore(0,-1);
		} catch(Exception e) {}

		//parámetro correctCount ≠ 0
		try{
			puntajeFinal = originalScore.calculateScore(-1,101);
		}	catch(Exception e) {}
		try{
			puntajeFinal = originalScore.calculateScore(-1,80);
		}	catch(Exception e) {}		
		try{
			puntajeFinal = originalScore.calculateScore(101,0);
		}	catch(Exception e) {}
		
	}
	
	/**
	 * Clase de Equivalencia BonusScore #1
	 * válida: El puntaje final y parámetros son mayores o iguales a 0.
	 * Condición de frontera: El 0 que es el puntaje mínimo.
	 */
	@Test
	public void validateValidBonusScore() {
		puntajeFinal = bonusScore.calculateScore(10,5);
		assertEquals(puntajeFinal, 5);
		puntajeFinal = bonusScore.calculateScore(40,15);
		assertEquals(puntajeFinal, 25);
		puntajeFinal = bonusScore.calculateScore(0,0);
		assertEquals(puntajeFinal, 0);
	}
	
	/**
	 * Clase de Equivalencia BonusScore #2
	 * negativo: El puntaje es menor a 0.
	 * inválido: Los parámetros son negativos.
	 * Condición de frontera: El 0 que es el puntaje mínimo.
	 */
	@Test
	public void validateInvalidBonusScore() {
		//puntaje negativo
		try{
			puntajeFinal = bonusScore.calculateScore(10,15);
		} catch(Exception e) {}
		try{
			puntajeFinal = bonusScore.calculateScore(0,5);
		} catch(Exception e) {}
		try{
			puntajeFinal = bonusScore.calculateScore(0,-1);
		} catch(Exception e) {}
		
		//parámetros negativos
		try{
			puntajeFinal = bonusScore.calculateScore(-10,0);
		} catch(Exception e) {}
		try{
			puntajeFinal = bonusScore.calculateScore(-1,1);
		} catch(Exception e) {}
		try{
			puntajeFinal = bonusScore.calculateScore(-1,-1);
		} catch(Exception e) {}
	}
	
	/**
	 * Clase de Equivalencia PowerScore #1
	 * válida: El puntaje final y parámetros son mayores o iguales a 0 && menores o iguales a 500.
	 * Condición de frontera: El 0 que es el puntaje mínimo && 500 que es el puntaje máximo.
	 */
	@Test
	public void validateValidPowerScore() {
		puntajeFinal = powerScore.calculateScore(5,0);
		assertEquals(puntajeFinal, 5);
		puntajeFinal = powerScore.calculateScore(500,500);
		assertEquals(puntajeFinal, 0);
		puntajeFinal = powerScore.calculateScore(0,0);
		assertEquals(puntajeFinal, 0);
	}
	
	/**
	 * Clase de Equivalencia PowerScore #2
	 * puntaje negativo: El puntaje final es menor a 0.
	 * inválido: Los parámetros son negativos.
	 * sobrepasa puntaje: El puntaje final es mayor a 500.
	 * Condición de frontera: El 0 que es el puntaje mínimo && 500 que es el puntaje máximo.
	 */
	@Test
	public void validateInvalidPowerScore() {
		//puntaje negativo
		try{
			puntajeFinal = powerScore.calculateScore(0,1);
		} catch(Exception e) {}
		try{
			puntajeFinal = powerScore.calculateScore(5,8);
		} catch(Exception e) {}
		
		//parámetros negativos
		try{
			puntajeFinal = powerScore.calculateScore(-10,0);
		} catch(Exception e) {}
		try{
			puntajeFinal = powerScore.calculateScore(-1,1);
		} catch(Exception e) {}
		try{
			puntajeFinal = powerScore.calculateScore(-1,-1);
		} catch(Exception e) {}
		
		//sobrepasa el puntaje
		try{
			puntajeFinal = powerScore.calculateScore(501,0);
		} catch(Exception e) {}
	}

}
