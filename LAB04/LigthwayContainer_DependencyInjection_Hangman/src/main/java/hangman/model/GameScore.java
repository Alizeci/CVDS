package hangman.model;

public interface GameScore {
	
	/**
	 * Realiza la puntuación del juego Hangman
	 * @pre El sistema actual de puntos inicia en 100 puntos y descuenta 10 puntos cada vez que se tiene una letra incorrecta
	 * @pos Retorna puntaje final del juego.
	 * @param correctCount puntos por bonificación por letras correctas.
	 * @param incorrectCount puntos por penalización por letras incorrectas.
	 * @throws PuntajeInvalidoException el puntaje no es correcto.
 	 */
	default int calculateScore(int correctCount, int incorrectCount) {
		return 0;
	}
	
	
}
