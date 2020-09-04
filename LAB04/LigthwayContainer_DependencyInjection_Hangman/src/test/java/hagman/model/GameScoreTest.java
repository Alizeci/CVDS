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
	 * válida: El parámetro incorrectCount es mayor o igual a 0 y menor o igual a 10.
	 * Condición de frontera: El 0 que es el mínimo numero de letras incorrectas && 10 que es el máximo numero de letras incorrectas.
	 */
	@Test
	public void validateValidOriginalScore() {
		puntajeFinal = originalScore.calculateScore(0,0);
		assertEquals(puntajeFinal, 100);
		
		puntajeFinal = originalScore.calculateScore(0,10);
		assertEquals(puntajeFinal, 0);
		
		puntajeFinal = originalScore.calculateScore(0,5);
		assertEquals(puntajeFinal, 50);
		
		puntajeFinal = originalScore.calculateScore(8,0);
		assertEquals(puntajeFinal, 100);
		
	}
	
	/**
	 * Clase de Equivalencia OriginalScore #2
	 * inválido: El parametro incorrectCount es menor a 0 o mayor a 10.
	 * Condición de frontera: El 0 que es el mínimo numero de letras incorrectas && 10 que es el máximo numero de letras incorrectas.
	 */
	@Test
	public void validateInvalidOriginalScore(){
		puntajeFinal = originalScore.calculateScore(0,-1);
		assertEquals(puntajeFinal, 100);
		
		puntajeFinal = originalScore.calculateScore(0,11);
		assertEquals(puntajeFinal, 100);
	}
	
	/**
	 * Clase de Equivalencia BonusScore #1
	 * válida: El parametro incorrectCount es mayor o igual a 0 && El parametro correctCount es mayor o igual a 0. 
	 * Condición de frontera: El 0 que es el puntaje mínimo.
	 */
	@Test
	public void validateValidBonusScore() {
		puntajeFinal = bonusScore.calculateScore(0,0);
		assertEquals(puntajeFinal, 0);
		puntajeFinal = bonusScore.calculateScore(1,2);
		assertEquals(puntajeFinal, 0);
	}
	
	/**
	 * Clase de Equivalencia BonusScore #2
	 * inválido: Los parámetros son menores a 0. El penalización supera la bonificación.
	 * Condición de frontera: El 0 que es el puntaje mínimo.
	 */
	@Test
	public void validateInvalidBonusScore() {
		puntajeFinal = bonusScore.calculateScore(-1,-1);
		assertEquals(puntajeFinal, 0);
		puntajeFinal = bonusScore.calculateScore(0,-1);
		assertEquals(puntajeFinal, 0);
		puntajeFinal = bonusScore.calculateScore(0,1);
		assertEquals(puntajeFinal, 0);
		puntajeFinal = bonusScore.calculateScore(1,3);
		assertEquals(puntajeFinal, 0);
		puntajeFinal = bonusScore.calculateScore(3,7);
		assertEquals(puntajeFinal, 0);

	}
	
	/**
	 * Clase de Equivalencia PowerScore #1
	 * válida: El puntaje final es mayor o igual a 0 && menor o igual a 500 && Los parametros son mayores o iguales a 0 &&
	 * La bonificación es igual o mayor a la penalización.
	 * Condición de frontera: El 0 que es el puntaje mínimo && 500 que es el puntaje máximo.
	 */
	@Test
	public void validateValidPowerScore() {
		puntajeFinal = powerScore.calculateScore(0,0);
		assertEquals(puntajeFinal, 0);
		puntajeFinal = powerScore.calculateScore(3,19);
		assertEquals(puntajeFinal, 3);
		puntajeFinal = powerScore.calculateScore(2,3);
		assertEquals(puntajeFinal, 6);
		puntajeFinal = powerScore.calculateScore(2,2);
		assertEquals(puntajeFinal, 14);
		puntajeFinal = powerScore.calculateScore(4,35);
		assertEquals(puntajeFinal, 500);
	}
	
	/**
	 * Clase de Equivalencia PowerScore #2
	 * puntaje negativo: El puntaje final es menor a 0.
	 * inválido: Los parámetros son negativos. La bonificación es menor a la penalización.
	 * sobrepasa puntaje: El puntaje final es mayor a 500.
	 * Condición de frontera: El 0 que es el puntaje mínimo && 500 que es el puntaje máximo.
	 */
	@Test
	public void validateInvalidPowerScore() {
		//puntaje negativo
		puntajeFinal = powerScore.calculateScore(0,1);
		assertEquals(puntajeFinal, 0);
		
		//invalido
		puntajeFinal = powerScore.calculateScore(1,2);
		assertEquals(puntajeFinal, 0);
		puntajeFinal = powerScore.calculateScore(-1,-1);
		assertEquals(puntajeFinal, 0);
		
		//puntaje sobrepasa 500
		puntajeFinal = powerScore.calculateScore(4,34);
		assertEquals(puntajeFinal, 500);
	}

}
