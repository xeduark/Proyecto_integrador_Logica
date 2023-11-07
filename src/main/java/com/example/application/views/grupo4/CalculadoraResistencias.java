package com.example.application.views.grupo4;

import java.text.DecimalFormat;
import java.util.ArrayList;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class CalculadoraResistencias {
    private String e2_color1 = "";
    private String e2_color2 = "";
    private String e2_color3 = "";
    private String e2_color4 = "";

    public HorizontalLayout calculadora() {

        VerticalLayout vl1 = new VerticalLayout();
        vl1.setAlignItems(Alignment.CENTER);
        VerticalLayout vl2 = new VerticalLayout();
        vl2.setAlignItems(Alignment.CENTER);

         HorizontalLayout hl = new HorizontalLayout();
        hl.setAlignItems(Alignment.CENTER);
        hl.setWidthFull();

        H4 t1R = new H4("Valor (Ohm)");
        H4 v1R = new H4("0");
        H4 t2R = new H4("Tolerancia (+-)");
        H4 v2R = new H4("0");

        ComboBox<String> comboBox1 = new ComboBox<>("Banda 1");
        comboBox1.setAllowCustomValue(true);
        vl1.add(comboBox1);
        comboBox1.setItems("Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Morado", "Gris", "Blanco");

        comboBox1.addValueChangeListener(event -> {
            e2_color1 = comboBox1.getValue();
            v1R.setText(calcularResitencia().get(0));
            v2R.setText(calcularResitencia().get(1));
        });

        ComboBox<String> comboBox2 = new ComboBox<>("Banda 2");
        comboBox2.setAllowCustomValue(true);
        vl1.add(comboBox2);
        comboBox2.setItems("Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Morado", "Gris", "Blanco");

        comboBox2.addValueChangeListener(event -> {
            e2_color2 = comboBox2.getValue();
            v1R.setText(calcularResitencia().get(0));
            v2R.setText(calcularResitencia().get(1));
        });

        ComboBox<String> comboBox3 = new ComboBox<>("Banda 3");
        comboBox3.setAllowCustomValue(true);
        vl1.add(comboBox3);
        comboBox3.setItems("Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Morado", "Gris", "Blanco");

        comboBox3.addValueChangeListener(event -> {
            e2_color3 = comboBox3.getValue();
            v1R.setText(calcularResitencia().get(0));
            v2R.setText(calcularResitencia().get(1));
        });

        ComboBox<String> comboBox4 = new ComboBox<>("Banda 3");
        comboBox4.setAllowCustomValue(true);
        vl1.add(comboBox4);
        comboBox4.setItems("Cafe", "Rojo", "Dorado", "Plateado");

        comboBox4.addValueChangeListener(event -> {
            e2_color4 = comboBox4.getValue();
            v1R.setText(calcularResitencia().get(0));
            v2R.setText(calcularResitencia().get(1));
        });

        vl1.add(comboBox1);
        vl1.add(comboBox2);
        vl1.add(comboBox3);
        vl1.add(comboBox4);

        vl2.add(t1R);
        vl2.add(v1R);
        vl2.add(t2R);
        vl2.add(v2R);
        hl.add(vl1);
        hl.add(vl2);

        return hl;
    }

    private ArrayList<String> calcularResitencia() {

        ArrayList<String> result = new ArrayList<>();
        int c1 = convertirColor(e2_color1);
        int c2 = convertirColor(e2_color2);
        int c3 = convertirColor(e2_color3);
        int c4 = convertirColor(e2_color4);

        if (c1 == 10 || c2 == 10 || c3 == 10 || c4 == 10) {
            result.add("Null");
            result.add("Null");
            return result;
        }

        double rValue = (c1 * 10) + c2;

        switch (c3) {
            case 0:
                rValue *= 1;
                break;
            case 1:
                rValue *= 10;
                break;
            case 2:
                rValue *= 100;
                break;
            case 3:
                rValue *= 1000;
                break;
            case 4:
                rValue *= 10000;
                break;
            case 5:
                rValue *= 100000;
                break;
            case 6:
                rValue *= 1000000;
                break;
            case 7:
                rValue /= 10;
                break;
            case 8:
                rValue /= 100;
                break;
            default:
                break;
        }

        double rTolerance = 0;

        switch (c4) {
            case 0:
                rTolerance = rValue * 0.01;
                break;
            case 1:
                rTolerance = rValue * 0.02;
                break;
            case 2:
                rTolerance = rValue * 0.05;
                break;
            case 3:
                rTolerance = rValue * 0.1;
                break;
        }

        String string_rValue = "";
        if (rValue > 1000) {
            rValue /= 1000;
            DecimalFormat df1 = new DecimalFormat("0.0");
            string_rValue = df1.format(rValue);
            string_rValue += "K";
        } else {
            DecimalFormat df1 = new DecimalFormat("0");
            string_rValue = df1.format(rValue);
        }

        DecimalFormat df2 = new DecimalFormat("0.0");
        String string_rTolerance = df2.format(rTolerance);

        result.add(string_rValue);
        result.add(string_rTolerance);
        return result;

    }

    private int convertirColor(String color) {
        int res = 0;
        switch (color) {
            case "Negro":
                res = 0;
                break;
            case "Cafe":
                res = 1;
                break;
            case "Rojo":
                res = 2;
                break;
            case "Naranja":
            case "Dorado":
                res = 3;
                break;
            case "Amarillo":
            case "Plateado":
                res = 4;
                break;
            case "Verde":
                res = 5;
                break;
            case "Azul":
                res = 6;
                break;
            case "Morado":
                res = 7;
                break;
            case "Gris":
                res = 8;
                break;
            case "Blanco":
                res = 9;
                break;
            default:
                res = 10;
                break;
        }
        return res;
    }
}
