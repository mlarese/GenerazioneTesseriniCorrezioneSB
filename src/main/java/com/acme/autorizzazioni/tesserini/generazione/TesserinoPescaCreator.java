package com.acme.autorizzazioni.tesserini.generazione;

import com.acme.autorizzazioni.licenze.LicenzaPesca;
import com.acme.autorizzazioni.servizi.email.AuthorizationFailureException;
import com.acme.autorizzazioni.servizi.email.EmailNotValidException;
import com.acme.autorizzazioni.servizi.email.MailServerNotAvailableException;
import com.acme.autorizzazioni.servizi.email.MissingSubjectAndMessageException;
import com.acme.autorizzazioni.servizi.email.WrongEmailTypeException;
import com.acme.autorizzazioni.tesserini.Tesserino;
import com.acme.autorizzazioni.tesserini.TesserinoFactory;
import com.acme.autorizzazioni.tesserini.WrongTesserinoTypeException;

public class TesserinoPescaCreator {

	public static void create(LicenzaPesca licenza, int annoInCorso) throws WrongTesserinoTypeException, AuthorizationFailureException, WrongEmailTypeException, MissingSubjectAndMessageException, MailServerNotAvailableException, EmailNotValidException {
		Tesserino tesserino =  TesserinoFactory.create(TesserinoFactory.TESSERINO_PESCA);
		tesserino.setAnnoValidita(annoInCorso);
		System.out.println(" tesserino di " + licenza.getTitolare().getCognome() + 
							"  pesca inviato a  " + licenza.getLocalita());
	
		TesserinoSendEmail.send(tesserino, "Pesca");
	
	}
	
}
