package patrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import patrones.creacionales.factoryMethod.clases.CreadorDocumentoTexto;
import patrones.creacionales.factoryMethod.clases.CreadorHojaCalculo;
import patrones.creacionales.factoryMethod.interfaces.CreadorDocumentos;
import patrones.creacionales.factoryMethod.interfaces.Documento;

@SpringBootApplication
public class PatronesDisenoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatronesDisenoApplication.class, args);
		factoryMethod();
	}

	private static void factoryMethod() {
		// Utilizando un creador de documentos de texto
		CreadorDocumentos creadorTexto = new CreadorDocumentoTexto();
		Documento documentoTexto = creadorTexto.crearDocumento();
		documentoTexto.abrir();
		documentoTexto.cerrar();

		// Utilizando un creador de hojas de cálculo
		CreadorDocumentos creadorHojaCalculo = new CreadorHojaCalculo();
		Documento hojaCalculo = creadorHojaCalculo.crearDocumento();
		hojaCalculo.abrir();
		hojaCalculo.cerrar();
	}

}
