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
public class PrimitiveObsessionRefractorizado {
    
    public class Equalizador{
        
        double volumen;
        double volumenMin;
        double volumenMax;
        double bajo;
        double treble;

        public Equalizador() {
        }

        public Equalizador(double volumen, double volumenMin, double volumenMax, double bajo, double treble) {
            this.volumen = volumen;
            this.volumenMin = volumenMin;
            this.volumenMax = volumenMax;
            this.bajo = bajo;
            this.treble = treble;
        }

    }
    
    public class Parlante{
        
        Equalizador eq;
        String codigoCarcasa;
        int numPuertos;

        public Parlante() {
        }

        public Parlante(Equalizador eq, String codigoCarcasa, int numPuertos) {
            this.eq = eq;
            this.codigoCarcasa = codigoCarcasa;
            this.numPuertos = numPuertos;
        }

    }
    
}
