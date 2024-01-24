package patrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import patrones.creacionales.abstractFactory.clases.FabricaMueblesClasicos;
import patrones.creacionales.abstractFactory.clases.FabricaMueblesModernos;
import patrones.creacionales.abstractFactory.interfaces.FabricaMuebles;
import patrones.creacionales.abstractFactory.interfaces.Mesa;
import patrones.creacionales.abstractFactory.interfaces.Silla;
import patrones.creacionales.builder.clases.Enemigo;
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
		abstractFactory();
		builder();
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
		System.out.println();
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

	private static void abstractFactory() {
		System.out.println();
		System.out.println("---- ABSTRACT FACTORY ----");
		// Utilizando la fábrica abstracta de muebles modernos
		FabricaMuebles fabricaModerna = new FabricaMueblesModernos();
		Silla sillaModerna = fabricaModerna.crearSilla();
		Mesa mesaModerna = fabricaModerna.crearMesa();

		System.out.println("Construyendo muebles modernos:");
		sillaModerna.construir();
		mesaModerna.construir();

		System.out.println();

		// Utilizando la fábrica abstracta de muebles clásicos
		FabricaMuebles fabricaClasica = new FabricaMueblesClasicos();
		Silla sillaClasica = fabricaClasica.crearSilla();
		Mesa mesaClasica = fabricaClasica.crearMesa();

		System.out.println("Construyendo muebles clásicos:");
		sillaClasica.construir();
		mesaClasica.construir();
	}

	private static void builder(){
		System.out.println();
		System.out.println("---- BUILDER ----");
		Enemigo enemigo = Enemigo.builder()
				.nombre("pepe")
				.tipo("malo")
				.salud(100)
				.daño(100)
				.resistencia(100)
				.build();
		System.out.println(enemigo.toString());
	}
}
