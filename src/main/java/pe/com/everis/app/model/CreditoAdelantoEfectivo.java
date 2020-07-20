package pe.com.everis.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="CreditoAdelantoEfectivo")
public class CreditoAdelantoEfectivo {

	@Id
	private String idCreditoAdelantoEfectivo;
}
