package com.example.application.views.grupo7;

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
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


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
        descripcion = "En este algoritmo podremos obtener la distancia entre la tierra y los planetas del sistema solar.\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "La astronomía es una ciencia que estudia el universo y todos sus componentes. Estudia también los fenómenos que afectan a los cuerpos celestes, sus movimientos y comportamientos esperables.\r\n" + //
                "\r\n" + //
                "Entre los cuerpos celestes se encuentran los planetas, estrellas, satélites, cometas, meteoroides, materia interestelar y materia oscura\r\n" + //
                "\r\n" + //
                "";
        gist = "<script src=\"https://gist.github.com/jfinfocesde/e2da562bb64be1b54f461de2cd5c001d.js\"></script>";
        replit = "";
        diagrama = "";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

    }
    public HorizontalLayout algoritmo1() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2Ffotos%20de%20la%20descripcion%2Fimc1-fotor-202310111296.jpg?alt=media&token=0e856adc-2359-4a69-9ab4-82a549ab56c4&_gl=1*1l79lkf*_ga*MTAyMjY3NzI1MC4xNjk1MTU5NTY0*_ga_CW55HF8NVT*MTY5NzA0MDkxOC4zLjEuMTY5NzA0NDE3Ni43LjAuMA..",
                ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        NumberField peso = new NumberField("Peso (kg)");
        NumberField altura = new NumberField("Altura (m)");
        Button calcular = new Button("Calcular IMC");
        H3 salida = new H3();

        calcular.addClickListener(event -> {
            double valorPeso = peso.getValue();
            double valorAltura = altura.getValue();
            double imc = valorPeso / Math.pow(valorAltura, 2);
            String info = "";
            if (imc < 18.5) {
                info = "Bajo peso";
            } else if (imc >= 18.5 && imc < 24.9) {
                info = "Peso saludable";
            } else if (imc >= 25.0 && imc < 29.9) {
                info = "Sobrepeso";
            } else if (imc >= 30.0 && imc < 34.9) {
                info = "Obesidad Clase 1";
            } else if (imc >= 35.0 && imc < 39.9) {
                info = "Obesidad Clase 2";
            } else {
                info = "Obesidad Clase 3";
            }
            String numeroFormateado = String.format("%.2f", imc);
            salida.setText(String.valueOf(numeroFormateado + ", " + info));
        });
        vl2.add(new H3("Calculadora Índice de Masa Corporal (IMC)"));
        vl2.add(peso);
        vl2.add(altura);
        vl2.add(calcular);
        vl2.add(salida);
        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }

    public HorizontalLayout algoritmo2() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2Ffotos%20de%20la%20descripcion%2F818eab1d9e1963313a2e2710ae84daf9-fotor-20231010195945-fotor-20231010205323.jpg?alt=media&token=e5b2f6f9-0e16-4544-90fc-daa1eab6f1d6&_gl=1*1pmg29g*_ga*MTAyMjY3NzI1MC4xNjk1MTU5NTY0*_ga_CW55HF8NVT*MTY5NzA0MDkxOC4zLjEuMTY5NzA0NDg4MC42MC4wLjA.",
                ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        TextField Equipo1 = new TextField("Equipo 1");
        TextField Equipo2 = new TextField("Equipo 2");
        Button simular = new Button("Simulación");
        H3 m1 = new H3("");

        simular.addClickListener(event -> {
            int puntajeUno = 0, puntajeDos = 0;
            int partido = 0;

            while (partido <= 8) {
                int goles1 = (int) (Math.random() * 5);
                int goles2 = (int) (Math.random() * 5);
                if (goles1 > goles2) {
                    puntajeUno += 3;
                } else if (goles2 > goles1) {
                    puntajeDos += 3;
                } else if (goles1 > 0 && goles1 == goles2) {
                    puntajeUno++;
                    puntajeDos++;
                } else {
                    System.out.print("Partido no valido");
                    continue;
                }
                partido++;
                System.out.print("Resultado del partido " + partido + "\n");
                System.out
                        .print(Equipo1.getValue() + " <" + goles1 + " - " + goles2 + "> " + Equipo2.getValue() + "\n");
                if (puntajeUno >= 15 || puntajeDos >= 15) {
                    break;
                }
            }
            partido--;
            String m2 = ("Se jugaron " + partido + " partidos :"+" "+"El " + Equipo1.getValue() + " consiguió " + puntajeUno + " puntos, "+" "+ "El " + Equipo2.getValue() + " consiguió " + puntajeDos + " puntos");
           
            if (puntajeUno > puntajeDos) {
                m2+= " Felicitaciones, su equipo ganó!!";
                // System.out.print(" Felicitaciones, su equipo ganó");
            } else {
                m2+= " Lo sentimos, su equipo no ganó...";
                // System.out.print(" Lo sentimos, su equipo no ganó");
            }
            m1.setText(m2);

        });
        vl2.add(new H3("Ingresa el nombre de el equipo que te gusta y un rival"));
        vl2.add(Equipo1);
        vl2.add(Equipo2);
        vl2.add(simular);
        vl2.add(m1);
        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }
    double dis, min, seg, cen, tse, vms, vkh;
    public HorizontalLayout algoritmo3() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2Ffotos%20de%20la%20descripcion%2Fcorredor-pista-atletismo-768x512-fotor-20231031102144.jpg?alt=media&token=ebf53579-464c-4e40-a598-e9ca2278b63a&_gl=1*pkb7i8*_ga*MTAyMjY3NzI1MC4xNjk1MTU5NTY0*_ga_CW55HF8NVT*MTY5ODc2NDQ3Ni44LjEuMTY5ODc2NTcyOC40Ni4wLjA.",
                ""));

                VerticalLayout vl2 = new VerticalLayout();
                vl2.setAlignItems(Alignment.CENTER);
        
                HorizontalLayout hl = new HorizontalLayout();
                hl.setAlignItems(Alignment.CENTER);
                hl.setWidthFull();
        
                NumberField dis = new NumberField("distancia (en metros):");
                NumberField min = new NumberField("distancia recorrida en minutos:");
                NumberField seg = new NumberField("distancia recorrida en segundos:");
                NumberField cen = new NumberField("distancia recorrida en centésimas:");
                Button calcular = new Button("Calcular");
                H3 result = new H3("0");
        
                calcular.addClickListener(event -> {

                    vkh=((dis.getValue()/((min.getValue()*60)+seg.getValue()+(cen.getValue()/100)))*3600)/1000;
                    result.setText(String.valueOf("La velocidad es de: "+vkh+" km/h"));
                });
        
                vl2.add(new H3("Eres rapido? vamos a averiguarlo..."));
                vl2.add(dis);
                vl2.add(min);
                vl2.add(seg);
                vl2.add(cen);
                vl2.add(calcular);
        
                vl2.add(result);
                hl.add(vl1);
                hl.add(vl2);
                return hl;
    }


}