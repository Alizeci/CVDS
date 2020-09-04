package hangman.model;

public class OriginalScore implements GameScore {
	int puntajeInicial = 100;
	int puntajeFinal = puntajeInicial;
	
	/**
	 * Realiza la puntuación del juego Hangman. No se bonifican las letras correctas.
	 * @pre El sistema actual de puntos inicia en 100 puntos y el puntaje mínimo es 0. Se penaliza 10 puntos con cada letra incorrecta
	 * @pos Retorna puntaje final del juego.
	 * @param correctCount puntos por bonificación por letras correctas. No hay bonificación.
	 * @param incorrectCount puntos por penalización por letras incorrectas.
	 * @throws PuntajeInvalidoException el puntaje no es correcto.
 	 */
	@Override
	public int calculateScore(int correctCount, int incorrectCount){
		
		if(incorrectCount >= 0 && incorrectCount <= 10) {
			puntajeFinal = puntajeInicial - incorrectCount*10;
		}
		
		return puntajeFinal;
	}
}
