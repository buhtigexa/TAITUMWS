package ws.email.core.filters;

import ws.email.schemas.Email;

public class EmailFilterBySubject extends EmailFilter {

	
	@Override
	public boolean accept(Email email) {
		return (email.getSubject().contains(target)||   (email.getSubject().equalsIgnoreCase(target)));
	}

}
