package hangman.model;

public class PowerScore implements GameScore{
	/**
	 * Realiza la puntuación del juego Hangman. La i-esima letra correcta se bonifica con 5^i-esima.
	 * Penaliza con 8 puntos por letra incorrecta. Si sobrepasa el máximo puntaje se queda con el máximo.
	 * @pre El sistema actual de puntos inicia en 0 puntos, el puntaje mínimo es 0 y el puntaje máximo es 500.
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
