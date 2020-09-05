/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;

import hangman.model.BonusScore;

/**
 *
 * @author 2106913
 */


import hangman.model.*;
import hangman.model.dictionary.HangmanDictionary;
import hangman.model.dictionary.*;
import hangman.view.*;

public class HangmanFactoryServices extends com.google.inject.AbstractModule {

    @Override
    protected void configure() {
        /* Guice dependency injection */
        // bind(Interface.class).to(Concrete.class);
    	bind (Language.class).to(French.class);
		bind (HangmanDictionary.class).to(SpanishDictionaryDataSource.class);
		bind (HangmanPanel.class).to(HangmanColoridoPanel.class);
		bind (GameScore.class).to(PowerScore.class);
    }
   
}
   


