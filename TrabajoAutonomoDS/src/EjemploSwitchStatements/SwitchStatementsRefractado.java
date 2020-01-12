/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploSwitchStatements;

import java.util.Random;

/**
 *
 * @author Josue
 */
public class SwitchStatementsRefractado {
    
    
    public class Ambiente3D{
        
        Random rd;
        Integer [][][]array3d;
        int longitud;

        public Ambiente3D() {
            array3d=new Integer[longitud][longitud][longitud];
            
        }
        
        public void agregarObstaculoAlMapa(int arista ){
            
            int x=rd.nextInt(100);
            int y=rd.nextInt(100);
            int z=rd.nextInt(100);
            boolean f =(3!=2);
            if (noHayObstaculosEnEsquinas(x, y, z, arista)){
                
                if(estaDentroDeRango(x, y, z, arista) ){
                    
                    //insetarObstaculoa
                }
            }  
        }
        
        private boolean noHayObstaculosEnEsquinas(int x, int y, int z,int arista){
            return array3d[x][y][z]!=1 &&  array3d[x+arista][y+arista][z+arista]!=1 
                && array3d[x + arista][y + arista][z ] != 1 && array3d[x+arista][y][z+arista]!=1 
                && array3d[x][y+arista][z+arista]!=1 && array3d[x][y][z+arista]!=1
                && array3d[x][y+arista][z]!=1 && array3d[x+arista][y][z]!=1;
            
        }
        public boolean estaDentroDeRango(int x,int y, int z, int arista){
            
            return x + arista < longitud && y + arista < longitud && z + arista < longitud;
        }
           
        
    }
    
}
