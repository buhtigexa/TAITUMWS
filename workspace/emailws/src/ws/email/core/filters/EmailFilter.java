package ws.email.core.filters;



public abstract class EmailFilter {
	
	public  String target="";
	
	public abstract boolean accept(ws.email.schemas.Email email);

}
