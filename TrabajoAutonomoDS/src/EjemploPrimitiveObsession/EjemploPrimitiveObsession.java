/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploPrimitiveObsession;

/**
 *
 * @author Josue
 */
public class EjemploPrimitiveObsession {
    
    public class Parlante{
        
        double volumen;
        double volumenMin;
        double volumenMax;
        double bajo;
        double treble;
        String codigoCarcasa;
        int numPuertos;

        public Parlante() {
        }

        public Parlante(double volumen, double volumenMin, double volumenMax, double bajo, double treble, String codigoCarcasa, int numPuertos) {
            this.volumen = volumen;
            this.volumenMin = volumenMin;
            this.volumenMax = volumenMax;
            this.bajo = bajo;
            this.treble = treble;
            this.codigoCarcasa = codigoCarcasa;
            this.numPuertos = numPuertos;
        }
        
        
        
    }
    
}
