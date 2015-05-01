package ws.geocoder.core;
import java.util.StringTokenizer;

@SuppressWarnings("serial")
public class IAddress extends ws.geocoder.schemas.Address {
	

	
	public IAddress(ws.geocoder.schemas.Address address){
		
		localStreet= address.getStreet();
	    localHigh= address.getHigh();
	   	localCity= address.getCity();
		localState= address.getState();
		localCountry=address.getCountry();
		
	}
	
	public IAddress(){
	
	}
	protected String getNumber(String street){
			
			StringTokenizer tokenizer=new StringTokenizer(street, " -");
			int t=0;
			while (t<(tokenizer.countTokens()-1)){
				tokenizer.nextToken();
			}
			return tokenizer.nextToken();
		}

	protected String getStreet(String street){
			StringTokenizer tokenizer=new StringTokenizer(street, " ");
			String token="";
			int t=0;
			while (t<(tokenizer.countTokens()-1)){
				token+=" " + tokenizer.nextToken();
			}
			return token;
		}

	protected void parseAddress(String address){
			
			StringTokenizer tokenizer=new StringTokenizer(address,",");
			String str=tokenizer.nextToken();
			localStreet=getStreet(str);
			String highStr=getNumber(str);
			localHigh= Integer.parseInt(highStr);
			localCity=tokenizer.nextToken();
			localState=tokenizer.nextToken();
			localCountry=tokenizer.nextToken();
			
	}
	
	
	public String toString(){
		return  localStreet +" "+ localHigh +","+ localCity+","+ localState+"," + localCountry;
	}
	
}
