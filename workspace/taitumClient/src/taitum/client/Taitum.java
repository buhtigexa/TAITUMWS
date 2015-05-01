package taitum.client;
import java.util.List;

import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.SOAPFaultException;

import taitum.buildoptions.Set;
import taitum.buildoptions.SetComposite;
import taitum.buildoptions.SetContact;
import taitum.buildoptions.SetDistance;
import taitum.buildoptions.SetNothing;
import taitum.buildoptions.SetPrice;
import taitum.buildoptions.SetRooms;
import taitum.menubuilder.PMenuBuilder;
import taitum.menubuilder.TMenuBuiler;
import ws.taitum.definitions.Taitumws;
import ws.taitum.definitions.Taitumws_Service;
import ws.taitum.definitions.UnssuportedFilter;
import ws.taitum.schemas.Ad;
import ws.taitum.schemas.AdType;
import ws.taitum.schemas.Address;
import ws.taitum.schemas.EventDescription;

		
public class Taitum {

	
	protected Taitumws_Service stub;
	protected Taitumws service;
	protected Integer squareDistance=10;
	
	public Taitum(){
			
		stub=new Taitumws_Service();
		service=stub.getTaitumws();
	}

	public ws.taitum.schemas.Address createAddress(){
	
		ws.taitum.schemas.Address addr=new Address();
		// default values
		String street="General Pinto";
		String country="Argentina";
		String state="Buenos Aires";
		String city="Tandil";
		String high="399";
		// build return object
		addr.setCountry(country);
		addr.setHigh(Integer.parseInt(high));
		addr.setCity(city);
		addr.setStreet(street);
		addr.setState(state);
		return addr;
	}
	
	
	protected void getReport(ws.taitum.schemas.Ad ad, ws.taitum.schemas.AdType adType) {
	
		ws.taitum.schemas.Report report;
		try {
				report = service.getReport(ad, adType);
				List<ws.taitum.schemas.EventDescription> info= report.getEvents();
				for (EventDescription e:info){
					String description=e.getDescription();
					float prob=e.getProbability();
					System.out.println(description + " : "  +  prob);
				}
		} catch (UnssuportedFilter | SOAPFaultException e) {
				System.out.println("El la categoria de busqueda/registro aún no está disponible . No se generará el reporte solicitado.");
			
		}
		
	}

   protected void showAllAds(){
		
		System.out.println("\n Publicaciones hasta el momento:  \n");
		try {
			ws.taitum.schemas.Ads ads = service.getAds();
			print(ads);
		} catch (SOAPFaultException  e) {
			System.out.println("No hay publicaciones hasta el momento.");
		}
		
	}
	
	protected void search(ws.taitum.schemas.Ad ad,ws.taitum.schemas.AdType adType){

		
		try {
			ws.taitum.schemas.Ads ads = service.search(ad,adType);
			print(ads);
		} catch (SOAPFaultException | UnssuportedFilter e) {
			System.out.println(e.getMessage());
		}

		
	}
	
	protected void print(ws.taitum.schemas.Ads ads){
		
		if (ads.getAd()!=null){
			for (ws.taitum.schemas.Ad ad:ads.getAd()){
			System.out.println( ad.getContact() +  " ofrece: "  + ad.getRooms() +  " ambientes, en:  "  + ad.getAddress().getCity() + "," + ad.getAddress().getStreet() + " " +  ad.getAddress().getHigh()  + " por :$" + ad.getPrice());
			}
		System.out.println("");
		}
	
	}

	
	public void test(String email){
		
		String emailAddr=new String();
		if (email.length()>1){
			emailAddr=email;
			System.out.println("Se enviarán noficaciones a: "  + emailAddr );
		}
		else {
			System.out.println("No se ha ingresado una dirección de email para realizar el test. Si lo desea, puede probar con marcelojavierrodriguez@gmail.com");
			return;
		}
		
		String[] ls={"-ls"};
		
		// show all ads
		menu(ls);

		
		// To get a report about <= $5000. 
		String[] rp_1={"-rp","5000"};
		System.out.println("Reporte de viviendas publicadas por un máximo de $5000");
		menu(rp_1);

		
		// list offers <= $5000
		String[] sp={"-sp","3000"};
		System.out.println("\n Busqueda de viviendas publicadas por un máximo de $3000");
		menu(sp);
		
		//Email me when find...  (search; street or city)
		String[] pa={"-pa","Juan B Justo,1700,Mar del Plata",emailAddr};
		System.out.println("\n Registrar una notificación por email cuando se publique algo: Ó en Mar del Plata, ó en Mar del Plata por la calle Juan B Justo");
		menu(pa);
		
		// To trigger the previous query.
		String[] po_1={"-po","Juan B Justo,500,Mar del Plata","7000","arminvanbuuren@armada.nl","4"};
		System.out.println(" Se ha publicado una oferta en Mar del Plata, en la calle Juan B Justo: debemos recibir un email.");
		menu(po_1);
		
		// Email me when find ...(search: distance to location)
		String[] pd={"-pd","Pinto,2000,Tandil","3",emailAddr};
		System.out.println("\n Registrar una notificación por email cuando se publique alguna oferta a máximo 4 cuadras de General Pinto al 2000, en Tandil ");
		menu(pd);
		
		// To trigger the previous query
		String[] po_2={"-po","San Martin,1700,Tandil","9800","acmicpc@mit.us","6"};
		System.out.println(" Se ha publicado una oferta en Tandil, en la calle San Martin al 1700 por $9800: debemos recibir un email.");
		menu(po_2);
	
	
		//Search for proximity : max 6 squares to ...
		String[] sd={"-sd","San Martin,1300,Tandil","6"};
		System.out.println("\n Listar las ofertas que estén a maximo 6 cuadras de San Martin 1300 en Tandil");
		menu(sd);
		
		// To get a report about street

		String[] rp_2={"-ra","San Martin,133,Tandil"};
		System.out.println("Reporte de viviendas en San Martín, Tandil o Simplemente en Tandil. Si no hay viviendas registradas en Tandil, se entrega un reporte completo.");
		menu(rp_2);
	
		System.out.println(".........................................................................................");
	}
	
	
	
