package org.vaadin.teemu.demo;

import javax.servlet.annotation.WebServlet;

import org.vaadin.teemu.VaadinIcons;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("demo")
@Title("Vaadin Icons Add-on Demo")
@SuppressWarnings("serial")
public class DemoUI extends UI {

    @WebServlet(value = "/*", asyncSupported = false)
    @VaadinServletConfiguration(productionMode = false, ui = DemoUI.class)
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        setContent(layout);

        Button button = new Button("Click Me", VaadinIcons.VAADIN_V);
        layout.addComponent(button);
        layout.setComponentAlignment(button, Alignment.MIDDLE_CENTER);
    }

}
