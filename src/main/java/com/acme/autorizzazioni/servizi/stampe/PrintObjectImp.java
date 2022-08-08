package com.acme.autorizzazioni.servizi.stampe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class PrintObjectImp implements PrintObject  {
	private String testo;

}
