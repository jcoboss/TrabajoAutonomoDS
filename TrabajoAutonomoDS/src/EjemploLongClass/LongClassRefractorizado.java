/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploLongClass;

import EjemploPrimitiveObsession.*;

/**
 *
 * @author Josue
 */
public class LongClassRefractorizado {
    
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
    
    public abstract class Parlante{
        
        Equalizador eq;
        String codigoCarcasa;
        int numPuertos;

        public abstract void emitirSonido(String secuenciaDeBits);
        
    }
    
    public class Amplificador extends Parlante{

        @Override
        public void emitirSonido(String secuenciaDeBits) {
            //Se genera el sonido
        }
        
        public void amplificarMicrofono(String numeroPuerto){
            
            //amplificarMicrofono
        }
        
    }
    
    public class ReproductorMp3 extends Parlante{

        @Override
        public void emitirSonido(String secuenciaDeBits) {
            //Se genera el sonido
        }
        
        public void reproducirMusica(String codigoCancion){
            
            //reproducirMusica
        }
        
        public void reproducirUSB(String usbCode){
            
            //reproducirUSB
        }
        
    }
    
    
    
}
