/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UT03.TA2;

/**
 *
 * @author kevin
 */
public class Main {

    /**
     *
     * @param args
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Cambiar ruta a donde se quiera
        String ruta = "D:\\My docs - Kev\\Books and files - UCU\\Algoritmos y Estructuras de Datos\\Weas de trabajo de aplicacion\\archivos_almacen";
        String[] lineas = ManejadorArchivosGenerico.LeerArchivo(ruta);
        
        for (int i=0;i<lineas.length;i++){
            String[] lineaProd = lineas[i].split(",");
            //Nodo producto = new Nodo(lineaProd[0],lineaProd[1],lineaProd[2],lineaProd[3])
            //Implementacion en nodo u producto?
            
        }
    }
}
