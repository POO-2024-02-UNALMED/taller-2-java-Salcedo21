package test;


import java.util.ArrayList;

 class Auto {

    // Atributos
    String modelo;
    Integer precio;
    Asiento[] asientos ;
    String marca;
    Motor motor;
    Integer registro;
    static String cantidadCreados;

    public int cantidadAsientos(){
        int numAsientos = 0;

        for(int i= 0; i< asientos.length; i++) {
            if (asientos[i]!= null){
                numAsientos++;
            }

        }
        return numAsientos;
    }
    public String verificarIntegridad(){

        if(this.registro == this.motor.registro){
            for(int i= 0; i< asientos.length; i++){
                if ((asientos[i]!= null)&&(asientos[i].registro != this.registro) ){
                return "Las piezas no son originales";
            }

        }
            return "Auto original";
        } else {return "Las piezas no son originales";}
    }
}
