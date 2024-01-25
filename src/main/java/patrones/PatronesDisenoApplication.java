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
import patrones.creacionales.prototype.clases.Persona;
import patrones.creacionales.prototype.interfaces.Prototype;
import patrones.creacionales.singleton.ConfiguracionGlobal;
import patrones.estructurales.adapter.clases.ZombieAdapter;
import patrones.estructurales.bridge.clases.*;
import patrones.estructurales.bridge.interfaces.Dibujo;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class PatronesDisenoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatronesDisenoApplication.class, args);
		System.out.println();
		System.out.println("---- CREACIONALES ----");
		factorySimple();
		factoryMethod();
		abstractFactory();
		builder();
		prototype();
		singleton();

		System.out.println();
		System.out.println("---- ESTRUCTURALES ----");
		adapter();
		bridge();
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

	private static void prototype(){
		System.out.println();
		System.out.println("---- PROTOTYPE ----");

		// Crear un mapa de prototipos
		Map<String, Prototype> mapaPrototipos = new HashMap<>();

		// Inicializar prototipos y agregar al mapa
		mapaPrototipos.put("persona", new Persona("Juan", 30));

		// Obtener un prototipo y realizar clonación
		Prototype personaClonada = mapaPrototipos.get("persona").clonar();

		// Mostrar detalles del objeto clonado
		((Persona) personaClonada).mostrarDetalles();
	}

	private static void singleton(){
		System.out.println();
		System.out.println("---- SINGLETON ----");

		// Obtener la instancia única de ConfiguracionGlobal
		ConfiguracionGlobal configuracion = ConfiguracionGlobal.obtenerInstancia();

		// Acceder y modificar la configuración
		System.out.println("Idioma actual: " + configuracion.getIdioma());
		System.out.println("Máximo de conexiones: " + configuracion.getMaximoConexiones());

		// Modificar la configuración
		configuracion.setIdioma("en");
		configuracion.setMaximoConexiones(20);

		// Acceder nuevamente a la configuración
		System.out.println("Idioma actualizado: " + configuracion.getIdioma());
		System.out.println("Nuevo máximo de conexiones: " + configuracion.getMaximoConexiones());
	}

	private static void adapter(){
		System.out.println();
		System.out.println("---- ADAPTER ----");

		ZombieAdapter zombie = new ZombieAdapter();
		zombie.ataque();
		zombie.dano();
	}

	private static void bridge(){
		System.out.println();
		System.out.println("---- BRIDGE ----");

		// Creamos instancias de implementaciones concretas de Dibujo
		Dibujo dibujoEnVentana = new DibujoEnVentana();
		Dibujo dibujoEnArchivo = new DibujoEnArchivo();

		// Creamos instancias de abstracciones refinadas utilizando las implementaciones concretas
		Forma formaEnVentana = new Cuadrado(dibujoEnVentana, 20);
		Forma formaEnArchivo = new Circulo(dibujoEnArchivo, 20);

		// Llamamos a los métodos de dibujo de las formas
		formaEnVentana.dibujar();
		formaEnArchivo.dibujar();
	}
}
