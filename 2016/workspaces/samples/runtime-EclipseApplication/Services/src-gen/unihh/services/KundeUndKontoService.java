package unihh.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/KundeUndKonto")
public class KundeUndKontoService {
	@RequestMapping(value = "/info", method = RequestMethod.GET, produces = "application/json")
	public String versionInfo() {
		return "some version here";
	}
	
	@RequestMapping(value = "/Kunde/{id}", method = RequestMethod.GET, produces = "application/json")
	public String getKunde(@PathVariable("id") Integer id) {
		return "value for Kunde with id '"+id+"' from database";
	}
	
	@RequestMapping(value = "/Konto/{id}", method = RequestMethod.GET, produces = "application/json")
	public String getKonto(@PathVariable("id") Integer id) {
		return "value for Konto with id '"+id+"' from database";
	}
	
}
