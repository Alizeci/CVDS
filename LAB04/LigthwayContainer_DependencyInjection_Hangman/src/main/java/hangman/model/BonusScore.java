package hangman.model;

public class BonusScore implements GameScore {

	/**
	 * Realiza la puntuación del juego Hangman. Se bonifica con 10 puntos por letra correcta. Penaliza con 10 puntos por letra incorrecta
	 * @pre El sistema actual de puntos inicia en 0 puntos y el puntaje mínimo es 0. La puntuación por bonificación debe ser mayor a la de penalización
	 * @pos Retorna puntaje final del juego.
	 * @param correctCount puntos por bonificación por letras correctas.[0,+)
	 * @param incorrectCount puntos por penalización por letras incorrectas.[0,+)
	 * @throws PuntajeInvalidoException el puntaje no es correcto.
 	 */
	@Override
	public int calculateScore(int correctCount, int incorrectCount){
		int puntajeFinal = 0;
		if((incorrectCount >= 0 && correctCount >= 0) && (correctCount*10 >= incorrectCount*5))  {
			puntajeFinal = correctCount*10 - incorrectCount*5;
		}
		
		return puntajeFinal;
	}
}
