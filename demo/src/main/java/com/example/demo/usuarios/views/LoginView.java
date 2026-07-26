package com.example.demo.usuarios.views;

import com.example.demo.usuarios.servicios.UserService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.router.Route;

@Route("login")
public class LoginView extends LoginOverlay {

    public LoginView(UserService userService) {
        System.out.println(">>> ¡Cargando la NUEVA versión de LoginView! <<<");

        setTitle("Welcome");
        setDescription("");
        setOpened(true);


        // Crear un botón o enlace hacia la vista de registro
        Button registerButton = new Button("Create an account", e -> {
            System.out.println(">>> ¡Cargando la NUEVA versión de LoginView! <<<");
            getUI().ifPresent(ui -> ui.navigate("register"));
        });
        registerButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY); // Estilo sutil de texto/enlace

        // Agregar el botón al área inferior (footer) del login
        getFooter().add(registerButton);

        addLoginListener(event -> {
            // Lógica de inicio de sesión
        });
    }
}
