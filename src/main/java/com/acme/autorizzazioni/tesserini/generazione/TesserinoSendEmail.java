package com.acme.autorizzazioni.tesserini.generazione;

import com.acme.autorizzazioni.servizi.email.AuthorizationFailureException;
import com.acme.autorizzazioni.servizi.email.Email;
import com.acme.autorizzazioni.servizi.email.EmailFactory;
import com.acme.autorizzazioni.servizi.email.EmailNotValidException;
import com.acme.autorizzazioni.servizi.email.EmailService;
import com.acme.autorizzazioni.servizi.email.EmailServiceFactory;
import com.acme.autorizzazioni.servizi.email.MailServerNotAvailableException;
import com.acme.autorizzazioni.servizi.email.MissingSubjectAndMessageException;
import com.acme.autorizzazioni.servizi.email.WrongEmailTypeException;
import com.acme.autorizzazioni.tesserini.Tesserino;

public class TesserinoSendEmail {

	public static void send(Tesserino tesserino,String tipoTesserino) throws AuthorizationFailureException, WrongEmailTypeException, MissingSubjectAndMessageException, MailServerNotAvailableException, EmailNotValidException {
		EmailService googleEmailServer = EmailServiceFactory.create(EmailServiceFactory.GOOGLE_EMAIL);
		
		Email mail = EmailFactory.create(tesserino.getLicenza().getTitolare().getEmail(), 
				"Le comunichiamo di aver provveduto all'invio del suo tesserino " + tipoTesserino, 
				"Notifica di avvenuto invio del Tesserino " + tipoTesserino);
		googleEmailServer.send(mail);
	}

}
