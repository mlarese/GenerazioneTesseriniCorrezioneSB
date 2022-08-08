package com.acme.autorizzazioni.tesserini.generazione;

import com.acme.autorizzazioni.licenze.LicenzaCaccia;
import com.acme.autorizzazioni.licenze.LicenzaFactory;
import com.acme.autorizzazioni.licenze.WrongLicenzeTypeException;
import com.acme.autorizzazioni.licenze.titolari.TitolareLicenzaFactory;
import com.acme.autorizzazioni.persone.Persona;
import com.acme.autorizzazioni.licenze.LicenzaCaccia;

public class MainTestTesserinoCacciaCreator {

	public static void main(String[] args) {
		
		
		LicenzaCaccia lc ;
		Persona p;
		
		try {
			lc = (LicenzaCaccia) LicenzaFactory.create(LicenzaFactory.LICENZA_DI_CACCIA);
		
			p = TitolareLicenzaFactory.create();
			lc.setTitolare(p);
			lc.setAnnoDiScadenza(2012);
			lc.setAtc("Col fosco");
			TesserinoCacciaCreator.create(lc, 2022);
			
		} catch (Exception e) {
			System.err.println( e.getMessage());
		}

	}

}
