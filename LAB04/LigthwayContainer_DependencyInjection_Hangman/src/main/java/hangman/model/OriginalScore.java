package hangman.model;

public class OriginalScore implements GameScore {
	
	/**
	 * Realiza la puntuación del juego Hangman. No se bonifican las letras correctas.
	 * @pre El sistema actual de puntos inicia en 100 puntos y el puntaje mínimo es 0.
	 * @pos Retorna puntaje final del juego.
	 * @param correctCount puntos por bonificación por letras correctas.
	 * @param incorrectCount puntos por penalización por letras incorrectas.
	 * @throws PuntajeInvalidoException el puntaje no es correcto.
 	 */
	@Override
	public int calculateScore(int correctCount, int incorrectCount){
		return 0;
	}
}
