package com.example.application.views.grupo5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.example.application.views.MainLayout;
import com.example.application.views.Secciones;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Grupo 5")
@Route(value = "grupo-5", layout = MainLayout.class)
public class Grupo5View extends VerticalLayout {

    public Grupo5View() {
        setAlignItems(Alignment.CENTER);
        setSizeFull();

        VerticalLayout vl = new VerticalLayout();
        vl.setJustifyContentMode(JustifyContentMode.CENTER);
        vl.setAlignItems(Alignment.CENTER);
        vl.setWidthFull();
        vl.setHeight("300px");
        vl.setMinHeight("300px");
        vl.scrollIntoView();

        vl.getStyle().set("background-position", "center");
        vl.getStyle().set("background-repeat", "no-repeat");
        vl.getStyle().set("background-size", "cover");
        vl.getStyle().set("background",
                "url(https://images.unsplash.com/photo-1590333748338-d629e4564ad9?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1898&q=80)");

        H1 t1 = new H1("Grupo 5");
        H2 t2 = new H2("Algoritmos Hotelería y Turismo");
        t1.getStyle().set("color", "white");
        t2.getStyle().set("color", "white");
        t1.getStyle().set("text-shadow", "#000 3px 0 15px");
        t2.getStyle().set("text-shadow", "#000 3px 0 15px");
        vl.add(t1);
        vl.add(t2);
        vl.add(new Hr());

        add(vl);
        Secciones secciones = new Secciones();
        ArrayList<Map<String, String>> users = new ArrayList<>();

        // Integrantes
        Map<String, String> est1 = new HashMap<>();
        est1.put("image",
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2Fgustavo%202023-10-03%20at%207.38.50%20PM-fotor-20231003194545.png?alt=media&token=05d86eea-40b9-4c85-b0d4-dd81a29b3600&_gl=1*1tcqh52*_ga*MTAyMjY3NzI1MC4xNjk1MTU5NTY0*_ga_CW55HF8NVT*MTY5NjQzMjM2Mi4yLjEuMTY5NjQzNTM1Ni42MC4wLjA.");
        est1.put("name", "Gustavo Vanegas");
        Map<String, String> est2 = new HashMap<>();
        est2.put("image",
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2Flady%20andrea%202023-09-27%20at%2010.11.51%20PM-fotor-20231003203252.png?alt=media&token=8db4e638-a281-4b5e-93b1-c40ebc302ff6&_gl=1*1r5rqwt*_ga*MTAyMjY3NzI1MC4xNjk1MTU5NTY0*_ga_CW55HF8NVT*MTY5NjQzMjM2Mi4yLjEuMTY5NjQzNTI2Ni42MC4wLjA.");
        est2.put("name", "Andrea vargas");

        users.add(est1);
        users.add(est2);

        add(secciones.students(users));

        String titulo1;
        String titulo2;
        String descripcion;
        String gist;
        String replit;
        String diagrama;

        // Algoritmo1
        titulo1 = "Algoritmo 1";
        titulo2 = "Reservación Mesas Restaurante";
        descripcion = "P.";
        gist = "<script src=\"https://gist.github.com/jfinfocesde/e2da562bb64be1b54f461de2cd5c001d.js\"></script>";
        replit = "https://replit.com/@gustavo-adolf89/Reservacionmesasrestaurante#Main.java";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/foto-7af27.appspot.com/o/reserva%20restaurante.png?alt=media&token=9acfbebe-0e12-46f9-94bd-2bbc7fee5379";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

        // Algoritmo2
        titulo1 = "Algoritmo 2";
        titulo2 = "Calculadora Índice de Masa Corporal (IMC)";
        descripcion = "El Índice de Masa Corporal (IMC) es una medida utilizada para evaluar si una persona tiene un peso saludable en relación con su altura. Se calcula dividiendo el peso de una persona en kilogramos por el cuadrado de su altura en metros. La fórmula básica del IMC es la siguiente:";
        gist = "<script src=\"https://gist.github.com/jfinfocesde/e2da562bb64be1b54f461de2cd5c001d.js\"></script>";
        replit = "https://replit.com/@jhonvalencia3/ProyectoPrueba";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/cesde-7fe22.appspot.com/o/Proyecto%20Integrador%2FDiagrama.svg?alt=media&token=e04cad73-fd1c-4972-a571-da1389d04689";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo2(), gist, replit, diagrama));

    }

    public HorizontalLayout algoritmo1() {
        int numeroMesas = 20;
        Restaurante restaurante = new Restaurante(numeroMesas);

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image("https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2Ffotos%20de%20la%20descripcion%2Fmesas.jpg?alt=media&token=ee36c1c7-3697-47c8-8d82-1f7f2038fdcb", ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        H4 titulo = new H4("Creación de Mesas del Restaurante");
        H4 titulo2 = new H4("");
        H4 resultado = new H4("");
        resultado.setVisible(false);

        NumberField numeroMesa = new NumberField("Mesa");
        numeroMesa.setVisible(false);

        Button btnReserva = new Button("Reservar Mesa");
        btnReserva.setVisible(false);

        btnReserva.addClickListener(event -> {
            int nm = numeroMesa.getValue().intValue();
            resultado.setText(restaurante.reservarMesa(nm));
        });

        ComboBox<String> menu = new ComboBox<>("Seleccione una opción:");
        menu.setAllowCustomValue(true);
        menu.setItems("Mostrar mesas disponibles", "Reservar mesa");

        menu.addValueChangeListener(event -> {
            String seleccion = menu.getValue();

            if (seleccion.equals("Mostrar mesas disponibles")) {
                numeroMesa.setVisible(false);
                btnReserva.setVisible(false);
                resultado.setVisible(false);
                titulo2.setText(restaurante.mostrarMesasDisponibles());
            } else if (seleccion.equals("Reservar mesa")) {
                numeroMesa.setVisible(true);
                btnReserva.setVisible(true);
                resultado.setVisible(true);
                numeroMesa.setValue(null);
                titulo2.setText("Ingrese el número de mesa que desea reservar:");
            }

            // switch (opcion) {
            // case 1:

            // break;
            // case 2:
            // System.out.print("Ingrese el número de mesa que desea reservar: ");
            // int numeroMesa = scanner.nextInt();
            // restaurante.reservarMesa(numeroMesa);
            // break;
            // case 3:
            // System.out.println("Gracias por usar el sistema de reservas. ¡Hasta luego!");
            // scanner.close();
            // System.exit(0);
            // default:
            // System.out.println("Opción inválida. Intente nuevamente.");
            // }
            // }

        });

        // while (true) {
        // System.out.println("\n1. Mostrar mesas disponibles");
        // System.out.println("2. Reservar mesa");
        // System.out.println("3. Salir");
        // System.out.print("Seleccione una opción: ");
        // int opcion = scanner.nextInt();

        // switch (opcion) {
        // case 1:
        // restaurante.mostrarMesasDisponibles();
        // break;
        // case 2:
        // System.out.print("Ingrese el número de mesa que desea reservar: ");
        // int numeroMesa = scanner.nextInt();
        // restaurante.reservarMesa(numeroMesa);
        // break;
        // case 3:
        // System.out.println("Gracias por usar el sistema de reservas. ¡Hasta luego!");
        // scanner.close();
        // System.exit(0);
        // default:
        // System.out.println("Opción inválida. Intente nuevamente.");
        // }
        // }

        vl2.add(titulo);
        vl2.add(menu);
        vl2.add(titulo2);
        vl2.add(numeroMesa);
        vl2.add(btnReserva);
        vl2.add(resultado);
        hl.add(vl1);
        hl.add(vl2);

        return hl;

    }

    Hotel hotelElegido;

    public HorizontalLayout algoritmo2() {

        Hotel hotel1 = new Hotel("Hotel Dan Jarton", 10, 100.0);
        Hotel hotel2 = new Hotel("Hotel DeCamarón", 20, 120.0);
        Hotel hotel3 = new Hotel("Hotel Milton", 15, 150.0);

        Hotel[] hoteles = { hotel1, hotel2, hotel3 };

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image("https://static.tuasaude.com/media/article/me/dr/imc_15748_l.jpg", ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        H3 mensaje1 = new H3("");
        mensaje1.setVisible(false);
        H3 mensaje2 = new H3("");
        mensaje2.setVisible(false);
        H3 mensaje3 = new H3("");
        mensaje3.setVisible(false);

        ComboBox<String> comboBox1 = new ComboBox<>("Reserva Hotel");
        comboBox1.setAllowCustomValue(true);
        comboBox1.setItems("Hotel Dan Jarton", "Hotel DeCamarón", "Hotel Milton");

        NumberField cantidad = new NumberField("H");
        cantidad.setVisible(false);

        Button calcular = new Button("Calcular");
        calcular.setVisible(false);

        calcular.addClickListener(event -> {

            boolean reservaExitosa = hotelElegido.reservarHabitacion((int) cantidad.getValue().doubleValue());
            if (reservaExitosa) {
                mensaje3.setVisible(true);
                String temp = "Reserva exitosa en " + hotelElegido.nombre;
                double costoTotal = hotelElegido.calcularCostoTotal((int) cantidad.getValue().doubleValue());
                temp += " El costo total es $" + costoTotal;
                mensaje3.setText(temp);
            }

        });

        comboBox1.addValueChangeListener(event -> {
            String hotel = comboBox1.getValue();

            if (hotel.equals("Hotel Dan Jarton")) {
                hotelElegido = hoteles[0];
                mensaje1.setVisible(true);
                mensaje2.setVisible(true);

            }
            if (hotel.equals("Hotel DeCamarón")) {
                hotelElegido = hoteles[1];
            }
            if (hotel.equals("Hotel Milton")) {
                hotelElegido = hoteles[2];
            }

            mensaje1.setText("Ha elegido el hotel " + hotelElegido.nombre);
            mensaje2.setText(hotelElegido.mostrarDisponibilidad());
            cantidad.setVisible(true);
            cantidad.setLabel("Reservar:");
            calcular.setVisible(true);

        });

        vl2.add(comboBox1);
        vl2.add(mensaje1);
        vl2.add(mensaje2);
        vl2.add(cantidad);
        vl2.add(calcular);
        vl2.add(mensaje3);

        hl.add(vl1);
        hl.add(vl2);

        return hl;

    }

}
