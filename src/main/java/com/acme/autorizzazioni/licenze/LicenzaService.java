package com.acme.autorizzazioni.licenze;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicenzaService {
	@Autowired
	private LicenzaRepository repo;
	
	public void inserisciLicenza(Licenza l) {
		
		repo.save(()l);
		
	}

}
