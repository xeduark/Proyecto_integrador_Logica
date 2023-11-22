package com.example.application.views.grupo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
                                "url(https://firebasestorage.googleapis.com/v0/b/proyectoint-4cf64.appspot.com/o/WhatsApp%20Image%202023-10-10%20at%207.01.13%20PM.jpeg?alt=media&token=df390de5-860d-4b38-9f22-384ad15d71a9&_gl=1*32z3yj*_ga*MTUzNDM3NTE0OS4xNjk3MTU4MDEz*_ga_CW55HF8NVT*MTY5NzE1ODAxMy4xLjEuMTY5NzE1ODIxNy42MC4wLjA)");

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
                                "Utilice esta calculadora para averiguar el volumen y el área de una esfera utilizando el radio.\r\n"
                                + //
                                "";

                gist = "<script src=\"https://gist.github.com/ZullyVega/ecf6df1a098022a773b90d7ba7bce111.js\"></script>";
                replit = "https://replit.com/@zvegaon/Esfera#Main.java";
                diagrama = "https://firebasestorage.googleapis.com/v0/b/evidencialp.appspot.com/o/Algoritmo1.png?alt=media&token=1fa6d920-be66-4d6f-96cf-4d128cac9a2d&_gl=1*lifiqy*_ga*MjI2MzQ2NjM4LjE2OTgxODc1OTU.*_ga_CW55HF8NVT*MTY5ODE4NzU5NS4xLjEuMTY5ODE4ODE2Mi41NS4wLjA";
                add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

                // Algoritmo2
                titulo1 = "Algoritmo 2";
                titulo2 = "Calculadora del área del triángulo, media y desviación estándar de números.";
                descripcion = "La Calculadora del área del triángulo, media y desviación estándar de números es una herramienta versátil que combina tres funciones matemáticas fundamentales.";
                gist = "<script src=\"https://gist.github.com/ZullyVega/ecf6df1a098022a773b90d7ba7bce111.js\"></script>";
                replit = "https://replit.com/@zvegaon/Esfera#Main.java";
                diagrama = "https://firebasestorage.googleapis.com/v0/b/evidencialp.appspot.com/o/code2flow_dEVuPL.png?alt=media&token=f2d663b1-6215-4367-84ef-c9c11d737e68";
                add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo2(), gist, replit, diagrama));

        }

        public HorizontalLayout algoritmo1() {

                VerticalLayout vl1 = new VerticalLayout();
                vl1.setAlignItems(Alignment.CENTER);
                vl1.add(new Image(
                                "https://firebasestorage.googleapis.com/v0/b/pi-equipo-1.appspot.com/o/41a1bf22-4bed-4d9b-8eef-c1417746ef65.jfif?alt=media&token=4897e9e3-6150-444f-907a-18cd6c374f97&_gl=1*1gas3p4*_ga*Mzk3NDA0NzI5LjE2OTY5ODUxNTI.*_ga_CW55HF8NVT*MTY5Njk4NTE1Mi4xLjEuMTY5Njk4NTQyNy42LjAuMA..",
                                ""));
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
                        mensaje.setText("El volumen de la esfera es : "
                                        + String.valueOf((double) Math.round(Resultado * 100d) / 100));

                        double result2 = 4.0 * Math.PI * Math.pow(valorRadio, 2);
                        mensajeArea.setText("El área de la esfera es : "
                                        + String.valueOf((double) Math.round(result2 * 100) / 100));
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

        int modo = 0;
        int cantidadNumeros = 0;
        int capturaDatos = 0;
        double[] numeros;

        public HorizontalLayout algoritmo2() {

                VerticalLayout vl1 = new VerticalLayout();
                vl1.setAlignItems(Alignment.CENTER);
                vl1.add(new Image(
                                "https://firebasestorage.googleapis.com/v0/b/pi-equipo-1.appspot.com/o/41a1bf22-4bed-4d9b-8eef-c1417746ef65.jfif?alt=media&token=4897e9e3-6150-444f-907a-18cd6c374f97&_gl=1*1gas3p4*_ga*Mzk3NDA0NzI5LjE2OTY5ODUxNTI.*_ga_CW55HF8NVT*MTY5Njk4NTE1Mi4xLjEuMTY5Njk4NTQyNy42LjAuMA..",
                                ""));
                VerticalLayout vl2 = new VerticalLayout();
                vl2.setAlignItems(Alignment.CENTER);

                HorizontalLayout hl = new HorizontalLayout();
                hl.setAlignItems(Alignment.CENTER);
                hl.setWidthFull();

                Button btn = new Button("");
                btn.setVisible(false);

                NumberField valor1 = new NumberField("");
                valor1.setVisible(false);

                NumberField valor2 = new NumberField("");
                valor2.setVisible(false);

                ComboBox<String> comboBox = new ComboBox<>("Tipo");
                comboBox.setAllowCustomValue(true);

                H3 mensaje1 = new H3("");
                H3 mensaje2 = new H3("");

                comboBox.setItems("Calcular el área de un triángulo",
                                "Calcular la media y desviación estándar de una lista de números");

                comboBox.addValueChangeListener(event -> {
                        String select = comboBox.getValue();
                        if (select.equals("Calcular el área de un triángulo")) {
                                modo = 0;
                                mensaje1.setText("Calcular el área de un triángulo");
                                btn.setVisible(true);
                                btn.setText("Calcular");
                                valor1.setLabel("Base");
                                valor1.setVisible(true);
                                valor1.setValue(null);
                                valor2.setLabel("Altura");
                                valor2.setVisible(true);
                                valor2.setValue(null);
                        }
                        if (select.equals("Calcular la media y desviación estándar de una lista de números")) {
                                modo = 1;
                                mensaje1.setText("Calcular la media y desviación estándar de una lista de números");
                                btn.setVisible(true);
                                btn.setText("Ingresar");
                                valor1.setLabel("Cantidad de números");
                                valor1.setVisible(true);
                                valor1.setValue(null);
                                valor2.setVisible(false);
                                valor2.setValue(null);
                        }
                });

                btn.addClickListener(event -> {
                        if (modo == 0) {
                                if (valor1.getValue() != null && valor2.getValue() != null) {
                                        double temp = calcularAreaTriangulo(valor1.getValue().doubleValue(),
                                                        valor2.getValue().doubleValue());
                                        mensaje2.setText(String.valueOf(temp));
                                        valor1.setValue(null);
                                        valor2.setValue(null);
                                }
                        }
                        if (modo == 1) {
                                if (valor1.getValue() != null && (int) valor1.getValue().doubleValue() > 0) {
                                        if (capturaDatos == 0) {
                                                cantidadNumeros = (int) valor1.getValue().doubleValue();
                                                numeros = new double[cantidadNumeros];
                                                capturaDatos++;
                                                valor1.setLabel("Ingrese 1");
                                                valor1.setValue(null);
                                        } else {
                                                if (capturaDatos < cantidadNumeros) {
                                                        numeros[capturaDatos - 1] = valor1.getValue().doubleValue();
                                                        valor1.setLabel("Ingrese " + String.valueOf(capturaDatos + 1));
                                                        capturaDatos++;
                                                } else {
                                                        double[] estadisticas = calcularEstadisticas(numeros);
                                                        String temp = "La media de los números es: "
                                                                        + String.valueOf(estadisticas[0])
                                                                        + " La desviación estándar de los números es: "
                                                                        + String.valueOf(estadisticas[1]);
                                                        mensaje2.setText(temp);
                                                }
                                        }

                                }
                        }
                });

                vl2.add(mensaje1);
                vl2.add(comboBox);
                vl2.add(valor1);
                vl2.add(valor2);
                vl2.add(btn);
                vl2.add(mensaje2);

                hl.add(vl1);
                hl.add(vl2);
                return hl;

        }

        public double calcularAreaTriangulo(double base, double altura) {
                return 0.5 * base * altura;
        }

        public double[] calcularEstadisticas(double[] datos) {
                double[] estadisticas = new double[2];
                double suma = 0;
                for (double dato : datos) {
                        suma += dato;
                }
                double media = suma / datos.length;
                double sumaDiferencias = 0;
                for (double dato : datos) {
                        sumaDiferencias += Math.pow(dato - media, 2);
                }
                double desviacionEstandar = Math.sqrt(sumaDiferencias / (datos.length - 1));
                estadisticas[0] = media;
                estadisticas[1] = desviacionEstandar;
                return estadisticas;
        }

}