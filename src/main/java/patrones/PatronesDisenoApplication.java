package patrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import patrones.creacionales.factoryMethod.clases.CreadorDocumentoTexto;
import patrones.creacionales.factoryMethod.clases.CreadorHojaCalculo;
import patrones.creacionales.factoryMethod.interfaces.CreadorDocumentos;

import patrones.creacionales.factoryMethod.interfaces.DocumentoFM;
import patrones.creacionales.factorySimple.clases.DocumentoFactory;
import patrones.creacionales.factorySimple.interfaces.Documento;

import java.sql.SQLOutput;

@SpringBootApplication
public class PatronesDisenoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatronesDisenoApplication.class, args);
		factorySimple();
		factoryMethod();
	}

	private static void factorySimple() {
		System.out.println("---- FACTORY SIMPLE ----");
		DocumentoFactory documentoFactory = new DocumentoFactory();
		Documento documentoTexto = documentoFactory.crearDocumento("texto");
		Documento hojaCalculo = documentoFactory.crearDocumento("calculo");
		documentoTexto.abrir();
		documentoTexto.cerrar();
		hojaCalculo.abrir();
		hojaCalculo.cerrar();
	}

	private static void factoryMethod() {
		System.out.println("---- FACTORY METHOD ----");
		// Utilizando un creador de documentos de texto
		CreadorDocumentos creadorTexto = new CreadorDocumentoTexto();
		DocumentoFM documentoTexto = creadorTexto.crearDocumento();
		documentoTexto.abrir();
		documentoTexto.cerrar();

		// Utilizando un creador de hojas de cálculo
		CreadorDocumentos creadorHojaCalculo = new CreadorHojaCalculo();
		DocumentoFM hojaCalculo = creadorHojaCalculo.crearDocumento();
		hojaCalculo.abrir();
		hojaCalculo.cerrar();
	}

}
