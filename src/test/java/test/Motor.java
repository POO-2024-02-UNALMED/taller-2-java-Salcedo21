package test;

import java.util.List;

class Motor {

    Integer numerosCilindros;
    String tipo;
    Integer registro;

    void cambiarRegistro(Integer entero){

        this.registro = entero;
    }
    void asignarTipo(String str){
        if ((List.of("electrico","gasolina").contains(str))) {
            this.tipo = str;
        }
    }

}
