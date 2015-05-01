package ws.email.core.filters;


public class EmailFilterByBody extends EmailFilter {

	
	
	@Override
	public boolean accept(ws.email.schemas.Email  email) {
		
		return (email.getBody().contains(target)||   (email.getBody().equalsIgnoreCase(target)));
		}

}
