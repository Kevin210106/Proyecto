package com.example.demo.usuarios.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("register")
public class SignView {
    public class HolaView extends VerticalLayout {

        public HolaView() {
            // Configuración básica del layout para centrar el contenido
            setSizeFull();
            setJustifyContentMode(JustifyContentMode.CENTER);
            setDefaultHorizontalComponentAlignment(Alignment.CENTER);

            // Componente de texto/encabezado
            H1 mensaje = new H1("¡Hola! Bienvenido.");

            add(mensaje);
        }
    }
}
