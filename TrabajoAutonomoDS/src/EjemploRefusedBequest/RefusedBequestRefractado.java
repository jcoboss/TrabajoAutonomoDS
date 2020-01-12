/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploRefusedBequest;

import javafx.scene.paint.Color;

/**
 *
 * @author Josue
 */
public class RefusedBequestRefractado {
    
    public class Rueda{
        
        double diametro;
        Color color;
        String serie;

        public Rueda() {
        }

        public Rueda(double diametro, Color color, String serie) {
            this.diametro = diametro;
            this.color = color;
            this.serie = serie;
        }
        
        
    }
    
    public class Mouse{
        
        Rueda rueda;
        //otros atributos

        public Mouse() {
            rueda=new Rueda();
        }
        
        public void scroll(){
            //hace scroll
        }
    }
    public class Bicicleta{
        
        Rueda rueda;
        //otros atributos

        public Bicicleta() {
            rueda=new Rueda();
        }
        public void inflarRueda(){
            
            //se infla la rueda
        }
        
    }
    
}
