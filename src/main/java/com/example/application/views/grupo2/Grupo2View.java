package com.example.application.views.grupo2;

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

@PageTitle("Grupo 2")
@Route(value = "grupo-2", layout = MainLayout.class)
public class Grupo2View extends VerticalLayout {

    public Grupo2View() {
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
                "url(https://kmganalytics.com/wp-content/uploads/2021/10/RRSS-KMG-19-770x400.png)");

        H1 t1 = new H1("Grupo 2");
        H2 t2 = new H2("Finanzas");
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
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2FNatalia%20Alzate.png?alt=media&token=5da2038a-9674-46cb-9722-f30efb7e3771&_gl=1*67g1hk*_ga*Njc3MDY0MDYzLjE2OTYzODAyMzQ.*_ga_CW55HF8NVT*MTY5NjM4MDIzNC4xLjEuMTY5NjM4MTE4Ni42MC4wLjA.");
        est1.put("name", "Natalia Alzate");
        Map<String, String> est2 = new HashMap<>();
        est2.put("image",
                "https://firebasestorage.googleapis.com/v0/b/foto-perfil-67203.appspot.com/o/Proyecto_integrador_logica%2FFotos%2FRossember%20Restrepo.png?alt=media&token=83bcb57f-0cf3-49e8-b161-bed3103ff23f&_gl=1*1gn2mle*_ga*Njc3MDY0MDYzLjE2OTYzODAyMzQ.*_ga_CW55HF8NVT*MTY5NjM4MDIzNC4xLjEuMTY5NjM4MTIwOC4zOC4wLjA.");
        est2.put("name", "Rossember Restrepo");

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
        titulo1 = "Algoritmo1";
        titulo2 = "Simulador de ahorro";
        descripcion = "Este programa es un simulador de ahorros que te permite estimar cuánto dinero tendrás acumulado en una cuenta después de un periodo de tiempo determinado, considerando unos aportes periódicos y una tasa de interés efectiva anual.\r\n"
                + //
                "Finalmente conocerás el saldo acumulado después del periodo de tiempo indicado.\r\n" + //
                "";
        gist = "<script src=\"https://gist.github.com/Rossember01/63564f1e77b00ea92602cdde17a5a616.js\"></script>";
        replit = "https://replit.com/@rossember01/Simuladorahorro#Main.java";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/cesde-7fe22.appspot.com/o/Proyecto%20Integrador%2FDiagrama.svg?alt=media&token=e04cad73-fd1c-4972-a571-da1389d04689";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

        // Algoritmo2
        titulo1 = "Algoritmo2";
        titulo2 = " Calculadora CDT";
        descripcion = "Este programa es una calculadora de certificados de depósito a término (CDT), la cual recopila información del usuario, monto a invertir, tasa de interés anual, y el plazo en meses, para luego calcular y mostrar el valor futuro.";
        gist = "<script src=\"https://gist.github.com/Rossember01/61a6f6399da83e94c9b1f5b3da7ddd3a.js\"></script>\r\n" + //
                "";
        replit = "https://replit.com/@rossember01/CalculadoraCDT-1#Main.java";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/cesde-7fe22.appspot.com/o/Proyecto%20Integrador%2FDiagrama.svg?alt=media&token=e04cad73-fd1c-4972-a571-da1389d04689";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

        // Algoritmo3
        titulo1 = "Algoritmo3";
        titulo2 = "Simulador credito";
        descripcion = "  Este simulador de crédito te brinda una estimación de la cuota mensual a pagar y el costo total de dicho crédito, puedes ajustar la consulta y explorar las diferentes alternativas para encontrar la mejor opción que se adapte a tus necesidades y capacidad de pago.";
        gist = " <script src=\"https://gist.github.com/Rossember01/2bbcbf7ce451b108c6b1da44d5d8a07b.js\"></script>\r\n" + //
                "";
        replit = "https://replit.com/@rossember01/Simuladorcredito#Main.java";
        diagrama = "https://firebasestorage.googleapis.com/v0/b/cesde-7fe22.appspot.com/o/Proyecto%20Integrador%2FDiagrama.svg?alt=media&token=e04cad73-fd1c-4972-a571-da1389d04689";
        add(secciones.algoritmo(titulo1, titulo2, descripcion, algoritmo1(), gist, replit, diagrama));

    }

    public HorizontalLayout algoritmo1() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        vl1.add(new Image("https://static.tuasaude.com/media/article/me/dr/imc_15748_l.jpg", ""));

        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

        HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        NumberField periodicidad = new NumberField("Periodicidad");
        vl2.add(periodicidad);
        NumberField valorperiodico = new NumberField("Valor Periodico");
        vl2.add(valorperiodico);
        NumberField rentabilidadanual = new NumberField("Rentabilidad Efectiva Anual");
        vl2.add(rentabilidadanual);

        Button btnCalcular = new Button("Calcular");
        vl2.add(btnCalcular);

        H1 result = new H1("0");

        btnCalcular.addClickListener(event -> {
            double saldo = calcularSaldoAcumulado(periodicidad.getValue(), valorperiodico.getValue(),
                    rentabilidadanual.getValue(), 1);
            result.setText(String.valueOf(saldo));
        });

        vl2.add(result);

        hl.add(vl1);
        hl.add(vl2);
        return hl;
    }

    public double calcularSaldoAcumulado(double periodicidad, double valorperiodico, double rentabilidadanual,
            double año) {
        double tasaPeriodica = Math.pow(1 + rentabilidadanual, 1.0 / periodicidad) - 1;
        double periodosTotales = año * periodicidad;
        double saldo = valorperiodico;
        for (int periodo = 0; periodo < periodosTotales; periodo++) {
            saldo *= (1 + tasaPeriodica);
        }
        return saldo;
    }

}
