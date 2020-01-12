/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploShotgunSurgery;

import javafx.scene.paint.Color;


/**
 *
 * @author Josue
 */
public class ShotgunSurgeryRefractado {
    
    public static class Constantes{
        
        static Color colorDefecto=Color.WHITE;
        
    }
    
    public class Lienzo{
        
        Color color;
        public Lienzo() {
            color=Constantes.colorDefecto;
        }
        
        
        
    }
    
    public class Figura3D{

        Color color;
        public Figura3D() {
            color=Constantes.colorDefecto;
        }
    
    
    }
    
    public class Figura2D{

        Color color;
        public Figura2D() {
             color=Constantes.colorDefecto;
        }
        
        
    }
    
    
}
