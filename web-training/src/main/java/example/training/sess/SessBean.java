package example.training.sess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope
@Component
public class SessBean {

	private String value;

	@Autowired
	public SessBean() {
		this.value = "";
	}

    public SessBean( String value ) {
    	this.value = value;
    }

    public String getValue() {
    	return this.value;
    }

    public void setValue( String value ) {
    	this.value = value;
    }
}