package com.example.application.views.grupo4;

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

@PageTitle("Grupo 4")
@Route(value = "grupo-4", layout = MainLayout.class)
public class Grupo4View extends VerticalLayout {

    public Grupo4View() {
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
                "url(https://firebasestorage.googleapis.com/v0/b/imagenes-d40f0.appspot.com/o/banner%20circuito-electronico.jpg?alt=media&token=b8f00321-b5c5-4d6e-9b63-32f083fc5758&_gl=1*9ed221*_ga*MTgzMzU1OTEwNi4xNjk0NzMwNzcx*_ga_CW55HF8NVT*MTY5Njk4NDMyMC4xOS4xLjE2OTY5ODQ1NjUuNjAuMC4w\r\n"
                        + //
                        ")");

        H1 t1 = new H1("Grupo 4");
        H2 t2 = new H2("Algoritmos electrónica y electricidad");
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
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2FDanny%20Edison%20Idarraga.png?alt=media&token=237be993-4af6-436a-9cf2-aecce5daf345&_gl=1*1y8ve47*_ga*Njc3MDY0MDYzLjE2OTYzODAyMzQ.*_ga_CW55HF8NVT*MTY5NjM4MDIzNC4xLjEuMTY5NjM4MjQ2OS40LjAuMA..");
        est1.put("name", "Danny Idarraga");
        Map<String, String> est2 = new HashMap<>();
        est2.put("image",
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2Fperro-fotor-20231010204928.png?alt=media&token=0d57c7d5-571c-4c65-9788-92b01c840254&_gl=1*1q2van9*_ga*MTAyMjY3NzI1MC4xNjk1MTU5NTY0*_ga_CW55HF8NVT*MTY5NzA0MDkxOC4zLjEuMTY5NzA0MjI4MS41MC4wLjA.");
        est2.put("name", "Javier Boyacá");
        Map<String, String> est3 = new HashMap<>();
        est3.put("image",
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2Fperro-fotor-20231010204928.png?alt=media&token=0d57c7d5-571c-4c65-9788-92b01c840254&_gl=1*1q2van9*_ga*MTAyMjY3NzI1MC4xNjk1MTU5NTY0*_ga_CW55HF8NVT*MTY5NzA0MDkxOC4zLjEuMTY5NzA0MjI4MS41MC4wLjA.");
        est3.put("name", "Alejandro Aguirre");

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
        titulo2 = "JUEGO DE ADIVINANZA DE CODIGO DE COLORES DE LAS RESISTENCIAS";
        descripcion = "Programa para practicar el uso del código de colores en electrónica";
        gist = "gist  <script src=\"https://gist.github.com/dannyedison/bbde62865931f27ddf5e84be9bc1404b.js\"></script>\r\n"
                + //
                "";
        replit = "https://replit.com/@dannyedison75/Codigo1#Main.java";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/imagenes-d40f0.appspot.com/o/MainCodigo1.png?alt=media&token=6f23b8ed-74e5-44ee-9a7e-c13330cd97f5&_gl=1*dk1x5q*_ga*MTgzMzU1OTEwNi4xNjk0NzMwNzcx*_ga_CW55HF8NVT*MTY5Nzk4MDYwMC4yNC4xLjE2OTc5ODIzMzYuNTIuMC4w";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));
        // Algoritmo2
        titulo1 = "Algoritmo 2";
        titulo2 = "JUEGO DE ADIVINANZA DE CODIGO DE COLORES DE LAS RESISTENCIAS";
        descripcion = "Programa para practicar el uso del código de colores en electrónica";
        gist = "gist  <script src=\"https://gist.github.com/dannyedison/bbde62865931f27ddf5e84be9bc1404b.js\"></script>\r\n"
                + //
                "";
        replit = "https://replit.com/@dannyedison75/Codigo1#Main.java";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/imagenes-d40f0.appspot.com/o/MainCodigo1.png?alt=media&token=6f23b8ed-74e5-44ee-9a7e-c13330cd97f5&_gl=1*dk1x5q*_ga*MTgzMzU1OTEwNi4xNjk0NzMwNzcx*_ga_CW55HF8NVT*MTY5Nzk4MDYwMC4yNC4xLjE2OTc5ODIzMzYuNTIuMC4w";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo2(), gist, replit, diagrama));

    }

    public HorizontalLayout algoritmo1() {
        CalculadoraResistencias cr = new CalculadoraResistencias();

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        // Inicio vl1
        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://f47ec6e8ca.cbaul-cdnwnd.com/b9a0fcea3766057deaebf52a7956b29e/200000057-e1c97e3bbe/codigo%20de%20colores.png",
                ""));

