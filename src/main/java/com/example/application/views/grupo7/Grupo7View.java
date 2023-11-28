package com.example.application.views.grupo7;

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
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.HashMap;
import java.util.Map;

@PageTitle("Grupo 7")
@Route(value = "grupo-7", layout = MainLayout.class)
public class Grupo7View extends VerticalLayout {

    public Grupo7View() {
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
                "url(https://firebasestorage.googleapis.com/v0/b/proyecto1-11e37.appspot.com/o/Universo-e1537822135973.jpg?alt=media&token=202ed83f-7e04-47d2-af88-7b216c590029&_gl=1*7vgk9w*_ga*MTAyMTA0ODY2My4xNjkzMzU4ODc0*_ga_CW55HF8NVT*MTY5Njk4MjcyMS4xNS4xLjE2OTY5ODMyMTcuNTAuMC4w)");

        H1 t1 = new H1("Grupo 7");
        H2 t2 = new H2("Astronomía");
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
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2FJULIAN%20ALEXIS%20GARCIA.png?alt=media&token=85046327-23b3-4a03-a95c-45abd0d13b86&_gl=1*xw1owp*_ga*Njc3MDY0MDYzLjE2OTYzODAyMzQ.*_ga_CW55HF8NVT*MTY5NjM4MDIzNC4xLjEuMTY5NjM4MzcxNC42MC4wLjA.");
        est1.put("name", "Julian Garcia");
        Map<String, String> est2 = new HashMap<>();
        est2.put("image",
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2FJHONATAN%20RODRIGUEZ%20M.png?alt=media&token=53f31768-c57e-4d2e-b1ff-05ada40e032c&_gl=1*1qbq1l7*_ga*Njc3MDY0MDYzLjE2OTYzODAyMzQ.*_ga_CW55HF8NVT*MTY5NjM4MDIzNC4xLjEuMTY5NjM4MzczMi40Mi4wLjA.");
        est2.put("name", "Jhonatan Rodriguez");

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
        titulo2 = "Consulta la distancia de los planetas del sistema solar a distancia en kilómetros desde la tierra";
        descripcion = "En este algoritmo podremos obtener la distancia entre la tierra y los planetas del sistema solar.\r\n"
                + //
                "\r\n" + //
                "\r\n" + //
                "La astronomía es una ciencia que estudia el universo y todos sus componentes. Estudia también los fenómenos que afectan a los cuerpos celestes, sus movimientos y comportamientos esperables.\r\n"
                + //
                "\r\n" + //
                "Entre los cuerpos celestes se encuentran los planetas, estrellas, satélites, cometas, meteoroides, materia interestelar y materia oscura\r\n"
                + //
                "\r\n" + //
                "";
        gist = "<script src=\"https://gist.github.com/Jtanrm/50e86487ae95337fe957983112ede5d3.js\"></script>";
        replit = "https://replit.com/@jhonvalencia3/eje1-1#Main.java";
        diagrama = "https://app.code2flow.com/IZ6IohvfHUgr.svg";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

        Algoritmo2
        titulo1 = "Algoritmo 2";
        titulo2 = "Planetas Rocosos y Gaseosos";
        descripcion = "Nuestro sistema solar está conformado por ocho planetas además de otros cuerpos que se encuentran orbitando alrededor del sol..\r\n"
                + //
                "\r\n" + //
                "\r\n" + //
                "Cuatro de estos planetas son rocosos (Mercurio, Venus, Tierra, Marte).\r\n"
                + //
                "\r\n" + //
                "Cuatro son gaseosos y son los más retirados del sol (Júpiter, Saturno, Urano, Neptuno) todos los planetas están en orden.\r\n"
                + //
                "\r\n" + //
                "";
        gist = "<script src=\"https://gist.github.com/JulianGarcH/ee46f166205ee4dd7ae2f46d981dca62.js\"></script>";
        replit = "https://replit.com/@jagarciaherr/Algoritmo2#Main.java";
        diagrama = "https://app.code2flow.com/CPyhoM8FygjJ.svg ";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo2(), gist, replit, diagrama));

    }
    

    public HorizontalLayout algoritmo1() {

        Map<String, Double> distanciasPlanetas = new HashMap<>();
        distanciasPlanetas.put("Mercurio", 57.9);
        distanciasPlanetas.put("Venus", 108.2);
        distanciasPlanetas.put("Tierra", 0.0);
        distanciasPlanetas.put("Marte", 227.9);
        distanciasPlanetas.put("Jupiter", 778.3);
        distanciasPlanetas.put("Saturno", 1427.0);
        distanciasPlanetas.put("Urano", 2870.7);
        distanciasPlanetas.put("Neptuno", 4496.7);

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2Ffotos%20de%20la%20descripcion%2FEl-Sistema-Solar-podria-expulsar-a-un-planeta-2-fotor-20231121185452.jpg?alt=media&token=8020ca35-9132-4c76-87af-04d611cd8dba",
                ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        H3 mensaje1 = new H3("");

        ComboBox<String> comboBox1 = new ComboBox<>("Banda 1");
        comboBox1.setAllowCustomValue(true);
        add(comboBox1);
        comboBox1.setItems("Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno", "Urano", "Neptuno");

        comboBox1.addValueChangeListener(event -> {
            String nombrePlaneta = comboBox1.getValue();
            Double distancia = distanciasPlanetas.get(nombrePlaneta);
            if (distancia != null) {
                mensaje1.setText("La distancia de " + nombrePlaneta + " a la Tierra es " + String.valueOf(distancia)
                        + " millones de kilómetros.");
            }
        });

        vl2.add(comboBox1);
        vl2.add(mensaje1);
        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }

}