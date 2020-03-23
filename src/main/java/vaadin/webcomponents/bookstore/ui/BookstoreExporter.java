package vaadin.webcomponents.bookstore.ui;

import com.vaadin.flow.component.WebComponentExporter;
import com.vaadin.flow.component.webcomponent.WebComponent;

import lombok.extern.log4j.Log4j2;

/**
 * Exports  <ve-greeter> as web-component.
 */
@Log4j2
public class BookstoreExporter extends WebComponentExporter<MainLayout> {
    
	private static final long serialVersionUID = -7043335964664102081L;
    
    public BookstoreExporter() {
        super("ve-bookstore");
    }
    protected void configureInstance(WebComponent<MainLayout> webComponent, MainLayout component) {
    	//TODO
    }
}
