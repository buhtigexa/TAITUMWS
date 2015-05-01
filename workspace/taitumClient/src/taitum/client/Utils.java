package taitum.client;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import ws.taitum.schemas.Address;

public class Utils {

	
	public Utils(){
		
	}
	
	public static void usage() {
	
		
		System.out.println("\n Taitum Usage.");
		System.out.println("java -jar taitum.jar -[option]:");
		System.out.println("[option]");
		System.out.println(" -ts      <contacto_x>     : test demostrativo de algunas funciones. Se requiere su direccion de email para recibir notificaciones; si lo desea, puede utilizar: marcelojavierrodriguez@gmail.com");	
		System.out.println(" -ls                        :lista todas las ofertas publicadas hasta el momento.");
		System.out.println(" -r<x> [data_x] x={d,a,p}   :genera un reporte estadistico de las ofertas actuales. Filtros combinados están soportados en el server, pero no implementados aún.");
		System.out.println(" -s<x> [data_x] x={d,a,p}	:lista las ofertas actualmente publicadas que verifican un criterio determinado.");	
		System.out.println(" -p<x> [data_x] <contacto_x> <ambientes> (<ambientes> sólo si x=o) :publica una oferta o una solicitud de busqueda/notificacion por email al interesado o facilita el contacto con el publicador.");
		
		System.out.println("<x> Puede ser ");
		System.out.println("o : publicar un inmueble disponible.");
		System.out.println("d : distancia en cuadras desde una direccion de un inmueble");
		System.out.println("a : direccion del inmueble publicado.");
		System.out.println("p : precio solicitado por una propiedad, o precio maximo para busquedas.");
		
		System.out.println(" [data_x] ");
		
		System.out.println("data_o:<direccion> <precio>");
		System.out.println("data_d:<direccion> <distanca>");
		System.out.println("data_a:<direccion>");
		System.out.println("data_p:<precio>");
		
		System.out.println("<direccion> : calle,altura,ciudad");
		
		System.out.println("<precio>/<distancia>/<ambientes> : valor entero");
		
		
		System.out.println("<contacto_x> : direccion de email.");
		
		System.out.println("x=o : contacto del locador. ");
		System.out.println("x={d,a,p}: nuestra direccion de email para recibir notificaciones de interes.");
		
		System.out.println("Nota: para simplificar, las busquedas/registos de ofertas por numero de ambientes, o cualquier combinación no están implementadas.");
	}
	
	
	
	public static ws.taitum.schemas.Address parseAddress(String address){
		
		// Address expected format: <street>,<number>,<city>
		
		StringTokenizer tokenizer=new StringTokenizer(address,",:;-");
		ws.taitum.schemas.Address addr=new Address();
		
		// default values
		String street="General Pinto";
		String country="Argentina";
		String state="Buenos Aires";
		String city="Tandil";
		String high="399";
		// build return object
		addr.setState(state);
		addr.setCountry(country);
		addr.setHigh(Integer.parseInt(high));
		
		// assuming that address format is correct
		try{
			street=tokenizer.nextToken();
			high=tokenizer.nextToken();
			city=tokenizer.nextToken();
			addr.setCity(city);
			addr.setStreet(street);
			addr.setHigh(Integer.parseInt(high));
		}
		catch(NumberFormatException |NoSuchElementException e){
			addr=null;
		}
		
		return addr;
	}
}
