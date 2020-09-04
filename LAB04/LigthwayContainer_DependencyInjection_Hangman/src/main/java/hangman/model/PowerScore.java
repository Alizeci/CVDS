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
		int puntajeFinal = 0;
		int bonificacion = 0;
		int penalizacion = 0;
		
		if(incorrectCount >= 0 && correctCount > 0)  {
			for (int i = 1; i < correctCount+1; i++) {
				bonificacion += Math.pow(5, i);
		    }
			penalizacion = incorrectCount * 8;
		
			if(bonificacion >= penalizacion && (bonificacion - penalizacion) >= 0 && (bonificacion - penalizacion) <= 500){
				puntajeFinal = bonificacion - penalizacion;
			}
			else if(bonificacion >= penalizacion && (bonificacion - penalizacion) > 500){
				puntajeFinal = 500;
			}
		}
		return puntajeFinal;
	}
}