	public void menu(String[] args){
		
		String contact="intel@atmel.no";
		taitum.menubuilder.MenuBuilder menuOption=null;
		ws.taitum.schemas.Address addressData=createAddress();
		ws.taitum.schemas.Ad ad=new Ad();
		ws.taitum.schemas.AdType adType=new AdType();
		ad.setPriceVariance(500);
		ad.setSquareDistance(squareDistance);
		ad.setContact(contact);
		boolean isRegistered=false;
		boolean isSearch=false;
		boolean isReport=false;
		
		Set set=null;
					
					
			switch(args[0]){
					 case "-po": // <register offer>:=<command>,[<street>,<high>.<city>],<value of property to publish>,<contact seller>,<rooms>
							set=new SetComposite(new SetComposite(new SetPrice(2),new SetContact(3)),new SetRooms(4));
						 	menuOption=new PMenuBuilder(this, set,1,"offer");
							isRegistered= menuOption.action(addressData,args,ad,adType);
							break;
							
					case "-pd":// <register alert by address proximity>:=<command>,[<street>,<high>.<city>],<distance in square>,<interested contact>
							set=new SetComposite(new SetPrice(2),new SetContact(3));
						 	menuOption=new PMenuBuilder(this, set,1,"distance");
						 	isRegistered= menuOption.action(addressData,args,ad,adType);
							break;
							
					case "-pa":// <register alert by address>:=<command>,[<street>,<high>.<city>],<interested contact>
							menuOption=new PMenuBuilder(this, new SetContact(2),1,"address");
							isRegistered= menuOption.action(addressData,args,ad,adType);
							break;
						
					case "-pp"://<register alter by price>:=<command>,<price>,<interested contact>
							set=new SetComposite(new SetPrice(1),new SetContact(2));
							menuOption=new TMenuBuiler(this,set,1,"price");
							isRegistered= menuOption.action(addressData,args,ad,adType);
							break;

					case "-sd"://<search by distance>:=<command>,[<street>,<high>.<city>], <max distance in squares> :
							menuOption=new PMenuBuilder(this,new SetDistance(2),1,"distance");
							isSearch= menuOption.action(addressData,args,ad,adType);
							break;
					
					case "-sp": //<search by price>:=<command>,<max price to pay> 
							menuOption=new TMenuBuiler(this,new SetPrice(1),1,"price");
							isSearch= menuOption.action(addressData,args,ad,adType);
							break;
				
					case "-sa":// <register alert by address>:=<command>,[<street>,<high>.<city>]
							menuOption=new PMenuBuilder(this,new SetNothing(1),1,"address");
							isSearch= menuOption.action(addressData,args,ad,adType);
							break;
					
					case "-rd"://<search by distance>:=<command>,[<street>,<high>.<city>], <max distance in squares>
			     			menuOption=new PMenuBuilder(this,new SetDistance(2),1,"distance");
							isReport= menuOption.action(addressData,args,ad,adType);
							break;
				
				 	case "-ra":// <register alert by address>:=<command>,[<street>,<high>.<city>],<interested contact>
				 			menuOption=new PMenuBuilder(this,new SetNothing(1),1,"address");
				 			isReport= menuOption.action(addressData,args,ad,adType);
				 			break;
			 	
				 	case "-rp"://<report by price>:=<command>,<max price to pay> 
				 			menuOption=new TMenuBuiler(this,new SetPrice(1),1,"price");
				 			isReport= menuOption.action(addressData,args,ad,adType);
				 			break;
		 	
				 	case "-ls":
				 			showAllAds();
							break;
							
					case "-ts":
							test(args[1]);
							break;
							
					default:
							Utils.usage();
							break;
				 }			
	
		
		if (isRegistered){
			service.publish(ad, adType);
			System.out.println("\n Tu aviso fue publicado con exito!.Sólo se muestran las ofertas...............");
			showAllAds();
			return;
		}
		
		if (isSearch){
			System.out.println("\n Publicaciones relevantes....................:");
			search(ad, adType);
			return;
		}
		
		if (isReport){
			System.out.println("\n Datos estadisticos de interes...............");
			getReport(ad, adType);
			return;
			}
	
		}
	
	
	public static void main(String[] args) {
		
	
	try{
		Taitum taitum=new Taitum();
		taitum.menu(args);
		}
		catch(WebServiceException e){
			System.out.println("\n El servidor no está disponible en este momento.");
		}
		catch(ArrayIndexOutOfBoundsException e){
			Utils.usage();
			
		}
	
	}
		
		
	
}
