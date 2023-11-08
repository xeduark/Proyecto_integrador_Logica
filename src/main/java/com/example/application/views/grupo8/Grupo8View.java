package com.example.application.views.grupo8;

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
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Grupo 8")
@Route(value = "grupo-8", layout = MainLayout.class)
public class Grupo8View extends VerticalLayout {

    public Grupo8View() {
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
                "url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZAV-Aniv4BYuyHctlK_Ec0iFykayMWgcuEG2zCmN8p87O8VUnGwWgvVG9NGvTZmJvxJQ&usqp=CAU)");

        H1 t1 = new H1("Grupo 8");
        H2 t2 = new H2("Algoritmos Deportes y Salud");
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
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2FDayana%20Castro%20Villa.png?alt=media&token=75d41057-65ff-4173-8481-39ee2cda1ef5&_gl=1*gn1vx0*_ga*Njc3MDY0MDYzLjE2OTYzODAyMzQ.*_ga_CW55HF8NVT*MTY5NjM4MDIzNC4xLjEuMTY5NjM4NDUxMC4zOS4wLjA.");
        est1.put("name", "Dayana Castro");
        Map<String, String> est2 = new HashMap<>();
        est2.put("image",
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2FFernando%20S%C3%A1nchez.png?alt=media&token=50b032c1-7dbd-411a-a5ce-69fdb3cabed1&_gl=1*vmkpyu*_ga*Njc3MDY0MDYzLjE2OTYzODAyMzQ.*_ga_CW55HF8NVT*MTY5NjM4MDIzNC4xLjEuMTY5NjM4NDUyOC4yMS4wLjA.");
        est2.put("name", "Fernando Sánchez");
        Map<String, String> est3 = new HashMap<>();
        est3.put("image",
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2Fcamiloh-fotor.png?alt=media&token=1cded657-ea46-4d05-994a-98f5ff86a487&_gl=1*ribc1p*_ga*Njc3MDY0MDYzLjE2OTYzODAyMzQ.*_ga_CW55HF8NVT*MTY5NjM4MDIzNC4xLjEuMTY5NjM4NDQ4OS42MC4wLjA.");
        est3.put("name", "Juan Camilo Hernandez");

        users.add(est1);
        users.add(est2);
        users.add(est3);

        add(secciones.students(users));

        String titulo1;
        String titulo2;
        String descripcion;
        String gist;
        String replit;
        String diagrama;

        // Algoritmo1
        titulo1 = "Algoritmo 1";
        titulo2 = "Calculos Mecanicos";
        descripcion = ": En este programa tenemos varias opciones que el cliente puede consultar las cuales son preguntas que relacionamos con el diario vivir de los propietarios de vehículos. Entre las opciones está calcular velocidad promedio a la cual viajaron en su vehículo con una distancia y un tiempo determinado ,en la opción de calcular autonomía de un vehículo es básicamente la distancia máxima que puede llegar a circular un vehículo sin necesidad de parar a repostar, es decir, hasta que tengamos que rellenar el combustible otra vez. y en la opción consumo de su motor por distancia recorrida es muy útil para llevar un control de consumo de su máquina y estar atento llegado el caso de que el consumo aumente";
        gist = "<script src=\"https://gist.github.com/camilohl94/fed15f439e35bb6ce14e779cddae63ff.js\"></script>";
        replit = "https://replit.com/@Juan-CamiloC835/casoIntegrado1#Main.java";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/proyecto-integrador-5260a.appspot.com/o/diagrama%20de%20flujo%20proyecto%20integrador1.png?alt=media&token=09d3cbdb-0c0b-41fd-bbc0-59efbdb591cc";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

    }

    // calcularConsumo
    private NumberField input1;
    private NumberField input2;
    H4 resultado;

    public HorizontalLayout algoritmo1() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image("https://static.tuasaude.com/media/article/me/dr/imc_15748_l.jpg", ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        Button btnCalcular = new Button("Calcular");
        btnCalcular.addClickListener(event -> {
            calcularConsumo();
        });

        resultado = new H4("");

        // calcularConsumo
        input1 = new NumberField("Por favor ingrese el kilometraje recorrido");
        input2 = new NumberField("Ingrese la cantidad de combustible gastado en litros");

        ComboBox<String> comboBox1 = new ComboBox<>("Por favor elija una opcion:");
        comboBox1.setAllowCustomValue(true);
        add(comboBox1);
        comboBox1.setItems("Calcular el consumo de su motor por distancia recorrida en km",
                "Calcular velocidad promedio", "Calcular autonomia");

        comboBox1.addValueChangeListener(event -> {
            String seleccion = comboBox1.getValue();
            if (seleccion.equals("Calcular el consumo de su motor por distancia recorrida en km")) {
                calcularConsumo();
            }
            if (seleccion.equals("Calcular velocidad promedio")) {
                calcularVelocidad();
            }
            if (seleccion.equals("Calcular autonomia")) {
                calcularAutonomia();
            }

        });

        vl2.add(new H3("Calculos Mecanicos"));
        vl2.add(comboBox1);
        vl2.add(input1);
        vl2.add(input2);
        vl2.add(btnCalcular);
        vl2.add(resultado);

        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }

    public void calcularConsumo() {
        double kilometraje = input1.getValue();
        double consumo = input2.getValue();
        resultado.setText(String.valueOf(kilometraje / consumo));
    }

    public void calcularVelocidad() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese el kilometraje recorrido: ");
        double kilometraje = entrada.nextDouble();
        System.out.println("Por favor ingrese el tiempo que se demoro en horas: ");
        double tiempo = entrada.nextDouble();
        double resultado = kilometraje / tiempo;
        System.out.println("Su velocidad promedio es: " + resultado + "km/h");

    }

    public void calcularAutonomia() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese la capacidad de su tanque en litros: ");
        double capacidad = entrada.nextDouble();
        System.out.println("Ingrese el consumo de combustible en km/l: ");
        double consumo = entrada.nextDouble();
        double resultado = capacidad * consumo;
        System.out.println("La autonomia de su moto es de " + resultado + " kilometros con el tanque actual.");
    }

}
