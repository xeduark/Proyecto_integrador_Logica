package com.example.application.views.grupo6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.application.views.MainLayout;
import com.example.application.views.Secciones;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Grupo 6")
@Route(value = "grupo-6", layout = MainLayout.class)
public class Grupo6View extends VerticalLayout {

    public Grupo6View() {
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
                "url(https://images.unsplash.com/photo-1635070041078-e363dbe005cb?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2070&q=80)");

        H1 t1 = new H1("Grupo 3");
        H2 t2 = new H2("Algoritmos Deportes y Salud");
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
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2Ffoto%20johnny-fotor-20230928205637.png?alt=media&token=c50fc972-8526-4f39-a5c6-f338afef7052&_gl=1*1u0x7po*_ga*Njc3MDY0MDYzLjE2OTYzODAyMzQ.*_ga_CW55HF8NVT*MTY5NjM4MDIzNC4xLjEuMTY5NjM4MzQ0Mi42MC4wLjA.");
        est1.put("name", "Johnny Londoño");
        Map<String, String> est2 = new HashMap<>();
        est2.put("image", "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2FGranda%20Zea%20Jer%C3%B3nimo.png?alt=media&token=8abc8bd5-580e-4e69-b274-cafce57adf52&_gl=1*11ebyvb*_ga*MTAyMjY3NzI1MC4xNjk1MTU5NTY0*_ga_CW55HF8NVT*MTY5NjQzMjM2Mi4yLjEuMTY5NjQzNTQ0MC40OC4wLjA.");
        est2.put("name", "Jeronimo Granda");

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
        titulo2 = "Calcular el movimiento rectilíneo uniforme";
        descripcion = "MRU) es un tipo de movimiento en el cual un objeto se mueve en línea recta y a velocidad constante, es decir, su velocidad no cambia en el tiempo. En este tipo de movimiento, la trayectoria del objeto es una línea recta, por lo que su aceleración es cero.";
        gist = "<script src=\"https://gist.github.com/johnnycesde/a07a3d208519ff9ad5211c3d91029d3a.js\"></script>";
        replit = "https://replit.com/@johnnylondono/mcu";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/cesde-alumno.appspot.com/o/diagramaf%20mru.svg?alt=media&token=5bc6511b-1361-46f3-a233-834631028b82";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

    }
    
    double tiempo;
    public HorizontalLayout algoritmo1() {
        
        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image("https://pensaryaprender.files.wordpress.com/2011/10/fc3b3rmula-mru.gif", ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        NumberField distancia = new NumberField("distancia (m/s)");
        NumberField velocidad = new NumberField("velocidad (s)");
        Button calcular = new Button("Calcular ");
        H3 result = new H3("0");

        calcular.addClickListener(event -> {
            tiempo = distancia.getValue() / velocidad.getValue();
            result.setText(String.valueOf(tiempo));
        });

        vl2.add(new H3("Calcular MRU"));
        vl2.add(distancia);
        vl2.add(velocidad);
        vl2.add(calcular);

        vl2.add(result);
        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }

}
