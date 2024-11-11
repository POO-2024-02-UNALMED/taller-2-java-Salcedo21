package test;

import java.util.List;

 class Asiento {

    //Atributos
    String color;
    Integer precio;
    Integer registro;

    void cambiarColor(String stri){

        if ((List.of("rojo", "verde", "amarillo", "negro", "blanco").contains(stri))) {
            this.color = stri;
        }
    }
}

