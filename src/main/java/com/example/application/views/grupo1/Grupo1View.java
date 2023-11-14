package com.example.application.views.grupo1;

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

@PageTitle("Grupo 1")
@Route(value = "grupo-1", layout = MainLayout.class)
public class Grupo1View extends VerticalLayout {

    public Grupo1View() {

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
                "url(https://plus.unsplash.com/premium_photo-1661763720453-038215ddc44f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1801&q=80)");

        H1 t1 = new H1("Grupo 1");
        H2 t2 = new H2("Geometría y Estadística");
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
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2FMiguel%20Angel%20Roldan.png?alt=media&token=986f251f-30c2-4e2f-9615-4bac3b5fc134&_gl=1*3wsf74*_ga*Njc3MDY0MDYzLjE2OTYzODAyMzQ.*_ga_CW55HF8NVT*MTY5NjM4MDIzNC4xLjEuMTY5NjM4MDg5OS4xMi4wLjA.");
        est1.put("name", "Miguel Roldán");
        Map<String, String> est2 = new HashMap<>();
        est2.put("image",
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2FSara%20Lopera%20Perez.png?alt=media&token=2d24bf89-d4b7-4f00-9759-1287bb942e52&_gl=1*1eun1ou*_ga*Njc3MDY0MDYzLjE2OTYzODAyMzQ.*_ga_CW55HF8NVT*MTY5NjM4MDIzNC4xLjEuMTY5NjM4MDk0OC42MC4wLjA.");
        est2.put("name", "Sara Lopera");
        Map<String, String> est3 = new HashMap<>();
        est3.put("image",
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2FZully%20Vega.png?alt=media&token=fd39f10f-fb27-474f-ac06-88860b4424ae&_gl=1*l2zrel*_ga*MTAyMjY3NzI1MC4xNjk1MTU5NTY0*_ga_CW55HF8NVT*MTY5NzA0MDkxOC4zLjEuMTY5NzA0MTE2MC42MC4wLjA.");
        est3.put("name", "Zully Vega");

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
        titulo2 = "Calculadora de Área y Volumen de la Esfera";
        descripcion = "La esfera es un cuerpo geométrico formado generado por una semicircunferencia que gira alrededor de un determinado eje.\r\n"
                + //
                "Utilice esta calculadora para averiguar el volumen y el área de una esfera utilizando el radio.\r\n" + //
                "";

        gist = "<script src=\"https://gist.github.com/ZullyVega/ecf6df1a098022a773b90d7ba7bce111.js\"></script>";
        replit = "https://replit.com/@zvegaon/Esfera#Main.java";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/evidencialp.appspot.com/o/Algoritmo1.png?alt=media&token=1fa6d920-be66-4d6f-96cf-4d128cac9a2d&_gl=1*lifiqy*_ga*MjI2MzQ2NjM4LjE2OTgxODc1OTU.*_ga_CW55HF8NVT*MTY5ODE4NzU5NS4xLjEuMTY5ODE4ODE2Mi41NS4wLjA";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));
        // Algoritmo2
        titulo1 = "Algoritmo 1";
        titulo2 = "Calculadora del área del triángulo, media y desviación estándar de números";
        descripcion = "La Calculadora del área del triángulo, media y desviación estándar de números es una herramienta versátil que combina tres funciones matemáticas fundamentales.\r\n" + //
                        "\r\n" + //
                        "Área del triángulo: Permite calcular el área de un triángulo a partir de la longitud de sus lados o utilizando la fórmula de Herón, que involucra semi perímetros.\r\n" + //
                        "\r\n" + //
                        "Media (promedio): Calcula la media aritmética de un conjunto de números proporcionados. La media es la suma de todos los valores dividida por la cantidad de valores, proporcionando un valor representativo del conjunto.\r\n" + //
                        "\r\n" + //
                        "Desviación estándar: Determina la dispersión o variabilidad de un conjunto de números. La desviación estándar mide qué tan dispersos están los valores con respecto a la media. Un valor más alto indica una mayor variabilidad.\r\n" + //
                        "";

        gist = "<script src=\"https://gist.github.com/ZullyVega/ecf6df1a098022a773b90d7ba7bce111.js\"></script>";
        replit = "https://replit.com/@zvegaon/Esfera#Main.java";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/evidencialp.appspot.com/o/code2flow_dEVuPL.png?alt=media&token=f2d663b1-6215-4367-84ef-c9c11d737e68";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

    }

    public HorizontalLayout algoritmo1() {


        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image("https://firebasestorage.googleapis.com/v0/b/pi-equipo-1.appspot.com/o/41a1bf22-4bed-4d9b-8eef-c1417746ef65.jfif?alt=media&token=4897e9e3-6150-444f-907a-18cd6c374f97&_gl=1*1gas3p4*_ga*Mzk3NDA0NzI5LjE2OTY5ODUxNTI.*_ga_CW55HF8NVT*MTY5Njk4NTE1Mi4xLjEuMTY5Njk4NTQyNy42LjAuMA..", ""));
        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);


        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();


         H1 t1 = new H1("Calculadora");


        H3 mensaje = new H3();
       H3 mensajeArea = new H3();




        NumberField NFRadio = new NumberField("Ingresa el radio de la esfera");


        Button btnCalcular = new Button("Calcular");
        btnCalcular.addClickListener(event -> {
            double valorRadio = NFRadio.getValue();
            double Resultado = (4.0 / 3.0) * Math.PI * Math.pow(valorRadio, 3);
            mensaje.setText("El volumen de la esfera es : "+ String.valueOf((double)Math.round(Resultado * 100d)/100));


            double result2 = 4.0 * Math.PI * Math.pow(valorRadio, 2);
            mensajeArea.setText("El área de la esfera es : "+ String.valueOf((double)Math.round(result2 * 100)/100));
        });


        vl2.add(t1);
        vl2.add(NFRadio);
        vl2.add(btnCalcular);
        vl2.add(mensaje);

        vl2.add(mensajeArea);
        hl.add(vl1);
        hl.add(vl2);
        return hl;


    } 
     

}