        // Inicio vl2
        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);
        vl2.add(cr.calculadora());
        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }

    // Variables vl2
    int aleatorio;
    H2 h2ResultadoJuego;
    String colorObtenido;
    String mayuscula;
    String resultadoJuego;
    String[] colorAlmacenado = { "NEGRO", "CAFE", "ROJO", "NARANJA", "AMARILLO", "VERDE", "AZUL", "VIOLETA",
            "GRIS", "BLANCO" };

    // Variables vl3
    H1 h1ColorAleatorio;
    H3 h2ResultadoJuego2;
    int aleatorio2;
    double valor;
    String colorAleatorio;

    public HorizontalLayout algoritmo2() {

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        // Inicio vl1
        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image(
                "https://img.freepik.com/vector-premium/vector-resistencia-e-ilustracion-simbolo-componente-electronico-ciencias-educacion-fisica_786898-16.jpg",
                ""));

        vl1.add("RECUERDA QUE LOS COLORES SON!:  ");
        vl1.add(" VIOLETA, AMARILLO, CAFE, BLANCO, ROJO, GRIS, NARANJA, VERDE, NEGRO, AZUL. -  ");
        vl1.add(" Y LOS VALORES VAN DE 0 A 9");

        // Fin vl1

        // Inicio vl2

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        vl2.add("Presione el Botón 'Conocer Número' para saber que color debes adivinar:");
        // cajas de resultados
        H1 h1RespAleatorio = new H1("0");
        h2ResultadoJuego = new H2("0");

        // campo Ingresar texto del color
        TextField tfColorIngresado = new TextField("Ingrese Color:");

        // Boton activa Aleatorio
        Button btnConocerNumero = new Button("Conocer Número");
        btnConocerNumero.addClickListener(event -> {
            aleatorio = (int) (Math.random() * 10 + 0);
            h1RespAleatorio.setText(String.valueOf(aleatorio));
            h2ResultadoJuego.setText("0");
        });

        // Boton Jugar
        Button jugar = new Button("Jugar");
        jugar.addClickListener(event -> {
            mayuscula = tfColorIngresado.getValue(); // captura color
            colorObtenido = mayuscula.toUpperCase(); // cambia a mayusculas

            if (colorAlmacenado[aleatorio].equals(colorObtenido)) {

                h2ResultadoJuego.setText("Es correcto. ¡FELCITACIONES! :)"); // muestra resultado
            } else {
                h2ResultadoJuego.setText("Es incorrecto. ¡INTENTA DE NUEVO! :("); // muestra resultado
            }
        });
        // Fin vl2

        // Inicio vl3
        VerticalLayout vl3 = new VerticalLayout();
        vl3.setAlignItems(Alignment.CENTER);

        vl3.add("Presione el Botón 'Conocer Color' para saber que número debes adivinar:");

        // cajas de resultados
        h1ColorAleatorio = new H1("0");
        h2ResultadoJuego2 = new H3("0");

        // campo Ingresar valor del color
        NumberField nfValorIngresado = new NumberField("Ingrese Valor:");

        // Boton activa Aleatorio
        Button btnConocerColor = new Button("Conocer Color");
        btnConocerColor.addClickListener(event -> {
            aleatorio2 = (int) (Math.random() * 10 + 0);
            h1ColorAleatorio.setText(colorAlmacenado[aleatorio2]);
            h2ResultadoJuego2.setText("0");
        });

        // Boton Jugar
        Button jugar2 = new Button("Jugar");
        jugar2.addClickListener(event -> {
            valor = nfValorIngresado.getValue(); // captura valor

            if (valor == aleatorio2) {

                h2ResultadoJuego2.setText("Es correcto. ¡FELICITACIONES! :)"); // muestra resultado
            } else {
                h2ResultadoJuego2.setText("Es incorrecto. ¡INTENTA DE NUEVO! :("); // muestra resultado
            }
        });

        // Fin vl3

        vl2.add(btnConocerNumero); // boton conocer numero aleatorio
        vl2.add(h1RespAleatorio); // caja donde muestra numero aleatorio
        vl2.add(tfColorIngresado); // caja para ingresar el color
        vl2.add(jugar); // boton jugar
        vl2.add(h2ResultadoJuego); // caja de resultado del juego

        vl3.add(btnConocerColor); // boton conocer color aleatorio
        vl3.add(h1ColorAleatorio); // caja donde se muestra color
        vl3.add(nfValorIngresado); // caja para ingresar valor
        vl3.add(jugar2); // boton jugar
        vl3.add(h2ResultadoJuego2); // caja de resultado del juego

        hl.add(vl1);
        hl.add(vl2);
        hl.add(vl3);

        return hl;
    }

}
